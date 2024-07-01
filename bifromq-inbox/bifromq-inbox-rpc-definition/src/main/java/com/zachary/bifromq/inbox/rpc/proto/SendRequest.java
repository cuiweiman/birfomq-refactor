// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: inboxservice/InboxService.proto

package com.zachary.bifromq.inbox.rpc.proto;

/**
 * Protobuf type {@code inboxservice.SendRequest}
 */
public final class SendRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:inboxservice.SendRequest)
    SendRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SendRequest.newBuilder() to construct.
  private SendRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SendRequest() {
    inboxMsgPack_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SendRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.zachary.bifromq.inbox.rpc.proto.InboxServiceProtos.internal_static_inboxservice_SendRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.zachary.bifromq.inbox.rpc.proto.InboxServiceProtos.internal_static_inboxservice_SendRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.zachary.bifromq.inbox.rpc.proto.SendRequest.class, com.zachary.bifromq.inbox.rpc.proto.SendRequest.Builder.class);
  }

  public static final int REQID_FIELD_NUMBER = 1;
  private long reqId_ = 0L;
  /**
   * <code>uint64 reqId = 1;</code>
   * @return The reqId.
   */
  @java.lang.Override
  public long getReqId() {
    return reqId_;
  }

  public static final int INBOXMSGPACK_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<com.zachary.bifromq.inbox.rpc.proto.InboxMessagePack> inboxMsgPack_;
  /**
   * <code>repeated .inboxservice.InboxMessagePack inboxMsgPack = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.zachary.bifromq.inbox.rpc.proto.InboxMessagePack> getInboxMsgPackList() {
    return inboxMsgPack_;
  }
  /**
   * <code>repeated .inboxservice.InboxMessagePack inboxMsgPack = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.zachary.bifromq.inbox.rpc.proto.InboxMessagePackOrBuilder> 
      getInboxMsgPackOrBuilderList() {
    return inboxMsgPack_;
  }
  /**
   * <code>repeated .inboxservice.InboxMessagePack inboxMsgPack = 2;</code>
   */
  @java.lang.Override
  public int getInboxMsgPackCount() {
    return inboxMsgPack_.size();
  }
  /**
   * <code>repeated .inboxservice.InboxMessagePack inboxMsgPack = 2;</code>
   */
  @java.lang.Override
  public com.zachary.bifromq.inbox.rpc.proto.InboxMessagePack getInboxMsgPack(int index) {
    return inboxMsgPack_.get(index);
  }
  /**
   * <code>repeated .inboxservice.InboxMessagePack inboxMsgPack = 2;</code>
   */
  @java.lang.Override
  public com.zachary.bifromq.inbox.rpc.proto.InboxMessagePackOrBuilder getInboxMsgPackOrBuilder(
      int index) {
    return inboxMsgPack_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (reqId_ != 0L) {
      output.writeUInt64(1, reqId_);
    }
    for (int i = 0; i < inboxMsgPack_.size(); i++) {
      output.writeMessage(2, inboxMsgPack_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (reqId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, reqId_);
    }
    for (int i = 0; i < inboxMsgPack_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, inboxMsgPack_.get(i));
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.zachary.bifromq.inbox.rpc.proto.SendRequest)) {
      return super.equals(obj);
    }
    com.zachary.bifromq.inbox.rpc.proto.SendRequest other = (com.zachary.bifromq.inbox.rpc.proto.SendRequest) obj;

    if (getReqId()
        != other.getReqId()) return false;
    if (!getInboxMsgPackList()
        .equals(other.getInboxMsgPackList())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + REQID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getReqId());
    if (getInboxMsgPackCount() > 0) {
      hash = (37 * hash) + INBOXMSGPACK_FIELD_NUMBER;
      hash = (53 * hash) + getInboxMsgPackList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.zachary.bifromq.inbox.rpc.proto.SendRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.zachary.bifromq.inbox.rpc.proto.SendRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.zachary.bifromq.inbox.rpc.proto.SendRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.zachary.bifromq.inbox.rpc.proto.SendRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.zachary.bifromq.inbox.rpc.proto.SendRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.zachary.bifromq.inbox.rpc.proto.SendRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.zachary.bifromq.inbox.rpc.proto.SendRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.zachary.bifromq.inbox.rpc.proto.SendRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.zachary.bifromq.inbox.rpc.proto.SendRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.zachary.bifromq.inbox.rpc.proto.SendRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.zachary.bifromq.inbox.rpc.proto.SendRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.zachary.bifromq.inbox.rpc.proto.SendRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.zachary.bifromq.inbox.rpc.proto.SendRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code inboxservice.SendRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:inboxservice.SendRequest)
      com.zachary.bifromq.inbox.rpc.proto.SendRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.zachary.bifromq.inbox.rpc.proto.InboxServiceProtos.internal_static_inboxservice_SendRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.zachary.bifromq.inbox.rpc.proto.InboxServiceProtos.internal_static_inboxservice_SendRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.zachary.bifromq.inbox.rpc.proto.SendRequest.class, com.zachary.bifromq.inbox.rpc.proto.SendRequest.Builder.class);
    }

    // Construct using com.zachary.bifromq.inbox.rpc.proto.SendRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      reqId_ = 0L;
      if (inboxMsgPackBuilder_ == null) {
        inboxMsgPack_ = java.util.Collections.emptyList();
      } else {
        inboxMsgPack_ = null;
        inboxMsgPackBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.zachary.bifromq.inbox.rpc.proto.InboxServiceProtos.internal_static_inboxservice_SendRequest_descriptor;
    }

    @java.lang.Override
    public com.zachary.bifromq.inbox.rpc.proto.SendRequest getDefaultInstanceForType() {
      return com.zachary.bifromq.inbox.rpc.proto.SendRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.zachary.bifromq.inbox.rpc.proto.SendRequest build() {
      com.zachary.bifromq.inbox.rpc.proto.SendRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.zachary.bifromq.inbox.rpc.proto.SendRequest buildPartial() {
      com.zachary.bifromq.inbox.rpc.proto.SendRequest result = new com.zachary.bifromq.inbox.rpc.proto.SendRequest(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.zachary.bifromq.inbox.rpc.proto.SendRequest result) {
      if (inboxMsgPackBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          inboxMsgPack_ = java.util.Collections.unmodifiableList(inboxMsgPack_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.inboxMsgPack_ = inboxMsgPack_;
      } else {
        result.inboxMsgPack_ = inboxMsgPackBuilder_.build();
      }
    }

    private void buildPartial0(com.zachary.bifromq.inbox.rpc.proto.SendRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.reqId_ = reqId_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.zachary.bifromq.inbox.rpc.proto.SendRequest) {
        return mergeFrom((com.zachary.bifromq.inbox.rpc.proto.SendRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.zachary.bifromq.inbox.rpc.proto.SendRequest other) {
      if (other == com.zachary.bifromq.inbox.rpc.proto.SendRequest.getDefaultInstance()) return this;
      if (other.getReqId() != 0L) {
        setReqId(other.getReqId());
      }
      if (inboxMsgPackBuilder_ == null) {
        if (!other.inboxMsgPack_.isEmpty()) {
          if (inboxMsgPack_.isEmpty()) {
            inboxMsgPack_ = other.inboxMsgPack_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureInboxMsgPackIsMutable();
            inboxMsgPack_.addAll(other.inboxMsgPack_);
          }
          onChanged();
        }
      } else {
        if (!other.inboxMsgPack_.isEmpty()) {
          if (inboxMsgPackBuilder_.isEmpty()) {
            inboxMsgPackBuilder_.dispose();
            inboxMsgPackBuilder_ = null;
            inboxMsgPack_ = other.inboxMsgPack_;
            bitField0_ = (bitField0_ & ~0x00000002);
            inboxMsgPackBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getInboxMsgPackFieldBuilder() : null;
          } else {
            inboxMsgPackBuilder_.addAllMessages(other.inboxMsgPack_);
          }
        }
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              reqId_ = input.readUInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              com.zachary.bifromq.inbox.rpc.proto.InboxMessagePack m =
                  input.readMessage(
                      com.zachary.bifromq.inbox.rpc.proto.InboxMessagePack.parser(),
                      extensionRegistry);
              if (inboxMsgPackBuilder_ == null) {
                ensureInboxMsgPackIsMutable();
                inboxMsgPack_.add(m);
              } else {
                inboxMsgPackBuilder_.addMessage(m);
              }
              break;
            } // case 18
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private long reqId_ ;
    /**
     * <code>uint64 reqId = 1;</code>
     * @return The reqId.
     */
    @java.lang.Override
    public long getReqId() {
      return reqId_;
    }
    /**
     * <code>uint64 reqId = 1;</code>
     * @param value The reqId to set.
     * @return This builder for chaining.
     */
    public Builder setReqId(long value) {
      
      reqId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 reqId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearReqId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      reqId_ = 0L;
      onChanged();
      return this;
    }

    private java.util.List<com.zachary.bifromq.inbox.rpc.proto.InboxMessagePack> inboxMsgPack_ =
      java.util.Collections.emptyList();
    private void ensureInboxMsgPackIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        inboxMsgPack_ = new java.util.ArrayList<com.zachary.bifromq.inbox.rpc.proto.InboxMessagePack>(inboxMsgPack_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.zachary.bifromq.inbox.rpc.proto.InboxMessagePack, com.zachary.bifromq.inbox.rpc.proto.InboxMessagePack.Builder, com.zachary.bifromq.inbox.rpc.proto.InboxMessagePackOrBuilder> inboxMsgPackBuilder_;

    /**
     * <code>repeated .inboxservice.InboxMessagePack inboxMsgPack = 2;</code>
     */
    public java.util.List<com.zachary.bifromq.inbox.rpc.proto.InboxMessagePack> getInboxMsgPackList() {
      if (inboxMsgPackBuilder_ == null) {
        return java.util.Collections.unmodifiableList(inboxMsgPack_);
      } else {
        return inboxMsgPackBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .inboxservice.InboxMessagePack inboxMsgPack = 2;</code>
     */
    public int getInboxMsgPackCount() {
      if (inboxMsgPackBuilder_ == null) {
        return inboxMsgPack_.size();
      } else {
        return inboxMsgPackBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .inboxservice.InboxMessagePack inboxMsgPack = 2;</code>
     */
    public com.zachary.bifromq.inbox.rpc.proto.InboxMessagePack getInboxMsgPack(int index) {
      if (inboxMsgPackBuilder_ == null) {
        return inboxMsgPack_.get(index);
      } else {
        return inboxMsgPackBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .inboxservice.InboxMessagePack inboxMsgPack = 2;</code>
     */
    public Builder setInboxMsgPack(
        int index, com.zachary.bifromq.inbox.rpc.proto.InboxMessagePack value) {
      if (inboxMsgPackBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInboxMsgPackIsMutable();
        inboxMsgPack_.set(index, value);
        onChanged();
      } else {
        inboxMsgPackBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .inboxservice.InboxMessagePack inboxMsgPack = 2;</code>
     */
    public Builder setInboxMsgPack(
        int index, com.zachary.bifromq.inbox.rpc.proto.InboxMessagePack.Builder builderForValue) {
      if (inboxMsgPackBuilder_ == null) {
        ensureInboxMsgPackIsMutable();
        inboxMsgPack_.set(index, builderForValue.build());
        onChanged();
      } else {
        inboxMsgPackBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .inboxservice.InboxMessagePack inboxMsgPack = 2;</code>
     */
    public Builder addInboxMsgPack(com.zachary.bifromq.inbox.rpc.proto.InboxMessagePack value) {
      if (inboxMsgPackBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInboxMsgPackIsMutable();
        inboxMsgPack_.add(value);
        onChanged();
      } else {
        inboxMsgPackBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .inboxservice.InboxMessagePack inboxMsgPack = 2;</code>
     */
    public Builder addInboxMsgPack(
        int index, com.zachary.bifromq.inbox.rpc.proto.InboxMessagePack value) {
      if (inboxMsgPackBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInboxMsgPackIsMutable();
        inboxMsgPack_.add(index, value);
        onChanged();
      } else {
        inboxMsgPackBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .inboxservice.InboxMessagePack inboxMsgPack = 2;</code>
     */
    public Builder addInboxMsgPack(
        com.zachary.bifromq.inbox.rpc.proto.InboxMessagePack.Builder builderForValue) {
      if (inboxMsgPackBuilder_ == null) {
        ensureInboxMsgPackIsMutable();
        inboxMsgPack_.add(builderForValue.build());
        onChanged();
      } else {
        inboxMsgPackBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .inboxservice.InboxMessagePack inboxMsgPack = 2;</code>
     */
    public Builder addInboxMsgPack(
        int index, com.zachary.bifromq.inbox.rpc.proto.InboxMessagePack.Builder builderForValue) {
      if (inboxMsgPackBuilder_ == null) {
        ensureInboxMsgPackIsMutable();
        inboxMsgPack_.add(index, builderForValue.build());
        onChanged();
      } else {
        inboxMsgPackBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .inboxservice.InboxMessagePack inboxMsgPack = 2;</code>
     */
    public Builder addAllInboxMsgPack(
        java.lang.Iterable<? extends com.zachary.bifromq.inbox.rpc.proto.InboxMessagePack> values) {
      if (inboxMsgPackBuilder_ == null) {
        ensureInboxMsgPackIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, inboxMsgPack_);
        onChanged();
      } else {
        inboxMsgPackBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .inboxservice.InboxMessagePack inboxMsgPack = 2;</code>
     */
    public Builder clearInboxMsgPack() {
      if (inboxMsgPackBuilder_ == null) {
        inboxMsgPack_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        inboxMsgPackBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .inboxservice.InboxMessagePack inboxMsgPack = 2;</code>
     */
    public Builder removeInboxMsgPack(int index) {
      if (inboxMsgPackBuilder_ == null) {
        ensureInboxMsgPackIsMutable();
        inboxMsgPack_.remove(index);
        onChanged();
      } else {
        inboxMsgPackBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .inboxservice.InboxMessagePack inboxMsgPack = 2;</code>
     */
    public com.zachary.bifromq.inbox.rpc.proto.InboxMessagePack.Builder getInboxMsgPackBuilder(
        int index) {
      return getInboxMsgPackFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .inboxservice.InboxMessagePack inboxMsgPack = 2;</code>
     */
    public com.zachary.bifromq.inbox.rpc.proto.InboxMessagePackOrBuilder getInboxMsgPackOrBuilder(
        int index) {
      if (inboxMsgPackBuilder_ == null) {
        return inboxMsgPack_.get(index);  } else {
        return inboxMsgPackBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .inboxservice.InboxMessagePack inboxMsgPack = 2;</code>
     */
    public java.util.List<? extends com.zachary.bifromq.inbox.rpc.proto.InboxMessagePackOrBuilder> 
         getInboxMsgPackOrBuilderList() {
      if (inboxMsgPackBuilder_ != null) {
        return inboxMsgPackBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(inboxMsgPack_);
      }
    }
    /**
     * <code>repeated .inboxservice.InboxMessagePack inboxMsgPack = 2;</code>
     */
    public com.zachary.bifromq.inbox.rpc.proto.InboxMessagePack.Builder addInboxMsgPackBuilder() {
      return getInboxMsgPackFieldBuilder().addBuilder(
          com.zachary.bifromq.inbox.rpc.proto.InboxMessagePack.getDefaultInstance());
    }
    /**
     * <code>repeated .inboxservice.InboxMessagePack inboxMsgPack = 2;</code>
     */
    public com.zachary.bifromq.inbox.rpc.proto.InboxMessagePack.Builder addInboxMsgPackBuilder(
        int index) {
      return getInboxMsgPackFieldBuilder().addBuilder(
          index, com.zachary.bifromq.inbox.rpc.proto.InboxMessagePack.getDefaultInstance());
    }
    /**
     * <code>repeated .inboxservice.InboxMessagePack inboxMsgPack = 2;</code>
     */
    public java.util.List<com.zachary.bifromq.inbox.rpc.proto.InboxMessagePack.Builder> 
         getInboxMsgPackBuilderList() {
      return getInboxMsgPackFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.zachary.bifromq.inbox.rpc.proto.InboxMessagePack, com.zachary.bifromq.inbox.rpc.proto.InboxMessagePack.Builder, com.zachary.bifromq.inbox.rpc.proto.InboxMessagePackOrBuilder> 
        getInboxMsgPackFieldBuilder() {
      if (inboxMsgPackBuilder_ == null) {
        inboxMsgPackBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.zachary.bifromq.inbox.rpc.proto.InboxMessagePack, com.zachary.bifromq.inbox.rpc.proto.InboxMessagePack.Builder, com.zachary.bifromq.inbox.rpc.proto.InboxMessagePackOrBuilder>(
                inboxMsgPack_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        inboxMsgPack_ = null;
      }
      return inboxMsgPackBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:inboxservice.SendRequest)
  }

  // @@protoc_insertion_point(class_scope:inboxservice.SendRequest)
  private static final com.zachary.bifromq.inbox.rpc.proto.SendRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.zachary.bifromq.inbox.rpc.proto.SendRequest();
  }

  public static com.zachary.bifromq.inbox.rpc.proto.SendRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SendRequest>
      PARSER = new com.google.protobuf.AbstractParser<SendRequest>() {
    @java.lang.Override
    public SendRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<SendRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SendRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.zachary.bifromq.inbox.rpc.proto.SendRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

