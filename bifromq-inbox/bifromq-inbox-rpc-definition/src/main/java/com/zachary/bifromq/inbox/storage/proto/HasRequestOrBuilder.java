// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: inboxservice/InboxCoProc.proto

package com.zachary.bifromq.inbox.storage.proto;

public interface HasRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:inboxservice.HasRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated bytes scopedInboxId = 1;</code>
   * @return A list containing the scopedInboxId.
   */
  java.util.List<com.google.protobuf.ByteString> getScopedInboxIdList();
  /**
   * <code>repeated bytes scopedInboxId = 1;</code>
   * @return The count of scopedInboxId.
   */
  int getScopedInboxIdCount();
  /**
   * <code>repeated bytes scopedInboxId = 1;</code>
   * @param index The index of the element to return.
   * @return The scopedInboxId at the given index.
   */
  com.google.protobuf.ByteString getScopedInboxId(int index);
}
