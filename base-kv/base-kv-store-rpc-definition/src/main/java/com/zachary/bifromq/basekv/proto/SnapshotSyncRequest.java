// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: basekv/StoreMessage.proto

package com.zachary.bifromq.basekv.proto;

/**
 * Protobuf type {@code basekv.SnapshotSyncRequest}
 */
public final class SnapshotSyncRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:basekv.SnapshotSyncRequest)
    SnapshotSyncRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SnapshotSyncRequest.newBuilder() to construct.
  private SnapshotSyncRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SnapshotSyncRequest() {
    sessionId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SnapshotSyncRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.zachary.bifromq.basekv.proto.StoreMessageOuterClass.internal_static_basekv_SnapshotSyncRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.zachary.bifromq.basekv.proto.StoreMessageOuterClass.internal_static_basekv_SnapshotSyncRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.zachary.bifromq.basekv.proto.SnapshotSyncRequest.class, com.zachary.bifromq.basekv.proto.SnapshotSyncRequest.Builder.class);
  }

  public static final int SESSIONID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object sessionId_ = "";
  /**
   * <code>string sessionId = 1;</code>
   * @return The sessionId.
   */
  @java.lang.Override
  public java.lang.String getSessionId() {
    java.lang.Object ref = sessionId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sessionId_ = s;
      return s;
    }
  }
  /**
   * <code>string sessionId = 1;</code>
   * @return The bytes for sessionId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSessionIdBytes() {
    java.lang.Object ref = sessionId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      sessionId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SNAPSHOT_FIELD_NUMBER = 2;
  private com.zachary.bifromq.basekv.proto.KVRangeSnapshot snapshot_;
  /**
   * <code>.basekv.KVRangeSnapshot snapshot = 2;</code>
   * @return Whether the snapshot field is set.
   */
  @java.lang.Override
  public boolean hasSnapshot() {
    return snapshot_ != null;
  }
  /**
   * <code>.basekv.KVRangeSnapshot snapshot = 2;</code>
   * @return The snapshot.
   */
  @java.lang.Override
  public com.zachary.bifromq.basekv.proto.KVRangeSnapshot getSnapshot() {
    return snapshot_ == null ? com.zachary.bifromq.basekv.proto.KVRangeSnapshot.getDefaultInstance() : snapshot_;
  }
  /**
   * <code>.basekv.KVRangeSnapshot snapshot = 2;</code>
   */
  @java.lang.Override
  public com.zachary.bifromq.basekv.proto.KVRangeSnapshotOrBuilder getSnapshotOrBuilder() {
    return snapshot_ == null ? com.zachary.bifromq.basekv.proto.KVRangeSnapshot.getDefaultInstance() : snapshot_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sessionId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, sessionId_);
    }
    if (snapshot_ != null) {
      output.writeMessage(2, getSnapshot());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sessionId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, sessionId_);
    }
    if (snapshot_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getSnapshot());
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
    if (!(obj instanceof com.zachary.bifromq.basekv.proto.SnapshotSyncRequest)) {
      return super.equals(obj);
    }
    com.zachary.bifromq.basekv.proto.SnapshotSyncRequest other = (com.zachary.bifromq.basekv.proto.SnapshotSyncRequest) obj;

    if (!getSessionId()
        .equals(other.getSessionId())) return false;
    if (hasSnapshot() != other.hasSnapshot()) return false;
    if (hasSnapshot()) {
      if (!getSnapshot()
          .equals(other.getSnapshot())) return false;
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
    hash = (37 * hash) + SESSIONID_FIELD_NUMBER;
    hash = (53 * hash) + getSessionId().hashCode();
    if (hasSnapshot()) {
      hash = (37 * hash) + SNAPSHOT_FIELD_NUMBER;
      hash = (53 * hash) + getSnapshot().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.zachary.bifromq.basekv.proto.SnapshotSyncRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.zachary.bifromq.basekv.proto.SnapshotSyncRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.zachary.bifromq.basekv.proto.SnapshotSyncRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.zachary.bifromq.basekv.proto.SnapshotSyncRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.zachary.bifromq.basekv.proto.SnapshotSyncRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.zachary.bifromq.basekv.proto.SnapshotSyncRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.zachary.bifromq.basekv.proto.SnapshotSyncRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.zachary.bifromq.basekv.proto.SnapshotSyncRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.zachary.bifromq.basekv.proto.SnapshotSyncRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.zachary.bifromq.basekv.proto.SnapshotSyncRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.zachary.bifromq.basekv.proto.SnapshotSyncRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.zachary.bifromq.basekv.proto.SnapshotSyncRequest parseFrom(
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
  public static Builder newBuilder(com.zachary.bifromq.basekv.proto.SnapshotSyncRequest prototype) {
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
   * Protobuf type {@code basekv.SnapshotSyncRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:basekv.SnapshotSyncRequest)
      com.zachary.bifromq.basekv.proto.SnapshotSyncRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.zachary.bifromq.basekv.proto.StoreMessageOuterClass.internal_static_basekv_SnapshotSyncRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.zachary.bifromq.basekv.proto.StoreMessageOuterClass.internal_static_basekv_SnapshotSyncRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.zachary.bifromq.basekv.proto.SnapshotSyncRequest.class, com.zachary.bifromq.basekv.proto.SnapshotSyncRequest.Builder.class);
    }

    // Construct using com.zachary.bifromq.basekv.proto.SnapshotSyncRequest.newBuilder()
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
      sessionId_ = "";
      snapshot_ = null;
      if (snapshotBuilder_ != null) {
        snapshotBuilder_.dispose();
        snapshotBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.zachary.bifromq.basekv.proto.StoreMessageOuterClass.internal_static_basekv_SnapshotSyncRequest_descriptor;
    }

    @java.lang.Override
    public com.zachary.bifromq.basekv.proto.SnapshotSyncRequest getDefaultInstanceForType() {
      return com.zachary.bifromq.basekv.proto.SnapshotSyncRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.zachary.bifromq.basekv.proto.SnapshotSyncRequest build() {
      com.zachary.bifromq.basekv.proto.SnapshotSyncRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.zachary.bifromq.basekv.proto.SnapshotSyncRequest buildPartial() {
      com.zachary.bifromq.basekv.proto.SnapshotSyncRequest result = new com.zachary.bifromq.basekv.proto.SnapshotSyncRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.zachary.bifromq.basekv.proto.SnapshotSyncRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.sessionId_ = sessionId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.snapshot_ = snapshotBuilder_ == null
            ? snapshot_
            : snapshotBuilder_.build();
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
      if (other instanceof com.zachary.bifromq.basekv.proto.SnapshotSyncRequest) {
        return mergeFrom((com.zachary.bifromq.basekv.proto.SnapshotSyncRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.zachary.bifromq.basekv.proto.SnapshotSyncRequest other) {
      if (other == com.zachary.bifromq.basekv.proto.SnapshotSyncRequest.getDefaultInstance()) return this;
      if (!other.getSessionId().isEmpty()) {
        sessionId_ = other.sessionId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasSnapshot()) {
        mergeSnapshot(other.getSnapshot());
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
              sessionId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getSnapshotFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
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

    private java.lang.Object sessionId_ = "";
    /**
     * <code>string sessionId = 1;</code>
     * @return The sessionId.
     */
    public java.lang.String getSessionId() {
      java.lang.Object ref = sessionId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sessionId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string sessionId = 1;</code>
     * @return The bytes for sessionId.
     */
    public com.google.protobuf.ByteString
        getSessionIdBytes() {
      java.lang.Object ref = sessionId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sessionId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string sessionId = 1;</code>
     * @param value The sessionId to set.
     * @return This builder for chaining.
     */
    public Builder setSessionId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      sessionId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string sessionId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSessionId() {
      sessionId_ = getDefaultInstance().getSessionId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string sessionId = 1;</code>
     * @param value The bytes for sessionId to set.
     * @return This builder for chaining.
     */
    public Builder setSessionIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      sessionId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.zachary.bifromq.basekv.proto.KVRangeSnapshot snapshot_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.zachary.bifromq.basekv.proto.KVRangeSnapshot, com.zachary.bifromq.basekv.proto.KVRangeSnapshot.Builder, com.zachary.bifromq.basekv.proto.KVRangeSnapshotOrBuilder> snapshotBuilder_;
    /**
     * <code>.basekv.KVRangeSnapshot snapshot = 2;</code>
     * @return Whether the snapshot field is set.
     */
    public boolean hasSnapshot() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.basekv.KVRangeSnapshot snapshot = 2;</code>
     * @return The snapshot.
     */
    public com.zachary.bifromq.basekv.proto.KVRangeSnapshot getSnapshot() {
      if (snapshotBuilder_ == null) {
        return snapshot_ == null ? com.zachary.bifromq.basekv.proto.KVRangeSnapshot.getDefaultInstance() : snapshot_;
      } else {
        return snapshotBuilder_.getMessage();
      }
    }
    /**
     * <code>.basekv.KVRangeSnapshot snapshot = 2;</code>
     */
    public Builder setSnapshot(com.zachary.bifromq.basekv.proto.KVRangeSnapshot value) {
      if (snapshotBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        snapshot_ = value;
      } else {
        snapshotBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.basekv.KVRangeSnapshot snapshot = 2;</code>
     */
    public Builder setSnapshot(
        com.zachary.bifromq.basekv.proto.KVRangeSnapshot.Builder builderForValue) {
      if (snapshotBuilder_ == null) {
        snapshot_ = builderForValue.build();
      } else {
        snapshotBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.basekv.KVRangeSnapshot snapshot = 2;</code>
     */
    public Builder mergeSnapshot(com.zachary.bifromq.basekv.proto.KVRangeSnapshot value) {
      if (snapshotBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          snapshot_ != null &&
          snapshot_ != com.zachary.bifromq.basekv.proto.KVRangeSnapshot.getDefaultInstance()) {
          getSnapshotBuilder().mergeFrom(value);
        } else {
          snapshot_ = value;
        }
      } else {
        snapshotBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.basekv.KVRangeSnapshot snapshot = 2;</code>
     */
    public Builder clearSnapshot() {
      bitField0_ = (bitField0_ & ~0x00000002);
      snapshot_ = null;
      if (snapshotBuilder_ != null) {
        snapshotBuilder_.dispose();
        snapshotBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.basekv.KVRangeSnapshot snapshot = 2;</code>
     */
    public com.zachary.bifromq.basekv.proto.KVRangeSnapshot.Builder getSnapshotBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getSnapshotFieldBuilder().getBuilder();
    }
    /**
     * <code>.basekv.KVRangeSnapshot snapshot = 2;</code>
     */
    public com.zachary.bifromq.basekv.proto.KVRangeSnapshotOrBuilder getSnapshotOrBuilder() {
      if (snapshotBuilder_ != null) {
        return snapshotBuilder_.getMessageOrBuilder();
      } else {
        return snapshot_ == null ?
            com.zachary.bifromq.basekv.proto.KVRangeSnapshot.getDefaultInstance() : snapshot_;
      }
    }
    /**
     * <code>.basekv.KVRangeSnapshot snapshot = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.zachary.bifromq.basekv.proto.KVRangeSnapshot, com.zachary.bifromq.basekv.proto.KVRangeSnapshot.Builder, com.zachary.bifromq.basekv.proto.KVRangeSnapshotOrBuilder> 
        getSnapshotFieldBuilder() {
      if (snapshotBuilder_ == null) {
        snapshotBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.zachary.bifromq.basekv.proto.KVRangeSnapshot, com.zachary.bifromq.basekv.proto.KVRangeSnapshot.Builder, com.zachary.bifromq.basekv.proto.KVRangeSnapshotOrBuilder>(
                getSnapshot(),
                getParentForChildren(),
                isClean());
        snapshot_ = null;
      }
      return snapshotBuilder_;
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


    // @@protoc_insertion_point(builder_scope:basekv.SnapshotSyncRequest)
  }

  // @@protoc_insertion_point(class_scope:basekv.SnapshotSyncRequest)
  private static final com.zachary.bifromq.basekv.proto.SnapshotSyncRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.zachary.bifromq.basekv.proto.SnapshotSyncRequest();
  }

  public static com.zachary.bifromq.basekv.proto.SnapshotSyncRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SnapshotSyncRequest>
      PARSER = new com.google.protobuf.AbstractParser<SnapshotSyncRequest>() {
    @java.lang.Override
    public SnapshotSyncRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<SnapshotSyncRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SnapshotSyncRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.zachary.bifromq.basekv.proto.SnapshotSyncRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

