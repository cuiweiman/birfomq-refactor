package com.zachary.bifromq.basekv.raft;

import com.zachary.bifromq.basekv.raft.exception.ClusterConfigChangeException;
import com.zachary.bifromq.basekv.raft.proto.ClusterConfig;
import com.zachary.bifromq.basekv.raft.proto.LogEntry;
import com.zachary.bifromq.basekv.raft.proto.RaftNodeSyncState;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

/**
 * The cluster config change process goes through following phases:
 * <pre>
 *  1. [catching up] new added voters and learners act as non-voting members, and catching up with leader by
 *     receiving replicated log entries from leader. cluster change is not appended to log in this phase, so it's
 *     transient.
 *  2. [joint consensus] when leader confirmed that the added members in "pending" change are sufficiently
 *     catching-up, it will append a joint-consensus cluster config as a log entry and replicated to all
 *     peers in new config.
 *  3. [new config] once the log entry of joint-consensus cluster config has been committed, "current" leader will
 *     append the target cluster config as a log entry and replicated to followers and learners.
 *  4. [committed] once the log entry of target cluster config has been committed locally, the pending completable
 *     future(if any) could be completed.
 *  IMPLEMENTATION NOTES:
 *  *  "catching up" is formulated as (lastIndex - nextIndex) / nextIndexIncreasingRate <= electionTimeout
 *  *  only one cluster config process could run at the same time, so leader should check if the pending is null
 *     and if the latest cluster config is not in Joint-Consensus Mode and it is committed.
 *  *  if any new server is not catching up in catchingUpTimeoutTick, the process will be aborted by reporting
 *     slow learner exception.
 *  *  if the process aborted in #1, remove no used peer replicator tracked previously.
 *  *  catchingUpTimeoutTick is determined by considering installSnapshotTimeoutTick & electionTimeoutTick
 *  *  the server that accepting change cluster config request in leader state, and may not still in
 *     leadership when the process has outcome. so the pending config task should be preserved during state
 *     transfer.
 *  *  when the process has outcome, server(no matter what state it's current in) should check if
 *     currentClusterConfigEntryIndex is still pointing to a desired cluster config after the index is
 *     committed.
 *  *  followers(even learners) could also accept cluster config change request if LeaderForward flag is enabled.
 *  </pre>
 */
class RaftConfigChanger {
    enum State {
        Abort, // the terminated state
        Waiting, // changer could accept submission of new config change
        CatchingUp, // catching up new voters in new submitted config
        JointConfigCommitting, // joint config is appended as log entry and waiting to be committed
        TargetConfigCommitting // target config is appended as log entry and waiting to be committed
    }

    private volatile State state = State.Waiting;
    private volatile CompletableFuture<Void> onDone;
    private long catchingUpElapsedTick = 0;
    private long jointConfigIndex = 0;
    private long targetConfigIndex = 0;
    private ClusterConfig jointConfig;
    private ClusterConfig targetConfig;
    private final RaftConfig config;
    private final IRaftStateStore stateStorage;
    private final PeerLogTracker peerLogTracker;
    private final IRaftNodeLogger logger;

    RaftConfigChanger(RaftConfig config,
                      IRaftStateStore stateStorage,
                      PeerLogTracker peerLogTracker,
                      IRaftNodeLogger logger) {
        this.config = config;
        this.stateStorage = stateStorage;
        this.peerLogTracker = peerLogTracker;
        this.logger = logger;
    }

    public State state() {
        return state;
    }

    public void submit(String correlateId,
                       Set<String> nextVoters,
                       Set<String> nextLearners,
                       CompletableFuture<Void> onDone) {
        assert state != State.Abort;
        try {
            if (state != State.Waiting) {
                throw ClusterConfigChangeException.CONCURRENT_CHANGE;
            }
            if (nextVoters.isEmpty()) {
                throw ClusterConfigChangeException.EMPTY_VOTERS;
            }
            if (isIntersect(nextVoters, nextLearners)) {
                throw ClusterConfigChangeException.LEARNERS_OVERLAP;
            }
            this.onDone = onDone;

            jointConfig = stateStorage.latestClusterConfig().toBuilder()
                .setCorrelateId(correlateId)
                .addAllNextVoters(nextVoters)
                .addAllNextLearners(nextLearners)
                .build();
            targetConfig = ClusterConfig.newBuilder()
                .setCorrelateId(correlateId)
                .addAllVoters(nextVoters)
                .addAllLearners(nextLearners)
                .build();
            // track newly added servers
            Set<String> peersToStartTracking = new HashSet<>(nextVoters);
            peersToStartTracking.addAll(nextLearners);
            peerLogTracker.startTracking(peersToStartTracking, true);
            // reset catching up timer
            catchingUpElapsedTick = 0;
            jointConfigIndex = 0;
            targetConfigIndex = 0;
            state = State.CatchingUp;
        } catch (Throwable e) {
            onDone.completeExceptionally(e);
        }
    }

