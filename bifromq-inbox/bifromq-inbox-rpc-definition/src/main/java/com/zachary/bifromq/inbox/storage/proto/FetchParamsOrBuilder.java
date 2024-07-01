// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: inboxservice/InboxCoProc.proto

package com.zachary.bifromq.inbox.storage.proto;

public interface FetchParamsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:inboxservice.FetchParams)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint32 maxFetch = 1;</code>
   * @return The maxFetch.
   */
  int getMaxFetch();

  /**
   * <code>optional uint64 qos0StartAfter = 2;</code>
   * @return Whether the qos0StartAfter field is set.
   */
  boolean hasQos0StartAfter();
  /**
   * <code>optional uint64 qos0StartAfter = 2;</code>
   * @return The qos0StartAfter.
   */
  long getQos0StartAfter();

  /**
   * <code>optional uint64 qos1StartAfter = 3;</code>
   * @return Whether the qos1StartAfter field is set.
   */
  boolean hasQos1StartAfter();
  /**
   * <code>optional uint64 qos1StartAfter = 3;</code>
   * @return The qos1StartAfter.
   */
  long getQos1StartAfter();

  /**
   * <code>optional uint64 qos2StartAfter = 4;</code>
   * @return Whether the qos2StartAfter field is set.
   */
  boolean hasQos2StartAfter();
  /**
   * <code>optional uint64 qos2StartAfter = 4;</code>
   * @return The qos2StartAfter.
   */
  long getQos2StartAfter();
}
