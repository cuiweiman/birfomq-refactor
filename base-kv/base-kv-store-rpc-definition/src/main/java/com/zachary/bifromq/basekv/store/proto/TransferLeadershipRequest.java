// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: basekv/BaseKVStoreService.proto

package com.zachary.bifromq.basekv.store.proto;

/**
 * Protobuf type {@code basekv.TransferLeadershipRequest}
 */
public final class TransferLeadershipRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:basekv.TransferLeadershipRequest)
    TransferLeadershipRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TransferLeadershipRequest.newBuilder() to construct.
  private TransferLeadershipRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TransferLeadershipRequest() {
    newLeaderStore_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TransferLeadershipRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.zachary.bifromq.basekv.store.proto.BaseKVStoreServiceOuterClass.internal_static_basekv_TransferLeadershipRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.zachary.bifromq.basekv.store.proto.BaseKVStoreServiceOuterClass.internal_static_basekv_TransferLeadershipRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.zachary.bifromq.basekv.store.proto.TransferLeadershipRequest.class, com.zachary.bifromq.basekv.store.proto.TransferLeadershipRequest.Builder.class);
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

  public static final int VER_FIELD_NUMBER = 2;
  private long ver_ = 0L;
  /**
   * <code>uint64 ver = 2;</code>
   * @return The ver.
   */
  @java.lang.Override
  public long getVer() {
    return ver_;
  }

  public static final int KVRANGEID_FIELD_NUMBER = 3;
  private com.zachary.bifromq.basekv.proto.KVRangeId kvRangeId_;
  /**
   * <code>.basekv.KVRangeId kvRangeId = 3;</code>
   * @return Whether the kvRangeId field is set.
   */
  @java.lang.Override
  public boolean hasKvRangeId() {
    return kvRangeId_ != null;
  }
  /**
   * <code>.basekv.KVRangeId kvRangeId = 3;</code>
   * @return The kvRangeId.
   */
  @java.lang.Override
  public com.zachary.bifromq.basekv.proto.KVRangeId getKvRangeId() {
    return kvRangeId_ == null ? com.zachary.bifromq.basekv.proto.KVRangeId.getDefaultInstance() : kvRangeId_;
  }
  /**
   * <code>.basekv.KVRangeId kvRangeId = 3;</code>
   */
  @java.lang.Override
  public com.zachary.bifromq.basekv.proto.KVRangeIdOrBuilder getKvRangeIdOrBuilder() {
    return kvRangeId_ == null ? com.zachary.bifromq.basekv.proto.KVRangeId.getDefaultInstance() : kvRangeId_;
  }

  public static final int NEWLEADERSTORE_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object newLeaderStore_ = "";
  /**
   * <code>string newLeaderStore = 4;</code>
   * @return The newLeaderStore.
   */
  @java.lang.Override
  public java.lang.String getNewLeaderStore() {
    java.lang.Object ref = newLeaderStore_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      newLeaderStore_ = s;
      return s;
    }
  }
  /**
   * <code>string newLeaderStore = 4;</code>
   * @return The bytes for newLeaderStore.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNewLeaderStoreBytes() {
    java.lang.Object ref = newLeaderStore_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      newLeaderStore_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (ver_ != 0L) {
      output.writeUInt64(2, ver_);
    }
    if (kvRangeId_ != null) {
      output.writeMessage(3, getKvRangeId());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(newLeaderStore_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, newLeaderStore_);
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
    if (ver_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, ver_);
    }
    if (kvRangeId_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getKvRangeId());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(newLeaderStore_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, newLeaderStore_);
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
    if (!(obj instanceof com.zachary.bifromq.basekv.store.proto.TransferLeadershipRequest)) {
      return super.equals(obj);
    }
    com.zachary.bifromq.basekv.store.proto.TransferLeadershipRequest other = (com.zachary.bifromq.basekv.store.proto.TransferLeadershipRequest) obj;

    if (getReqId()
        != other.getReqId()) return false;
    if (getVer()
        != other.getVer()) return false;
    if (hasKvRangeId() != other.hasKvRangeId()) return false;
    if (hasKvRangeId()) {
      if (!getKvRangeId()
          .equals(other.getKvRangeId())) return false;
    }
    if (!getNewLeaderStore()
        .equals(other.getNewLeaderStore())) return false;
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
    hash = (37 * hash) + VER_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getVer());
    if (hasKvRangeId()) {
      hash = (37 * hash) + KVRANGEID_FIELD_NUMBER;
      hash = (53 * hash) + getKvRangeId().hashCode();
    }
    hash = (37 * hash) + NEWLEADERSTORE_FIELD_NUMBER;
    hash = (53 * hash) + getNewLeaderStore().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.zachary.bifromq.basekv.store.proto.TransferLeadershipRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.zachary.bifromq.basekv.store.proto.TransferLeadershipRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.zachary.bifromq.basekv.store.proto.TransferLeadershipRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.zachary.bifromq.basekv.store.proto.TransferLeadershipRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.zachary.bifromq.basekv.store.proto.TransferLeadershipRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.zachary.bifromq.basekv.store.proto.TransferLeadershipRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.zachary.bifromq.basekv.store.proto.TransferLeadershipRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.zachary.bifromq.basekv.store.proto.TransferLeadershipRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.zachary.bifromq.basekv.store.proto.TransferLeadershipRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.zachary.bifromq.basekv.store.proto.TransferLeadershipRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.zachary.bifromq.basekv.store.proto.TransferLeadershipRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.zachary.bifromq.basekv.store.proto.TransferLeadershipRequest parseFrom(
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
  public static Builder newBuilder(com.zachary.bifromq.basekv.store.proto.TransferLeadershipRequest prototype) {
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
   * Protobuf type {@code basekv.TransferLeadershipRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:basekv.TransferLeadershipRequest)
      com.zachary.bifromq.basekv.store.proto.TransferLeadershipRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.zachary.bifromq.basekv.store.proto.BaseKVStoreServiceOuterClass.internal_static_basekv_TransferLeadershipRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.zachary.bifromq.basekv.store.proto.BaseKVStoreServiceOuterClass.internal_static_basekv_TransferLeadershipRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.zachary.bifromq.basekv.store.proto.TransferLeadershipRequest.class, com.zachary.bifromq.basekv.store.proto.TransferLeadershipRequest.Builder.class);
    }

    // Construct using com.zachary.bifromq.basekv.store.proto.TransferLeadershipRequest.newBuilder()
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
      ver_ = 0L;
      kvRangeId_ = null;
      if (kvRangeIdBuilder_ != null) {
        kvRangeIdBuilder_.dispose();
        kvRangeIdBuilder_ = null;
      }
      newLeaderStore_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.zachary.bifromq.basekv.store.proto.BaseKVStoreServiceOuterClass.internal_static_basekv_TransferLeadershipRequest_descriptor;
    }

    @java.lang.Override
    public com.zachary.bifromq.basekv.store.proto.TransferLeadershipRequest getDefaultInstanceForType() {
      return com.zachary.bifromq.basekv.store.proto.TransferLeadershipRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.zachary.bifromq.basekv.store.proto.TransferLeadershipRequest build() {
      com.zachary.bifromq.basekv.store.proto.TransferLeadershipRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.zachary.bifromq.basekv.store.proto.TransferLeadershipRequest buildPartial() {
      com.zachary.bifromq.basekv.store.proto.TransferLeadershipRequest result = new com.zachary.bifromq.basekv.store.proto.TransferLeadershipRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.zachary.bifromq.basekv.store.proto.TransferLeadershipRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.reqId_ = reqId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.ver_ = ver_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.kvRangeId_ = kvRangeIdBuilder_ == null
            ? kvRangeId_
            : kvRangeIdBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.newLeaderStore_ = newLeaderStore_;
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
      if (other instanceof com.zachary.bifromq.basekv.store.proto.TransferLeadershipRequest) {
        return mergeFrom((com.zachary.bifromq.basekv.store.proto.TransferLeadershipRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.zachary.bifromq.basekv.store.proto.TransferLeadershipRequest other) {
      if (other == com.zachary.bifromq.basekv.store.proto.TransferLeadershipRequest.getDefaultInstance()) return this;
      if (other.getReqId() != 0L) {
        setReqId(other.getReqId());
      }
      if (other.getVer() != 0L) {
        setVer(other.getVer());
      }
      if (other.hasKvRangeId()) {
        mergeKvRangeId(other.getKvRangeId());
      }
      if (!other.getNewLeaderStore().isEmpty()) {
        newLeaderStore_ = other.newLeaderStore_;
        bitField0_ |= 0x00000008;
        onChanged();
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
            case 16: {
              ver_ = input.readUInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              input.readMessage(
                  getKvRangeIdFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              newLeaderStore_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
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

    private long ver_ ;
    /**
     * <code>uint64 ver = 2;</code>
     * @return The ver.
     */
    @java.lang.Override
    public long getVer() {
      return ver_;
    }
    /**
     * <code>uint64 ver = 2;</code>
     * @param value The ver to set.
     * @return This builder for chaining.
     */
    public Builder setVer(long value) {
      
      ver_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 ver = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearVer() {
      bitField0_ = (bitField0_ & ~0x00000002);
      ver_ = 0L;
      onChanged();
      return this;
    }

    private com.zachary.bifromq.basekv.proto.KVRangeId kvRangeId_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.zachary.bifromq.basekv.proto.KVRangeId, com.zachary.bifromq.basekv.proto.KVRangeId.Builder, com.zachary.bifromq.basekv.proto.KVRangeIdOrBuilder> kvRangeIdBuilder_;
    /**
     * <code>.basekv.KVRangeId kvRangeId = 3;</code>
     * @return Whether the kvRangeId field is set.
     */
    public boolean hasKvRangeId() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>.basekv.KVRangeId kvRangeId = 3;</code>
     * @return The kvRangeId.
     */
    public com.zachary.bifromq.basekv.proto.KVRangeId getKvRangeId() {
      if (kvRangeIdBuilder_ == null) {
        return kvRangeId_ == null ? com.zachary.bifromq.basekv.proto.KVRangeId.getDefaultInstance() : kvRangeId_;
      } else {
        return kvRangeIdBuilder_.getMessage();
      }
    }
    /**
     * <code>.basekv.KVRangeId kvRangeId = 3;</code>
     */
    public Builder setKvRangeId(com.zachary.bifromq.basekv.proto.KVRangeId value) {
      if (kvRangeIdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        kvRangeId_ = value;
      } else {
        kvRangeIdBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.basekv.KVRangeId kvRangeId = 3;</code>
     */
    public Builder setKvRangeId(
        com.zachary.bifromq.basekv.proto.KVRangeId.Builder builderForValue) {
      if (kvRangeIdBuilder_ == null) {
        kvRangeId_ = builderForValue.build();
      } else {
        kvRangeIdBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.basekv.KVRangeId kvRangeId = 3;</code>
     */
    public Builder mergeKvRangeId(com.zachary.bifromq.basekv.proto.KVRangeId value) {
      if (kvRangeIdBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          kvRangeId_ != null &&
          kvRangeId_ != com.zachary.bifromq.basekv.proto.KVRangeId.getDefaultInstance()) {
          getKvRangeIdBuilder().mergeFrom(value);
        } else {
          kvRangeId_ = value;
        }
      } else {
        kvRangeIdBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.basekv.KVRangeId kvRangeId = 3;</code>
     */
    public Builder clearKvRangeId() {
      bitField0_ = (bitField0_ & ~0x00000004);
      kvRangeId_ = null;
      if (kvRangeIdBuilder_ != null) {
        kvRangeIdBuilder_.dispose();
        kvRangeIdBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.basekv.KVRangeId kvRangeId = 3;</code>
     */
    public com.zachary.bifromq.basekv.proto.KVRangeId.Builder getKvRangeIdBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getKvRangeIdFieldBuilder().getBuilder();
    }
    /**
     * <code>.basekv.KVRangeId kvRangeId = 3;</code>
     */
    public com.zachary.bifromq.basekv.proto.KVRangeIdOrBuilder getKvRangeIdOrBuilder() {
      if (kvRangeIdBuilder_ != null) {
        return kvRangeIdBuilder_.getMessageOrBuilder();
      } else {
        return kvRangeId_ == null ?
            com.zachary.bifromq.basekv.proto.KVRangeId.getDefaultInstance() : kvRangeId_;
      }
    }
    /**
     * <code>.basekv.KVRangeId kvRangeId = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.zachary.bifromq.basekv.proto.KVRangeId, com.zachary.bifromq.basekv.proto.KVRangeId.Builder, com.zachary.bifromq.basekv.proto.KVRangeIdOrBuilder> 
        getKvRangeIdFieldBuilder() {
      if (kvRangeIdBuilder_ == null) {
        kvRangeIdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.zachary.bifromq.basekv.proto.KVRangeId, com.zachary.bifromq.basekv.proto.KVRangeId.Builder, com.zachary.bifromq.basekv.proto.KVRangeIdOrBuilder>(
                getKvRangeId(),
                getParentForChildren(),
                isClean());
        kvRangeId_ = null;
      }
      return kvRangeIdBuilder_;
    }

    private java.lang.Object newLeaderStore_ = "";
    /**
     * <code>string newLeaderStore = 4;</code>
     * @return The newLeaderStore.
     */
    public java.lang.String getNewLeaderStore() {
      java.lang.Object ref = newLeaderStore_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        newLeaderStore_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string newLeaderStore = 4;</code>
     * @return The bytes for newLeaderStore.
     */
    public com.google.protobuf.ByteString
        getNewLeaderStoreBytes() {
      java.lang.Object ref = newLeaderStore_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        newLeaderStore_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string newLeaderStore = 4;</code>
     * @param value The newLeaderStore to set.
     * @return This builder for chaining.
     */
    public Builder setNewLeaderStore(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      newLeaderStore_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>string newLeaderStore = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearNewLeaderStore() {
      newLeaderStore_ = getDefaultInstance().getNewLeaderStore();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>string newLeaderStore = 4;</code>
     * @param value The bytes for newLeaderStore to set.
     * @return This builder for chaining.
     */
    public Builder setNewLeaderStoreBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      newLeaderStore_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:basekv.TransferLeadershipRequest)
  }

  // @@protoc_insertion_point(class_scope:basekv.TransferLeadershipRequest)
  private static final com.zachary.bifromq.basekv.store.proto.TransferLeadershipRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.zachary.bifromq.basekv.store.proto.TransferLeadershipRequest();
  }

  public static com.zachary.bifromq.basekv.store.proto.TransferLeadershipRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TransferLeadershipRequest>
      PARSER = new com.google.protobuf.AbstractParser<TransferLeadershipRequest>() {
    @java.lang.Override
    public TransferLeadershipRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<TransferLeadershipRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TransferLeadershipRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.zachary.bifromq.basekv.store.proto.TransferLeadershipRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

