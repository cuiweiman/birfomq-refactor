// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: inboxservice/InboxCoProc.proto

package com.zachary.bifromq.inbox.storage.proto;

public interface InboxCommitRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:inboxservice.InboxCommitRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>map&lt;string, .inboxservice.InboxCommit&gt; inboxCommit = 1;</code>
   */
  int getInboxCommitCount();
  /**
   * <code>map&lt;string, .inboxservice.InboxCommit&gt; inboxCommit = 1;</code>
   */
  boolean containsInboxCommit(
      java.lang.String key);
  /**
   * Use {@link #getInboxCommitMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.zachary.bifromq.inbox.storage.proto.InboxCommit>
  getInboxCommit();
  /**
   * <code>map&lt;string, .inboxservice.InboxCommit&gt; inboxCommit = 1;</code>
   */
  java.util.Map<java.lang.String, com.zachary.bifromq.inbox.storage.proto.InboxCommit>
  getInboxCommitMap();
  /**
   * <code>map&lt;string, .inboxservice.InboxCommit&gt; inboxCommit = 1;</code>
   */
  /* nullable */
com.zachary.bifromq.inbox.storage.proto.InboxCommit getInboxCommitOrDefault(
      java.lang.String key,
      /* nullable */
com.zachary.bifromq.inbox.storage.proto.InboxCommit defaultValue);
  /**
   * <code>map&lt;string, .inboxservice.InboxCommit&gt; inboxCommit = 1;</code>
   */
  com.zachary.bifromq.inbox.storage.proto.InboxCommit getInboxCommitOrThrow(
      java.lang.String key);
}