    /**
     * It's leader's responsibility to call this method on each tick
     *
     * @param currentTerm leader's current term
     * @return if there is a state change
     */
    public boolean tick(long currentTerm) {
        assert state != State.Abort;
        if (state == State.CatchingUp) {
            catchingUpElapsedTick++;
            // enough time for installing snapshot plus 10 times electionTimeout for digesting log entries
            // accumulated
            if (catchingUpElapsedTick >=
                config.getInstallSnapshotTimeoutTick() + 10L * config.getElectionTimeoutTick()) {
                logger.logTrace("Catching up timeout, give up changing config");

                // report exception, unregister replicators and transit to Waiting state
                Set<String> peersToStopTracking = new HashSet<>(jointConfig.getNextVotersList());
                peersToStopTracking.addAll(jointConfig.getNextLearnersList());
                peersToStopTracking.removeIf(jointConfig.getVotersList()::contains);
                peersToStopTracking.removeIf(jointConfig.getLearnersList()::contains);

                peerLogTracker.stopTracking(peersToStopTracking);
                state = State.Waiting;
                onDone.completeExceptionally(ClusterConfigChangeException.SLOW_LEARNER);
                return true;
            } else {
                if (peersCatchUp()) {
                    if (noChangeJoint(jointConfig)) {
                        targetConfigIndex = stateStorage.lastIndex() + 1;
                        logger.logTrace("Peers have caught up, append target config as log entry[index={}]",
                            targetConfigIndex);
                        LogEntry targetConfigEntry = LogEntry.newBuilder()
                            .setTerm(currentTerm)
                            .setIndex(targetConfigIndex)
                            .setConfig(targetConfig)
                            .build();
                        // flush the log entry immediately
                        stateStorage.append(Collections.singletonList(targetConfigEntry), true);
                        // update self progress
                        peerLogTracker.replicateBy(stateStorage.local(), stateStorage.lastIndex());
                        // mark the next voters in pending config have been caught-up with the leader
                        state = State.TargetConfigCommitting;
                    } else {
                        // append joint-consensus config as a log entry then replicated to peers in parallel
                        jointConfigIndex = stateStorage.lastIndex() + 1;
                        logger.logTrace("Peers have caught up, append joint config as log entry[index={}]",
                            jointConfigIndex);
                        LogEntry jointConfigEntry = LogEntry.newBuilder()
                            .setTerm(currentTerm)
                            .setIndex(jointConfigIndex)
                            .setConfig(jointConfig)
                            .build();
                        // flush the log entry immediately
                        stateStorage.append(Collections.singletonList(jointConfigEntry), true);
                        // update self progress
                        peerLogTracker.replicateBy(stateStorage.local(), stateStorage.lastIndex());
                        // mark the next voters in pending config have been caught-up with the leader
                        state = State.JointConfigCommitting;
                    }
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    /**
     * Leader must call this method to report current commitIndex and currentTerm, The return bool indicates if there is
     * a state change, Leader must examine the status afterwards and take corresponding actions.
     *
     * @param commitIndex committed index
     * @param currentTerm current term
     * @return a boolean indicate if state has been changed
     */
    public boolean commitTo(long commitIndex, long currentTerm) {
        assert state != State.Abort;
        switch (state) {
            case JointConfigCommitting:
                if (commitIndex >= jointConfigIndex) {
                    targetConfigIndex = stateStorage.lastIndex() + 1;
                    assert commitIndex < targetConfigIndex;
                    LogEntry targetConfigEntry = LogEntry.newBuilder()
                        .setTerm(currentTerm)
                        .setIndex(targetConfigIndex)
                        .setConfig(targetConfig)
                        .build();
                    // flush the log entry immediately
                    stateStorage.append(Collections.singletonList(targetConfigEntry), true);
                    // update self progress
                    peerLogTracker.replicateBy(stateStorage.local(), stateStorage.lastIndex());
                    // mark the next voters in pending config have been caught-up with the leader
                    state = State.TargetConfigCommitting;
                    logger.logDebug("Joint config committed, append target config as log entry[index={}]",
                        targetConfigIndex);
                    return true;
                }
                return false;
            case TargetConfigCommitting:
                if (commitIndex >= targetConfigIndex) {
                    state = State.Waiting;
                    logger.logDebug("Target config committed at index[{}]", targetConfigIndex);
                    return true;
                }
                return false;
            case Waiting:
            case CatchingUp:
            default:
                return false;
        }
    }

    /**
     * This method must be called when caller finishes handling TargetConfig committing
     */
    public void confirmCommit(boolean notifyRepStatus) {
        assert state == State.Waiting && targetConfig != null;
        // config change succeeds, unregister removed peers
        peerLogTracker.stopTracking(peerId ->
            !targetConfig.getVotersList().contains(peerId)
                && !targetConfig.getLearnersList().contains(peerId), notifyRepStatus);
        onDone.complete(null);
    }

    protected Set<String> remotePeers() {
        Set<String> all = new HashSet<>();
        switch (state) {
            case Waiting:
                ClusterConfig clusterConfig = stateStorage.latestClusterConfig();
                all.addAll(clusterConfig.getVotersList());
                all.addAll(clusterConfig.getLearnersList());
                all.remove(stateStorage.local());
                break;
            case CatchingUp:
            case JointConfigCommitting:
            case TargetConfigCommitting:
                all.addAll(jointConfig.getVotersList());
                all.addAll(jointConfig.getLearnersList());
                all.addAll(jointConfig.getNextVotersList());
                all.addAll(jointConfig.getNextLearnersList());
                all.remove(stateStorage.local());
                break;
        }
        return all;
    }

    public ClusterConfig prevConfig() {
        return jointConfig;
    }

    /**
     * Once aborted, the instance could not be reused anymore
     */
    public void abort() {
        assert state != State.Abort;
        switch (state) {
            case Waiting:
                state = State.Abort;
                return;
            case CatchingUp:
            case TargetConfigCommitting:
            case JointConfigCommitting:
                logger.logDebug("Abort on-going cluster config change");
                state = State.Abort;
                onDone.completeExceptionally(ClusterConfigChangeException.LEADER_STEP_DOWN);
        }
    }

    boolean peersCatchUp() {
        Set<String> remotePeers = new HashSet<>(jointConfig.getNextVotersList());
        // local is always considered catchup
        return quorumCatchUp(remotePeers);
    }

    boolean quorumCatchUp(Set<String> peerIds) {
        // if the majority of next voters are sufficiently catching-up
        long lastIndex = stateStorage.lastIndex();
        int nonCatchUpCount = 0;
        for (String peerId : peerIds) {
            if (peerLogTracker.status(peerId) != RaftNodeSyncState.Replicating) {
                // only tracking peer in replicating status, we can draw a conclusion about the catch-up progress
                nonCatchUpCount++;
            } else {
                long matchIndex = peerLogTracker.matchIndex(peerId);
                if (lastIndex == matchIndex) {
                    // all log entries have been replicated
                    continue;
                }
                if (peerLogTracker.catchupRate(peerId) > 0) {
                    long notReplicated = lastIndex - matchIndex;
                    long ticksRequired = notReplicated / peerLogTracker.catchupRate(peerId);
                    if (ticksRequired > config.getElectionTimeoutTick()) {
                        nonCatchUpCount++;
                    }
                    // if all rest log entries could be replicated in one electionTimeout period,
                    // then we can guarantee the unavailable gap is within one electionTimeout period
                } else {
                    // no information about the catchup rate
                    nonCatchUpCount++;
                }
            }
        }
        return nonCatchUpCount <= peerIds.size() - (peerIds.size() / 2 + 1);
    }

    boolean noChangeJoint(ClusterConfig clusterConfig) {
        return (new HashSet<>(clusterConfig.getNextVotersList()))
            .equals(new HashSet<>(clusterConfig.getVotersList())) &&
            (new HashSet<>(clusterConfig.getNextLearnersList())
                .equals(new HashSet<>(clusterConfig.getLearnersList())));
    }

    <T> boolean isIntersect(Set<T> s1, Set<T> s2) {
        Set<T> small = s1.size() > s2.size() ? s2 : s1;
        Set<T> large = s1.size() > s2.size() ? s1 : s2;
        for (T item : small) {
            if (large.contains(item)) {
                return true;
            }
        }
        return false;
    }
}
