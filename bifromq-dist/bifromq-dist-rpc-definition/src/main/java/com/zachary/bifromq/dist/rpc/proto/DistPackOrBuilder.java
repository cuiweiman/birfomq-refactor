// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: distservice/DistCoProc.proto

package com.zachary.bifromq.dist.rpc.proto;

public interface DistPackOrBuilder extends
    // @@protoc_insertion_point(interface_extends:distservice.DistPack)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string tenantId = 1;</code>
   * @return The tenantId.
   */
  java.lang.String getTenantId();
  /**
   * <code>string tenantId = 1;</code>
   * @return The bytes for tenantId.
   */
  com.google.protobuf.ByteString
      getTenantIdBytes();

  /**
   * <pre>
   * topic messages packs shares same tenantId
   * </pre>
   *
   * <code>repeated .commontype.TopicMessagePack msgPack = 2;</code>
   */
  java.util.List<com.zachary.bifromq.type.TopicMessagePack> 
      getMsgPackList();
  /**
   * <pre>
   * topic messages packs shares same tenantId
   * </pre>
   *
   * <code>repeated .commontype.TopicMessagePack msgPack = 2;</code>
   */
  com.zachary.bifromq.type.TopicMessagePack getMsgPack(int index);
  /**
   * <pre>
   * topic messages packs shares same tenantId
   * </pre>
   *
   * <code>repeated .commontype.TopicMessagePack msgPack = 2;</code>
   */
  int getMsgPackCount();
  /**
   * <pre>
   * topic messages packs shares same tenantId
   * </pre>
   *
   * <code>repeated .commontype.TopicMessagePack msgPack = 2;</code>
   */
  java.util.List<? extends com.zachary.bifromq.type.TopicMessagePackOrBuilder> 
      getMsgPackOrBuilderList();
  /**
   * <pre>
   * topic messages packs shares same tenantId
   * </pre>
   *
   * <code>repeated .commontype.TopicMessagePack msgPack = 2;</code>
   */
  com.zachary.bifromq.type.TopicMessagePackOrBuilder getMsgPackOrBuilder(
      int index);
}
