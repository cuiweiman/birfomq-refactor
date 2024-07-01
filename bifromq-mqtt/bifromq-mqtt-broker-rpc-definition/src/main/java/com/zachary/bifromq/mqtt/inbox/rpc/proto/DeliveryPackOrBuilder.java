// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mqttbroker/MessageReceiver.proto

package com.zachary.bifromq.mqtt.inbox.rpc.proto;

public interface DeliveryPackOrBuilder extends
    // @@protoc_insertion_point(interface_extends:mqttbroker.DeliveryPack)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.commontype.TopicMessagePack messagePack = 1;</code>
   * @return Whether the messagePack field is set.
   */
  boolean hasMessagePack();
  /**
   * <code>.commontype.TopicMessagePack messagePack = 1;</code>
   * @return The messagePack.
   */
  com.zachary.bifromq.type.TopicMessagePack getMessagePack();
  /**
   * <code>.commontype.TopicMessagePack messagePack = 1;</code>
   */
  com.zachary.bifromq.type.TopicMessagePackOrBuilder getMessagePackOrBuilder();

  /**
   * <code>repeated .commontype.SubInfo subscriber = 2;</code>
   */
  java.util.List<com.zachary.bifromq.type.SubInfo> 
      getSubscriberList();
  /**
   * <code>repeated .commontype.SubInfo subscriber = 2;</code>
   */
  com.zachary.bifromq.type.SubInfo getSubscriber(int index);
  /**
   * <code>repeated .commontype.SubInfo subscriber = 2;</code>
   */
  int getSubscriberCount();
  /**
   * <code>repeated .commontype.SubInfo subscriber = 2;</code>
   */
  java.util.List<? extends com.zachary.bifromq.type.SubInfoOrBuilder> 
      getSubscriberOrBuilderList();
  /**
   * <code>repeated .commontype.SubInfo subscriber = 2;</code>
   */
  com.zachary.bifromq.type.SubInfoOrBuilder getSubscriberOrBuilder(
      int index);
}
