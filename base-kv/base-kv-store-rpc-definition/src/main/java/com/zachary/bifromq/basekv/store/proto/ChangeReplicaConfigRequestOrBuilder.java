// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: basekv/BaseKVStoreService.proto

package com.zachary.bifromq.basekv.store.proto;

public interface ChangeReplicaConfigRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:basekv.ChangeReplicaConfigRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 reqId = 1;</code>
   * @return The reqId.
   */
  long getReqId();

  /**
   * <code>uint64 ver = 2;</code>
   * @return The ver.
   */
  long getVer();

  /**
   * <code>.basekv.KVRangeId kvRangeId = 3;</code>
   * @return Whether the kvRangeId field is set.
   */
  boolean hasKvRangeId();
  /**
   * <code>.basekv.KVRangeId kvRangeId = 3;</code>
   * @return The kvRangeId.
   */
  com.zachary.bifromq.basekv.proto.KVRangeId getKvRangeId();
  /**
   * <code>.basekv.KVRangeId kvRangeId = 3;</code>
   */
  com.zachary.bifromq.basekv.proto.KVRangeIdOrBuilder getKvRangeIdOrBuilder();

  /**
   * <code>repeated string newVoters = 4;</code>
   * @return A list containing the newVoters.
   */
  java.util.List<java.lang.String>
      getNewVotersList();
  /**
   * <code>repeated string newVoters = 4;</code>
   * @return The count of newVoters.
   */
  int getNewVotersCount();
  /**
   * <code>repeated string newVoters = 4;</code>
   * @param index The index of the element to return.
   * @return The newVoters at the given index.
   */
  java.lang.String getNewVoters(int index);
  /**
   * <code>repeated string newVoters = 4;</code>
   * @param index The index of the value to return.
   * @return The bytes of the newVoters at the given index.
   */
  com.google.protobuf.ByteString
      getNewVotersBytes(int index);

  /**
   * <code>repeated string newLearners = 5;</code>
   * @return A list containing the newLearners.
   */
  java.util.List<java.lang.String>
      getNewLearnersList();
  /**
   * <code>repeated string newLearners = 5;</code>
   * @return The count of newLearners.
   */
  int getNewLearnersCount();
  /**
   * <code>repeated string newLearners = 5;</code>
   * @param index The index of the element to return.
   * @return The newLearners at the given index.
   */
  java.lang.String getNewLearners(int index);
  /**
   * <code>repeated string newLearners = 5;</code>
   * @param index The index of the value to return.
   * @return The bytes of the newLearners at the given index.
   */
  com.google.protobuf.ByteString
      getNewLearnersBytes(int index);
}
