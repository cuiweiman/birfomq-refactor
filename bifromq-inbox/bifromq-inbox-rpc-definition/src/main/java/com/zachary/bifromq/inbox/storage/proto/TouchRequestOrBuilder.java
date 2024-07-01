// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: inboxservice/InboxCoProc.proto

package com.zachary.bifromq.inbox.storage.proto;

public interface TouchRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:inboxservice.TouchRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * key: scopedInboxIdUtf8, value: true for keep the inbox, false for drop the inbox immediately
   * </pre>
   *
   * <code>map&lt;string, bool&gt; scopedInboxId = 1;</code>
   */
  int getScopedInboxIdCount();
  /**
   * <pre>
   * key: scopedInboxIdUtf8, value: true for keep the inbox, false for drop the inbox immediately
   * </pre>
   *
   * <code>map&lt;string, bool&gt; scopedInboxId = 1;</code>
   */
  boolean containsScopedInboxId(
      java.lang.String key);
  /**
   * Use {@link #getScopedInboxIdMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.Boolean>
  getScopedInboxId();
  /**
   * <pre>
   * key: scopedInboxIdUtf8, value: true for keep the inbox, false for drop the inbox immediately
   * </pre>
   *
   * <code>map&lt;string, bool&gt; scopedInboxId = 1;</code>
   */
  java.util.Map<java.lang.String, java.lang.Boolean>
  getScopedInboxIdMap();
  /**
   * <pre>
   * key: scopedInboxIdUtf8, value: true for keep the inbox, false for drop the inbox immediately
   * </pre>
   *
   * <code>map&lt;string, bool&gt; scopedInboxId = 1;</code>
   */
  boolean getScopedInboxIdOrDefault(
      java.lang.String key,
      boolean defaultValue);
  /**
   * <pre>
   * key: scopedInboxIdUtf8, value: true for keep the inbox, false for drop the inbox immediately
   * </pre>
   *
   * <code>map&lt;string, bool&gt; scopedInboxId = 1;</code>
   */
  boolean getScopedInboxIdOrThrow(
      java.lang.String key);
}
