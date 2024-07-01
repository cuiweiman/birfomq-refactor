// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: basekv/BaseKVStoreService.proto

package com.zachary.bifromq.basekv.store.proto;

/**
 * Protobuf type {@code basekv.KVRangeRORequest}
 */
public final class KVRangeRORequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:basekv.KVRangeRORequest)
    KVRangeRORequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use KVRangeRORequest.newBuilder() to construct.
  private KVRangeRORequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private KVRangeRORequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new KVRangeRORequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.zachary.bifromq.basekv.store.proto.BaseKVStoreServiceOuterClass.internal_static_basekv_KVRangeRORequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.zachary.bifromq.basekv.store.proto.BaseKVStoreServiceOuterClass.internal_static_basekv_KVRangeRORequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.zachary.bifromq.basekv.store.proto.KVRangeRORequest.class, com.zachary.bifromq.basekv.store.proto.KVRangeRORequest.Builder.class);
  }

  private int typeCase_ = 0;
  private java.lang.Object type_;
  public enum TypeCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    EXISTKEY(4),
    GETKEY(5),
    ROCOPROCINPUT(6),
    TYPE_NOT_SET(0);
    private final int value;
    private TypeCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static TypeCase valueOf(int value) {
      return forNumber(value);
    }

    public static TypeCase forNumber(int value) {
      switch (value) {
        case 4: return EXISTKEY;
        case 5: return GETKEY;
        case 6: return ROCOPROCINPUT;
        case 0: return TYPE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public TypeCase
  getTypeCase() {
    return TypeCase.forNumber(
        typeCase_);
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

  public static final int EXISTKEY_FIELD_NUMBER = 4;
  /**
   * <code>bytes existKey = 4;</code>
   * @return Whether the existKey field is set.
   */
  @java.lang.Override
  public boolean hasExistKey() {
    return typeCase_ == 4;
  }
  /**
   * <code>bytes existKey = 4;</code>
   * @return The existKey.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getExistKey() {
    if (typeCase_ == 4) {
      return (com.google.protobuf.ByteString) type_;
    }
    return com.google.protobuf.ByteString.EMPTY;
  }

  public static final int GETKEY_FIELD_NUMBER = 5;
  /**
   * <code>bytes getKey = 5;</code>
   * @return Whether the getKey field is set.
   */
  @java.lang.Override
  public boolean hasGetKey() {
    return typeCase_ == 5;
  }
  /**
   * <code>bytes getKey = 5;</code>
   * @return The getKey.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getGetKey() {
    if (typeCase_ == 5) {
      return (com.google.protobuf.ByteString) type_;
    }
    return com.google.protobuf.ByteString.EMPTY;
  }

  public static final int ROCOPROCINPUT_FIELD_NUMBER = 6;
  /**
   * <code>bytes roCoProcInput = 6;</code>
   * @return Whether the roCoProcInput field is set.
   */
  @java.lang.Override
  public boolean hasRoCoProcInput() {
    return typeCase_ == 6;
  }
  /**
   * <code>bytes roCoProcInput = 6;</code>
   * @return The roCoProcInput.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getRoCoProcInput() {
    if (typeCase_ == 6) {
      return (com.google.protobuf.ByteString) type_;
    }
    return com.google.protobuf.ByteString.EMPTY;
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
    if (typeCase_ == 4) {
      output.writeBytes(
          4, (com.google.protobuf.ByteString) type_);
    }
    if (typeCase_ == 5) {
      output.writeBytes(
          5, (com.google.protobuf.ByteString) type_);
    }
    if (typeCase_ == 6) {
      output.writeBytes(
          6, (com.google.protobuf.ByteString) type_);
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
    if (typeCase_ == 4) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(
            4, (com.google.protobuf.ByteString) type_);
    }
    if (typeCase_ == 5) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(
            5, (com.google.protobuf.ByteString) type_);
    }
    if (typeCase_ == 6) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(
            6, (com.google.protobuf.ByteString) type_);
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
    if (!(obj instanceof com.zachary.bifromq.basekv.store.proto.KVRangeRORequest)) {
      return super.equals(obj);
    }
    com.zachary.bifromq.basekv.store.proto.KVRangeRORequest other = (com.zachary.bifromq.basekv.store.proto.KVRangeRORequest) obj;

    if (getReqId()
        != other.getReqId()) return false;
    if (getVer()
        != other.getVer()) return false;
    if (hasKvRangeId() != other.hasKvRangeId()) return false;
    if (hasKvRangeId()) {
      if (!getKvRangeId()
          .equals(other.getKvRangeId())) return false;
    }
    if (!getTypeCase().equals(other.getTypeCase())) return false;
    switch (typeCase_) {
      case 4:
        if (!getExistKey()
            .equals(other.getExistKey())) return false;
        break;
      case 5:
        if (!getGetKey()
            .equals(other.getGetKey())) return false;
        break;
      case 6:
        if (!getRoCoProcInput()
            .equals(other.getRoCoProcInput())) return false;
        break;
      case 0:
      default:
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
    switch (typeCase_) {
      case 4:
        hash = (37 * hash) + EXISTKEY_FIELD_NUMBER;
        hash = (53 * hash) + getExistKey().hashCode();
        break;
      case 5:
        hash = (37 * hash) + GETKEY_FIELD_NUMBER;
        hash = (53 * hash) + getGetKey().hashCode();
        break;
      case 6:
        hash = (37 * hash) + ROCOPROCINPUT_FIELD_NUMBER;
        hash = (53 * hash) + getRoCoProcInput().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.zachary.bifromq.basekv.store.proto.KVRangeRORequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.zachary.bifromq.basekv.store.proto.KVRangeRORequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.zachary.bifromq.basekv.store.proto.KVRangeRORequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.zachary.bifromq.basekv.store.proto.KVRangeRORequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.zachary.bifromq.basekv.store.proto.KVRangeRORequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.zachary.bifromq.basekv.store.proto.KVRangeRORequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.zachary.bifromq.basekv.store.proto.KVRangeRORequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.zachary.bifromq.basekv.store.proto.KVRangeRORequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.zachary.bifromq.basekv.store.proto.KVRangeRORequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.zachary.bifromq.basekv.store.proto.KVRangeRORequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.zachary.bifromq.basekv.store.proto.KVRangeRORequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.zachary.bifromq.basekv.store.proto.KVRangeRORequest parseFrom(
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
  public static Builder newBuilder(com.zachary.bifromq.basekv.store.proto.KVRangeRORequest prototype) {
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
   * Protobuf type {@code basekv.KVRangeRORequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:basekv.KVRangeRORequest)
      com.zachary.bifromq.basekv.store.proto.KVRangeRORequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.zachary.bifromq.basekv.store.proto.BaseKVStoreServiceOuterClass.internal_static_basekv_KVRangeRORequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.zachary.bifromq.basekv.store.proto.BaseKVStoreServiceOuterClass.internal_static_basekv_KVRangeRORequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.zachary.bifromq.basekv.store.proto.KVRangeRORequest.class, com.zachary.bifromq.basekv.store.proto.KVRangeRORequest.Builder.class);
    }

    // Construct using com.zachary.bifromq.basekv.store.proto.KVRangeRORequest.newBuilder()
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
      typeCase_ = 0;
      type_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.zachary.bifromq.basekv.store.proto.BaseKVStoreServiceOuterClass.internal_static_basekv_KVRangeRORequest_descriptor;
    }

    @java.lang.Override
    public com.zachary.bifromq.basekv.store.proto.KVRangeRORequest getDefaultInstanceForType() {
      return com.zachary.bifromq.basekv.store.proto.KVRangeRORequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.zachary.bifromq.basekv.store.proto.KVRangeRORequest build() {
      com.zachary.bifromq.basekv.store.proto.KVRangeRORequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.zachary.bifromq.basekv.store.proto.KVRangeRORequest buildPartial() {
      com.zachary.bifromq.basekv.store.proto.KVRangeRORequest result = new com.zachary.bifromq.basekv.store.proto.KVRangeRORequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.zachary.bifromq.basekv.store.proto.KVRangeRORequest result) {
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
    }

    private void buildPartialOneofs(com.zachary.bifromq.basekv.store.proto.KVRangeRORequest result) {
      result.typeCase_ = typeCase_;
      result.type_ = this.type_;
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
      if (other instanceof com.zachary.bifromq.basekv.store.proto.KVRangeRORequest) {
        return mergeFrom((com.zachary.bifromq.basekv.store.proto.KVRangeRORequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.zachary.bifromq.basekv.store.proto.KVRangeRORequest other) {
      if (other == com.zachary.bifromq.basekv.store.proto.KVRangeRORequest.getDefaultInstance()) return this;
      if (other.getReqId() != 0L) {
        setReqId(other.getReqId());
      }
      if (other.getVer() != 0L) {
        setVer(other.getVer());
      }
      if (other.hasKvRangeId()) {
        mergeKvRangeId(other.getKvRangeId());
      }
      switch (other.getTypeCase()) {
        case EXISTKEY: {
          setExistKey(other.getExistKey());
          break;
        }
        case GETKEY: {
          setGetKey(other.getGetKey());
          break;
        }
        case ROCOPROCINPUT: {
          setRoCoProcInput(other.getRoCoProcInput());
          break;
        }
        case TYPE_NOT_SET: {
          break;
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
              type_ = input.readBytes();
              typeCase_ = 4;
              break;
            } // case 34
            case 42: {
              type_ = input.readBytes();
              typeCase_ = 5;
              break;
            } // case 42
            case 50: {
              type_ = input.readBytes();
              typeCase_ = 6;
              break;
            } // case 50
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
    private int typeCase_ = 0;
    private java.lang.Object type_;
    public TypeCase
        getTypeCase() {
      return TypeCase.forNumber(
          typeCase_);
    }

    public Builder clearType() {
      typeCase_ = 0;
      type_ = null;
      onChanged();
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

    /**
     * <code>bytes existKey = 4;</code>
     * @return Whether the existKey field is set.
     */
    public boolean hasExistKey() {
      return typeCase_ == 4;
    }
    /**
     * <code>bytes existKey = 4;</code>
     * @return The existKey.
     */
    public com.google.protobuf.ByteString getExistKey() {
      if (typeCase_ == 4) {
        return (com.google.protobuf.ByteString) type_;
      }
      return com.google.protobuf.ByteString.EMPTY;
    }
    /**
     * <code>bytes existKey = 4;</code>
     * @param value The existKey to set.
     * @return This builder for chaining.
     */
    public Builder setExistKey(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      typeCase_ = 4;
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes existKey = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearExistKey() {
      if (typeCase_ == 4) {
        typeCase_ = 0;
        type_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <code>bytes getKey = 5;</code>
     * @return Whether the getKey field is set.
     */
    public boolean hasGetKey() {
      return typeCase_ == 5;
    }
    /**
     * <code>bytes getKey = 5;</code>
     * @return The getKey.
     */
    public com.google.protobuf.ByteString getGetKey() {
      if (typeCase_ == 5) {
        return (com.google.protobuf.ByteString) type_;
      }
      return com.google.protobuf.ByteString.EMPTY;
    }
    /**
     * <code>bytes getKey = 5;</code>
     * @param value The getKey to set.
     * @return This builder for chaining.
     */
    public Builder setGetKey(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      typeCase_ = 5;
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes getKey = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearGetKey() {
      if (typeCase_ == 5) {
        typeCase_ = 0;
        type_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <code>bytes roCoProcInput = 6;</code>
     * @return Whether the roCoProcInput field is set.
     */
    public boolean hasRoCoProcInput() {
      return typeCase_ == 6;
    }
    /**
     * <code>bytes roCoProcInput = 6;</code>
     * @return The roCoProcInput.
     */
    public com.google.protobuf.ByteString getRoCoProcInput() {
      if (typeCase_ == 6) {
        return (com.google.protobuf.ByteString) type_;
      }
      return com.google.protobuf.ByteString.EMPTY;
    }
    /**
     * <code>bytes roCoProcInput = 6;</code>
     * @param value The roCoProcInput to set.
     * @return This builder for chaining.
     */
    public Builder setRoCoProcInput(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      typeCase_ = 6;
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes roCoProcInput = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearRoCoProcInput() {
      if (typeCase_ == 6) {
        typeCase_ = 0;
        type_ = null;
        onChanged();
      }
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


    // @@protoc_insertion_point(builder_scope:basekv.KVRangeRORequest)
  }

  // @@protoc_insertion_point(class_scope:basekv.KVRangeRORequest)
  private static final com.zachary.bifromq.basekv.store.proto.KVRangeRORequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.zachary.bifromq.basekv.store.proto.KVRangeRORequest();
  }

  public static com.zachary.bifromq.basekv.store.proto.KVRangeRORequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<KVRangeRORequest>
      PARSER = new com.google.protobuf.AbstractParser<KVRangeRORequest>() {
    @java.lang.Override
    public KVRangeRORequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<KVRangeRORequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<KVRangeRORequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.zachary.bifromq.basekv.store.proto.KVRangeRORequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

