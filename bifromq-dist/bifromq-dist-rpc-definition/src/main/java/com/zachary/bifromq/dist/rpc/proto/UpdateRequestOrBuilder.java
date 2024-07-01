// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: distservice/DistCoProc.proto

package com.zachary.bifromq.dist.rpc.proto;

public interface UpdateRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:distservice.UpdateRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 reqId = 1;</code>
   * @return The reqId.
   */
  long getReqId();

  /**
   * <code>optional .distservice.AddTopicFilter addTopicFilter = 2;</code>
   * @return Whether the addTopicFilter field is set.
   */
  boolean hasAddTopicFilter();
  /**
   * <code>optional .distservice.AddTopicFilter addTopicFilter = 2;</code>
   * @return The addTopicFilter.
   */
  com.zachary.bifromq.dist.rpc.proto.AddTopicFilter getAddTopicFilter();
  /**
   * <code>optional .distservice.AddTopicFilter addTopicFilter = 2;</code>
   */
  com.zachary.bifromq.dist.rpc.proto.AddTopicFilterOrBuilder getAddTopicFilterOrBuilder();

  /**
   * <code>optional .distservice.RemoveTopicFilter removeTopicFilter = 3;</code>
   * @return Whether the removeTopicFilter field is set.
   */
  boolean hasRemoveTopicFilter();
  /**
   * <code>optional .distservice.RemoveTopicFilter removeTopicFilter = 3;</code>
   * @return The removeTopicFilter.
   */
  com.zachary.bifromq.dist.rpc.proto.RemoveTopicFilter getRemoveTopicFilter();
  /**
   * <code>optional .distservice.RemoveTopicFilter removeTopicFilter = 3;</code>
   */
  com.zachary.bifromq.dist.rpc.proto.RemoveTopicFilterOrBuilder getRemoveTopicFilterOrBuilder();

  /**
   * <code>optional .distservice.InsertMatchRecord insertMatchRecord = 4;</code>
   * @return Whether the insertMatchRecord field is set.
   */
  boolean hasInsertMatchRecord();
  /**
   * <code>optional .distservice.InsertMatchRecord insertMatchRecord = 4;</code>
   * @return The insertMatchRecord.
   */
  com.zachary.bifromq.dist.rpc.proto.InsertMatchRecord getInsertMatchRecord();
  /**
   * <code>optional .distservice.InsertMatchRecord insertMatchRecord = 4;</code>
   */
  com.zachary.bifromq.dist.rpc.proto.InsertMatchRecordOrBuilder getInsertMatchRecordOrBuilder();

  /**
   * <code>optional .distservice.JoinMatchGroup joinMatchGroup = 5;</code>
   * @return Whether the joinMatchGroup field is set.
   */
  boolean hasJoinMatchGroup();
  /**
   * <code>optional .distservice.JoinMatchGroup joinMatchGroup = 5;</code>
   * @return The joinMatchGroup.
   */
  com.zachary.bifromq.dist.rpc.proto.JoinMatchGroup getJoinMatchGroup();
  /**
   * <code>optional .distservice.JoinMatchGroup joinMatchGroup = 5;</code>
   */
  com.zachary.bifromq.dist.rpc.proto.JoinMatchGroupOrBuilder getJoinMatchGroupOrBuilder();

  /**
   * <code>optional .distservice.DeleteMatchRecord deleteMatchRecord = 6;</code>
   * @return Whether the deleteMatchRecord field is set.
   */
  boolean hasDeleteMatchRecord();
  /**
   * <code>optional .distservice.DeleteMatchRecord deleteMatchRecord = 6;</code>
   * @return The deleteMatchRecord.
   */
  com.zachary.bifromq.dist.rpc.proto.DeleteMatchRecord getDeleteMatchRecord();
  /**
   * <code>optional .distservice.DeleteMatchRecord deleteMatchRecord = 6;</code>
   */
  com.zachary.bifromq.dist.rpc.proto.DeleteMatchRecordOrBuilder getDeleteMatchRecordOrBuilder();

  /**
   * <code>optional .distservice.LeaveMatchGroup leaveMatchGroup = 7;</code>
   * @return Whether the leaveMatchGroup field is set.
   */
  boolean hasLeaveMatchGroup();
  /**
   * <code>optional .distservice.LeaveMatchGroup leaveMatchGroup = 7;</code>
   * @return The leaveMatchGroup.
   */
  com.zachary.bifromq.dist.rpc.proto.LeaveMatchGroup getLeaveMatchGroup();
  /**
   * <code>optional .distservice.LeaveMatchGroup leaveMatchGroup = 7;</code>
   */
  com.zachary.bifromq.dist.rpc.proto.LeaveMatchGroupOrBuilder getLeaveMatchGroupOrBuilder();

  /**
   * <code>optional .distservice.ClearSubInfo clearSubInfo = 8;</code>
   * @return Whether the clearSubInfo field is set.
   */
  boolean hasClearSubInfo();
  /**
   * <code>optional .distservice.ClearSubInfo clearSubInfo = 8;</code>
   * @return The clearSubInfo.
   */
  com.zachary.bifromq.dist.rpc.proto.ClearSubInfo getClearSubInfo();
  /**
   * <code>optional .distservice.ClearSubInfo clearSubInfo = 8;</code>
   */
  com.zachary.bifromq.dist.rpc.proto.ClearSubInfoOrBuilder getClearSubInfoOrBuilder();
}
