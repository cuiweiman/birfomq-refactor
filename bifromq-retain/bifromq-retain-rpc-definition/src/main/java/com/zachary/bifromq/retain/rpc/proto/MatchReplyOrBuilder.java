// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: retainservice/RetainService.proto

package com.zachary.bifromq.retain.rpc.proto;

public interface MatchReplyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:retainservice.MatchReply)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 reqId = 1;</code>
   * @return The reqId.
   */
  long getReqId();

  /**
   * <code>.retainservice.MatchReply.Result result = 2;</code>
   * @return The enum numeric value on the wire for result.
   */
  int getResultValue();
  /**
   * <code>.retainservice.MatchReply.Result result = 2;</code>
   * @return The result.
   */
  MatchReply.Result getResult();

  /**
   * <code>repeated .commontype.TopicMessage messages = 3;</code>
   */
  java.util.List<com.zachary.bifromq.type.TopicMessage> 
      getMessagesList();
  /**
   * <code>repeated .commontype.TopicMessage messages = 3;</code>
   */
  com.zachary.bifromq.type.TopicMessage getMessages(int index);
  /**
   * <code>repeated .commontype.TopicMessage messages = 3;</code>
   */
  int getMessagesCount();
  /**
   * <code>repeated .commontype.TopicMessage messages = 3;</code>
   */
  java.util.List<? extends com.zachary.bifromq.type.TopicMessageOrBuilder> 
      getMessagesOrBuilderList();
  /**
   * <code>repeated .commontype.TopicMessage messages = 3;</code>
   */
  com.zachary.bifromq.type.TopicMessageOrBuilder getMessagesOrBuilder(
      int index);
}
