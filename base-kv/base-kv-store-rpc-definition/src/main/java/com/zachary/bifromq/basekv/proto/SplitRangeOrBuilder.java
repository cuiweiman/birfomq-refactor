// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: basekv/Command.proto

package com.zachary.bifromq.basekv.proto;

public interface SplitRangeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:basekv.SplitRange)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bytes splitKey = 1;</code>
   * @return The splitKey.
   */
  com.google.protobuf.ByteString getSplitKey();

  /**
   * <code>.basekv.KVRangeId newId = 2;</code>
   * @return Whether the newId field is set.
   */
  boolean hasNewId();
  /**
   * <code>.basekv.KVRangeId newId = 2;</code>
   * @return The newId.
   */
  com.zachary.bifromq.basekv.proto.KVRangeId getNewId();
  /**
   * <code>.basekv.KVRangeId newId = 2;</code>
   */
  com.zachary.bifromq.basekv.proto.KVRangeIdOrBuilder getNewIdOrBuilder();
}
