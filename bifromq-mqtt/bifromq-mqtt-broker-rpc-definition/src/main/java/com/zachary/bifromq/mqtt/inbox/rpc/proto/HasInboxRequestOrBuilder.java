// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mqttbroker/MessageReceiver.proto

package com.zachary.bifromq.mqtt.inbox.rpc.proto;

public interface HasInboxRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:mqttbroker.HasInboxRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 reqId = 1;</code>
   * @return The reqId.
   */
  long getReqId();

  /**
   * <code>string inboxId = 2;</code>
   * @return The inboxId.
   */
  java.lang.String getInboxId();
  /**
   * <code>string inboxId = 2;</code>
   * @return The bytes for inboxId.
   */
  com.google.protobuf.ByteString
      getInboxIdBytes();
}
