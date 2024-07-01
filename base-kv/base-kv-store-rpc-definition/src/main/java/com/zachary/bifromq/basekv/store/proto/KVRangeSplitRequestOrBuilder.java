// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: basekv/BaseKVStoreService.proto

package com.zachary.bifromq.basekv.store.proto;

public interface KVRangeSplitRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:basekv.KVRangeSplitRequest)
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
   * <code>bytes splitKey = 4;</code>
   * @return The splitKey.
   */
  com.google.protobuf.ByteString getSplitKey();
}
