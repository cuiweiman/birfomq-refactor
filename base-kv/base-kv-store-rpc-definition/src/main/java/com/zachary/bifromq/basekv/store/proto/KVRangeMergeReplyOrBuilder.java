// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: basekv/BaseKVStoreService.proto

package com.zachary.bifromq.basekv.store.proto;

public interface KVRangeMergeReplyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:basekv.KVRangeMergeReply)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 reqId = 1;</code>
   * @return The reqId.
   */
  long getReqId();

  /**
   * <code>.basekv.ReplyCode code = 2;</code>
   * @return The enum numeric value on the wire for code.
   */
  int getCodeValue();
  /**
   * <code>.basekv.ReplyCode code = 2;</code>
   * @return The code.
   */
  com.zachary.bifromq.basekv.store.proto.ReplyCode getCode();
}
