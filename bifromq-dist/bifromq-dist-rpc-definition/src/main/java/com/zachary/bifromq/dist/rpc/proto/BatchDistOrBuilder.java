// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: distservice/DistCoProc.proto

package com.zachary.bifromq.dist.rpc.proto;

public interface BatchDistOrBuilder extends
    // @@protoc_insertion_point(interface_extends:distservice.BatchDist)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 reqId = 1;</code>
   * @return The reqId.
   */
  long getReqId();

  /**
   * <pre>
   * sorted by tenantId and topic
   * </pre>
   *
   * <code>repeated .distservice.DistPack distPack = 2;</code>
   */
  java.util.List<com.zachary.bifromq.dist.rpc.proto.DistPack> 
      getDistPackList();
  /**
   * <pre>
   * sorted by tenantId and topic
   * </pre>
   *
   * <code>repeated .distservice.DistPack distPack = 2;</code>
   */
  com.zachary.bifromq.dist.rpc.proto.DistPack getDistPack(int index);
  /**
   * <pre>
   * sorted by tenantId and topic
   * </pre>
   *
   * <code>repeated .distservice.DistPack distPack = 2;</code>
   */
  int getDistPackCount();
  /**
   * <pre>
   * sorted by tenantId and topic
   * </pre>
   *
   * <code>repeated .distservice.DistPack distPack = 2;</code>
   */
  java.util.List<? extends com.zachary.bifromq.dist.rpc.proto.DistPackOrBuilder> 
      getDistPackOrBuilderList();
  /**
   * <pre>
   * sorted by tenantId and topic
   * </pre>
   *
   * <code>repeated .distservice.DistPack distPack = 2;</code>
   */
  com.zachary.bifromq.dist.rpc.proto.DistPackOrBuilder getDistPackOrBuilder(
      int index);

  /**
   * <code>string orderKey = 3;</code>
   * @return The orderKey.
   */
  java.lang.String getOrderKey();
  /**
   * <code>string orderKey = 3;</code>
   * @return The bytes for orderKey.
   */
  com.google.protobuf.ByteString
      getOrderKeyBytes();
}
