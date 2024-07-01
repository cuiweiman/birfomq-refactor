// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: inboxservice/InboxCoProc.proto

package com.zachary.bifromq.inbox.storage.proto;

/**
 * Protobuf type {@code inboxservice.InboxServiceROCoProcOutput}
 */
public final class InboxServiceROCoProcOutput extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:inboxservice.InboxServiceROCoProcOutput)
    InboxServiceROCoProcOutputOrBuilder {
private static final long serialVersionUID = 0L;
  // Use InboxServiceROCoProcOutput.newBuilder() to construct.
  private InboxServiceROCoProcOutput(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InboxServiceROCoProcOutput() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new InboxServiceROCoProcOutput();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.zachary.bifromq.inbox.storage.proto.InboxCoProcProtos.internal_static_inboxservice_InboxServiceROCoProcOutput_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.zachary.bifromq.inbox.storage.proto.InboxCoProcProtos.internal_static_inboxservice_InboxServiceROCoProcOutput_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.zachary.bifromq.inbox.storage.proto.InboxServiceROCoProcOutput.class, com.zachary.bifromq.inbox.storage.proto.InboxServiceROCoProcOutput.Builder.class);
  }

  public static final int REPLY_FIELD_NUMBER = 1;
  private com.zachary.bifromq.inbox.storage.proto.QueryReply reply_;
  /**
   * <code>.inboxservice.QueryReply reply = 1;</code>
   * @return Whether the reply field is set.
   */
  @java.lang.Override
  public boolean hasReply() {
    return reply_ != null;
  }
  /**
   * <code>.inboxservice.QueryReply reply = 1;</code>
   * @return The reply.
   */
  @java.lang.Override
  public com.zachary.bifromq.inbox.storage.proto.QueryReply getReply() {
    return reply_ == null ? com.zachary.bifromq.inbox.storage.proto.QueryReply.getDefaultInstance() : reply_;
  }
  /**
   * <code>.inboxservice.QueryReply reply = 1;</code>
   */
  @java.lang.Override
  public com.zachary.bifromq.inbox.storage.proto.QueryReplyOrBuilder getReplyOrBuilder() {
    return reply_ == null ? com.zachary.bifromq.inbox.storage.proto.QueryReply.getDefaultInstance() : reply_;
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
    if (reply_ != null) {
      output.writeMessage(1, getReply());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (reply_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getReply());
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
    if (!(obj instanceof com.zachary.bifromq.inbox.storage.proto.InboxServiceROCoProcOutput)) {
      return super.equals(obj);
    }
    com.zachary.bifromq.inbox.storage.proto.InboxServiceROCoProcOutput other = (com.zachary.bifromq.inbox.storage.proto.InboxServiceROCoProcOutput) obj;

    if (hasReply() != other.hasReply()) return false;
    if (hasReply()) {
      if (!getReply()
          .equals(other.getReply())) return false;
    }
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
    if (hasReply()) {
      hash = (37 * hash) + REPLY_FIELD_NUMBER;
      hash = (53 * hash) + getReply().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.zachary.bifromq.inbox.storage.proto.InboxServiceROCoProcOutput parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.zachary.bifromq.inbox.storage.proto.InboxServiceROCoProcOutput parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.zachary.bifromq.inbox.storage.proto.InboxServiceROCoProcOutput parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.zachary.bifromq.inbox.storage.proto.InboxServiceROCoProcOutput parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.zachary.bifromq.inbox.storage.proto.InboxServiceROCoProcOutput parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.zachary.bifromq.inbox.storage.proto.InboxServiceROCoProcOutput parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.zachary.bifromq.inbox.storage.proto.InboxServiceROCoProcOutput parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.zachary.bifromq.inbox.storage.proto.InboxServiceROCoProcOutput parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.zachary.bifromq.inbox.storage.proto.InboxServiceROCoProcOutput parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.zachary.bifromq.inbox.storage.proto.InboxServiceROCoProcOutput parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.zachary.bifromq.inbox.storage.proto.InboxServiceROCoProcOutput parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.zachary.bifromq.inbox.storage.proto.InboxServiceROCoProcOutput parseFrom(
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
  public static Builder newBuilder(com.zachary.bifromq.inbox.storage.proto.InboxServiceROCoProcOutput prototype) {
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
   * Protobuf type {@code inboxservice.InboxServiceROCoProcOutput}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:inboxservice.InboxServiceROCoProcOutput)
      com.zachary.bifromq.inbox.storage.proto.InboxServiceROCoProcOutputOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.zachary.bifromq.inbox.storage.proto.InboxCoProcProtos.internal_static_inboxservice_InboxServiceROCoProcOutput_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.zachary.bifromq.inbox.storage.proto.InboxCoProcProtos.internal_static_inboxservice_InboxServiceROCoProcOutput_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.zachary.bifromq.inbox.storage.proto.InboxServiceROCoProcOutput.class, com.zachary.bifromq.inbox.storage.proto.InboxServiceROCoProcOutput.Builder.class);
    }

    // Construct using com.zachary.bifromq.inbox.storage.proto.InboxServiceROCoProcOutput.newBuilder()
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
      reply_ = null;
      if (replyBuilder_ != null) {
        replyBuilder_.dispose();
        replyBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.zachary.bifromq.inbox.storage.proto.InboxCoProcProtos.internal_static_inboxservice_InboxServiceROCoProcOutput_descriptor;
    }

    @java.lang.Override
    public com.zachary.bifromq.inbox.storage.proto.InboxServiceROCoProcOutput getDefaultInstanceForType() {
      return com.zachary.bifromq.inbox.storage.proto.InboxServiceROCoProcOutput.getDefaultInstance();
    }

    @java.lang.Override
    public com.zachary.bifromq.inbox.storage.proto.InboxServiceROCoProcOutput build() {
      com.zachary.bifromq.inbox.storage.proto.InboxServiceROCoProcOutput result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.zachary.bifromq.inbox.storage.proto.InboxServiceROCoProcOutput buildPartial() {
      com.zachary.bifromq.inbox.storage.proto.InboxServiceROCoProcOutput result = new com.zachary.bifromq.inbox.storage.proto.InboxServiceROCoProcOutput(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.zachary.bifromq.inbox.storage.proto.InboxServiceROCoProcOutput result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.reply_ = replyBuilder_ == null
            ? reply_
            : replyBuilder_.build();
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
      if (other instanceof com.zachary.bifromq.inbox.storage.proto.InboxServiceROCoProcOutput) {
        return mergeFrom((com.zachary.bifromq.inbox.storage.proto.InboxServiceROCoProcOutput)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.zachary.bifromq.inbox.storage.proto.InboxServiceROCoProcOutput other) {
      if (other == com.zachary.bifromq.inbox.storage.proto.InboxServiceROCoProcOutput.getDefaultInstance()) return this;
      if (other.hasReply()) {
        mergeReply(other.getReply());
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
            case 10: {
              input.readMessage(
                  getReplyFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
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

    private com.zachary.bifromq.inbox.storage.proto.QueryReply reply_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.zachary.bifromq.inbox.storage.proto.QueryReply, com.zachary.bifromq.inbox.storage.proto.QueryReply.Builder, com.zachary.bifromq.inbox.storage.proto.QueryReplyOrBuilder> replyBuilder_;
    /**
     * <code>.inboxservice.QueryReply reply = 1;</code>
     * @return Whether the reply field is set.
     */
    public boolean hasReply() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.inboxservice.QueryReply reply = 1;</code>
     * @return The reply.
     */
    public com.zachary.bifromq.inbox.storage.proto.QueryReply getReply() {
      if (replyBuilder_ == null) {
        return reply_ == null ? com.zachary.bifromq.inbox.storage.proto.QueryReply.getDefaultInstance() : reply_;
      } else {
        return replyBuilder_.getMessage();
      }
    }
    /**
     * <code>.inboxservice.QueryReply reply = 1;</code>
     */
    public Builder setReply(com.zachary.bifromq.inbox.storage.proto.QueryReply value) {
      if (replyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        reply_ = value;
      } else {
        replyBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.inboxservice.QueryReply reply = 1;</code>
     */
    public Builder setReply(
        com.zachary.bifromq.inbox.storage.proto.QueryReply.Builder builderForValue) {
      if (replyBuilder_ == null) {
        reply_ = builderForValue.build();
      } else {
        replyBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.inboxservice.QueryReply reply = 1;</code>
     */
    public Builder mergeReply(com.zachary.bifromq.inbox.storage.proto.QueryReply value) {
      if (replyBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          reply_ != null &&
          reply_ != com.zachary.bifromq.inbox.storage.proto.QueryReply.getDefaultInstance()) {
          getReplyBuilder().mergeFrom(value);
        } else {
          reply_ = value;
        }
      } else {
        replyBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.inboxservice.QueryReply reply = 1;</code>
     */
    public Builder clearReply() {
      bitField0_ = (bitField0_ & ~0x00000001);
      reply_ = null;
      if (replyBuilder_ != null) {
        replyBuilder_.dispose();
        replyBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.inboxservice.QueryReply reply = 1;</code>
     */
    public com.zachary.bifromq.inbox.storage.proto.QueryReply.Builder getReplyBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getReplyFieldBuilder().getBuilder();
    }
    /**
     * <code>.inboxservice.QueryReply reply = 1;</code>
     */
    public com.zachary.bifromq.inbox.storage.proto.QueryReplyOrBuilder getReplyOrBuilder() {
      if (replyBuilder_ != null) {
        return replyBuilder_.getMessageOrBuilder();
      } else {
        return reply_ == null ?
            com.zachary.bifromq.inbox.storage.proto.QueryReply.getDefaultInstance() : reply_;
      }
    }
    /**
     * <code>.inboxservice.QueryReply reply = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.zachary.bifromq.inbox.storage.proto.QueryReply, com.zachary.bifromq.inbox.storage.proto.QueryReply.Builder, com.zachary.bifromq.inbox.storage.proto.QueryReplyOrBuilder> 
        getReplyFieldBuilder() {
      if (replyBuilder_ == null) {
        replyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.zachary.bifromq.inbox.storage.proto.QueryReply, com.zachary.bifromq.inbox.storage.proto.QueryReply.Builder, com.zachary.bifromq.inbox.storage.proto.QueryReplyOrBuilder>(
                getReply(),
                getParentForChildren(),
                isClean());
        reply_ = null;
      }
      return replyBuilder_;
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


    // @@protoc_insertion_point(builder_scope:inboxservice.InboxServiceROCoProcOutput)
  }

  // @@protoc_insertion_point(class_scope:inboxservice.InboxServiceROCoProcOutput)
  private static final com.zachary.bifromq.inbox.storage.proto.InboxServiceROCoProcOutput DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.zachary.bifromq.inbox.storage.proto.InboxServiceROCoProcOutput();
  }

  public static com.zachary.bifromq.inbox.storage.proto.InboxServiceROCoProcOutput getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InboxServiceROCoProcOutput>
      PARSER = new com.google.protobuf.AbstractParser<InboxServiceROCoProcOutput>() {
    @java.lang.Override
    public InboxServiceROCoProcOutput parsePartialFrom(
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

  public static com.google.protobuf.Parser<InboxServiceROCoProcOutput> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InboxServiceROCoProcOutput> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.zachary.bifromq.inbox.storage.proto.InboxServiceROCoProcOutput getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

