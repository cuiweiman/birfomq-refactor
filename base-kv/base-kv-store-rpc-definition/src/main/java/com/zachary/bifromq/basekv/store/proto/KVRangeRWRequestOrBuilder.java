// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: basekv/BaseKVStoreService.proto

package com.zachary.bifromq.basekv.store.proto;

public interface KVRangeRWRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:basekv.KVRangeRWRequest)
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
   * <code>bytes delete = 4;</code>
   * @return Whether the delete field is set.
   */
  boolean hasDelete();
  /**
   * <code>bytes delete = 4;</code>
   * @return The delete.
   */
  com.google.protobuf.ByteString getDelete();

  /**
   * <code>.basekv.Put put = 5;</code>
   * @return Whether the put field is set.
   */
  boolean hasPut();
  /**
   * <code>.basekv.Put put = 5;</code>
   * @return The put.
   */
  com.zachary.bifromq.basekv.proto.Put getPut();
  /**
   * <code>.basekv.Put put = 5;</code>
   */
  com.zachary.bifromq.basekv.proto.PutOrBuilder getPutOrBuilder();

  /**
   * <code>bytes rwCoProc = 6;</code>
   * @return Whether the rwCoProc field is set.
   */
  boolean hasRwCoProc();
  /**
   * <code>bytes rwCoProc = 6;</code>
   * @return The rwCoProc.
   */
  com.google.protobuf.ByteString getRwCoProc();

  public com.zachary.bifromq.basekv.store.proto.KVRangeRWRequest.RequestTypeCase getRequestTypeCase();
}
