// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: basekv/StoreMessage.proto

package com.zachary.bifromq.basekv.proto;

public interface PrepareMergeToReplyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:basekv.PrepareMergeToReply)
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
   * <code>bool accept = 2;</code>
   * @return The accept.
   */
  boolean getAccept();
}
