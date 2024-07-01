// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: basekv/Command.proto

package com.zachary.bifromq.basekv.proto;

public interface KVRangeCommandOrBuilder extends
    // @@protoc_insertion_point(interface_extends:basekv.KVRangeCommand)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string taskId = 1;</code>
   * @return The taskId.
   */
  java.lang.String getTaskId();
  /**
   * <code>string taskId = 1;</code>
   * @return The bytes for taskId.
   */
  com.google.protobuf.ByteString
      getTaskIdBytes();

  /**
   * <code>uint64 ver = 2;</code>
   * @return The ver.
   */
  long getVer();

  /**
   * <code>.basekv.ChangeConfig changeConfig = 4;</code>
   * @return Whether the changeConfig field is set.
   */
  boolean hasChangeConfig();
  /**
   * <code>.basekv.ChangeConfig changeConfig = 4;</code>
   * @return The changeConfig.
   */
  com.zachary.bifromq.basekv.proto.ChangeConfig getChangeConfig();
  /**
   * <code>.basekv.ChangeConfig changeConfig = 4;</code>
   */
  com.zachary.bifromq.basekv.proto.ChangeConfigOrBuilder getChangeConfigOrBuilder();

  /**
   * <code>.basekv.TransferLeadership transferLeadership = 5;</code>
   * @return Whether the transferLeadership field is set.
   */
  boolean hasTransferLeadership();
  /**
   * <code>.basekv.TransferLeadership transferLeadership = 5;</code>
   * @return The transferLeadership.
   */
  com.zachary.bifromq.basekv.proto.TransferLeadership getTransferLeadership();
  /**
   * <code>.basekv.TransferLeadership transferLeadership = 5;</code>
   */
  com.zachary.bifromq.basekv.proto.TransferLeadershipOrBuilder getTransferLeadershipOrBuilder();

  /**
   * <code>.basekv.SplitRange splitRange = 6;</code>
   * @return Whether the splitRange field is set.
   */
  boolean hasSplitRange();
  /**
   * <code>.basekv.SplitRange splitRange = 6;</code>
   * @return The splitRange.
   */
  com.zachary.bifromq.basekv.proto.SplitRange getSplitRange();
  /**
   * <code>.basekv.SplitRange splitRange = 6;</code>
   */
  com.zachary.bifromq.basekv.proto.SplitRangeOrBuilder getSplitRangeOrBuilder();

  /**
   * <code>.basekv.PrepareMergeWith prepareMergeWith = 7;</code>
   * @return Whether the prepareMergeWith field is set.
   */
  boolean hasPrepareMergeWith();
  /**
   * <code>.basekv.PrepareMergeWith prepareMergeWith = 7;</code>
   * @return The prepareMergeWith.
   */
  com.zachary.bifromq.basekv.proto.PrepareMergeWith getPrepareMergeWith();
  /**
   * <code>.basekv.PrepareMergeWith prepareMergeWith = 7;</code>
   */
  com.zachary.bifromq.basekv.proto.PrepareMergeWithOrBuilder getPrepareMergeWithOrBuilder();

  /**
   * <code>.basekv.CancelMerging cancelMerging = 8;</code>
   * @return Whether the cancelMerging field is set.
   */
  boolean hasCancelMerging();
  /**
   * <code>.basekv.CancelMerging cancelMerging = 8;</code>
   * @return The cancelMerging.
   */
  com.zachary.bifromq.basekv.proto.CancelMerging getCancelMerging();
  /**
   * <code>.basekv.CancelMerging cancelMerging = 8;</code>
   */
  com.zachary.bifromq.basekv.proto.CancelMergingOrBuilder getCancelMergingOrBuilder();

  /**
   * <code>.basekv.PrepareMergeTo prepareMergeTo = 9;</code>
   * @return Whether the prepareMergeTo field is set.
   */
  boolean hasPrepareMergeTo();
  /**
   * <code>.basekv.PrepareMergeTo prepareMergeTo = 9;</code>
   * @return The prepareMergeTo.
   */
  com.zachary.bifromq.basekv.proto.PrepareMergeTo getPrepareMergeTo();
  /**
   * <code>.basekv.PrepareMergeTo prepareMergeTo = 9;</code>
   */
  com.zachary.bifromq.basekv.proto.PrepareMergeToOrBuilder getPrepareMergeToOrBuilder();

  /**
   * <code>.basekv.Merge merge = 10;</code>
   * @return Whether the merge field is set.
   */
  boolean hasMerge();
  /**
   * <code>.basekv.Merge merge = 10;</code>
   * @return The merge.
   */
  com.zachary.bifromq.basekv.proto.Merge getMerge();
  /**
   * <code>.basekv.Merge merge = 10;</code>
   */
  com.zachary.bifromq.basekv.proto.MergeOrBuilder getMergeOrBuilder();

  /**
   * <code>.basekv.MergeDone mergeDone = 11;</code>
   * @return Whether the mergeDone field is set.
   */
  boolean hasMergeDone();
  /**
   * <code>.basekv.MergeDone mergeDone = 11;</code>
   * @return The mergeDone.
   */
  com.zachary.bifromq.basekv.proto.MergeDone getMergeDone();
  /**
   * <code>.basekv.MergeDone mergeDone = 11;</code>
   */
  com.zachary.bifromq.basekv.proto.MergeDoneOrBuilder getMergeDoneOrBuilder();

  /**
   * <code>.basekv.Delete delete = 12;</code>
   * @return Whether the delete field is set.
   */
  boolean hasDelete();
  /**
   * <code>.basekv.Delete delete = 12;</code>
   * @return The delete.
   */
  com.zachary.bifromq.basekv.proto.Delete getDelete();
  /**
   * <code>.basekv.Delete delete = 12;</code>
   */
  com.zachary.bifromq.basekv.proto.DeleteOrBuilder getDeleteOrBuilder();

  /**
   * <code>.basekv.Put put = 13;</code>
   * @return Whether the put field is set.
   */
  boolean hasPut();
  /**
   * <code>.basekv.Put put = 13;</code>
   * @return The put.
   */
  com.zachary.bifromq.basekv.proto.Put getPut();
  /**
   * <code>.basekv.Put put = 13;</code>
   */
  com.zachary.bifromq.basekv.proto.PutOrBuilder getPutOrBuilder();

  /**
   * <code>bytes rwCoProc = 14;</code>
   * @return Whether the rwCoProc field is set.
   */
  boolean hasRwCoProc();
  /**
   * <code>bytes rwCoProc = 14;</code>
   * @return The rwCoProc.
   */
  com.google.protobuf.ByteString getRwCoProc();

  public com.zachary.bifromq.basekv.proto.KVRangeCommand.CommandTypeCase getCommandTypeCase();
}
