// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: commontype/SubInfo.proto

package com.zachary.bifromq.type;

public interface SubInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:commontype.SubInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 订阅者的 租户ID
   * </pre>
   *
   * <code>string tenantId = 1;</code>
   * @return The tenantId.
   */
  java.lang.String getTenantId();
  /**
   * <pre>
   * 订阅者的 租户ID
   * </pre>
   *
   * <code>string tenantId = 1;</code>
   * @return The bytes for tenantId.
   */
  com.google.protobuf.ByteString
      getTenantIdBytes();

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

  /**
   * <pre>
   * 订阅者的 QOS
   * </pre>
   *
   * <code>.commontype.QoS subQoS = 3;</code>
   * @return The enum numeric value on the wire for subQoS.
   */
  int getSubQoSValue();
  /**
   * <pre>
   * 订阅者的 QOS
   * </pre>
   *
   * <code>.commontype.QoS subQoS = 3;</code>
   * @return The subQoS.
   */
  com.zachary.bifromq.type.QoS getSubQoS();

  /**
   * <pre>
   * Topic 过滤
   * </pre>
   *
   * <code>string topicFilter = 4;</code>
   * @return The topicFilter.
   */
  java.lang.String getTopicFilter();
  /**
   * <pre>
   * Topic 过滤
   * </pre>
   *
   * <code>string topicFilter = 4;</code>
   * @return The bytes for topicFilter.
   */
  com.google.protobuf.ByteString
      getTopicFilterBytes();
}
