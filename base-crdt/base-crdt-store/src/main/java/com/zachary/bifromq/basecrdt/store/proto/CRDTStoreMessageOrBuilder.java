// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: basecrdt/CRDTStoreMessage.proto

package com.zachary.bifromq.basecrdt.store.proto;

public interface CRDTStoreMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:basecrdt.CRDTStoreMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * the CRDT URI
   * </pre>
   *
   * <code>string uri = 1;</code>
   * @return The uri.
   */
  java.lang.String getUri();
  /**
   * <pre>
   * the CRDT URI
   * </pre>
   *
   * <code>string uri = 1;</code>
   * @return The bytes for uri.
   */
  com.google.protobuf.ByteString
      getUriBytes();

  /**
   * <pre>
   * addr of sender replica
   * </pre>
   *
   * <code>bytes sender = 2;</code>
   * @return The sender.
   */
  com.google.protobuf.ByteString getSender();

  /**
   * <pre>
   * addr of receiver replica
   * </pre>
   *
   * <code>bytes receiver = 3;</code>
   * @return The receiver.
   */
  com.google.protobuf.ByteString getReceiver();

  /**
   * <code>bytes payload = 4;</code>
   * @return The payload.
   */
  com.google.protobuf.ByteString getPayload();
}
