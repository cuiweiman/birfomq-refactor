// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: basekv/StoreMessage.proto

package com.zachary.bifromq.basekv.proto;

/**
 * Protobuf type {@code basekv.SaveSnapshotDataReply}
 */
public final class SaveSnapshotDataReply extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:basekv.SaveSnapshotDataReply)
    SaveSnapshotDataReplyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SaveSnapshotDataReply.newBuilder() to construct.
  private SaveSnapshotDataReply(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SaveSnapshotDataReply() {
    sessionId_ = "";
    result_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SaveSnapshotDataReply();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.zachary.bifromq.basekv.proto.StoreMessageOuterClass.internal_static_basekv_SaveSnapshotDataReply_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.zachary.bifromq.basekv.proto.StoreMessageOuterClass.internal_static_basekv_SaveSnapshotDataReply_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.zachary.bifromq.basekv.proto.SaveSnapshotDataReply.class, com.zachary.bifromq.basekv.proto.SaveSnapshotDataReply.Builder.class);
  }

  /**
   * Protobuf enum {@code basekv.SaveSnapshotDataReply.Result}
   */
  public enum Result
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>OK = 0;</code>
     */
    OK(0),
    /**
     * <code>NoSessionFound = 1;</code>
     */
    NoSessionFound(1),
    /**
     * <code>Retry = 2;</code>
     */
    Retry(2),
    /**
     * <code>Error = 3;</code>
     */
    Error(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>OK = 0;</code>
     */
    public static final int OK_VALUE = 0;
    /**
     * <code>NoSessionFound = 1;</code>
     */
    public static final int NoSessionFound_VALUE = 1;
    /**
     * <code>Retry = 2;</code>
     */
    public static final int Retry_VALUE = 2;
    /**
     * <code>Error = 3;</code>
     */
    public static final int Error_VALUE = 3;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Result valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Result forNumber(int value) {
      switch (value) {
        case 0: return OK;
        case 1: return NoSessionFound;
        case 2: return Retry;
        case 3: return Error;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Result>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Result> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Result>() {
            public Result findValueByNumber(int number) {
              return Result.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.zachary.bifromq.basekv.proto.SaveSnapshotDataReply.getDescriptor().getEnumTypes().get(0);
    }

    private static final Result[] VALUES = values();

    public static Result valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Result(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:basekv.SaveSnapshotDataReply.Result)
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

  public static final int REQID_FIELD_NUMBER = 2;
  private int reqId_ = 0;
  /**
   * <code>uint32 reqId = 2;</code>
   * @return The reqId.
   */
  @java.lang.Override
  public int getReqId() {
    return reqId_;
  }

  public static final int RESULT_FIELD_NUMBER = 3;
  private int result_ = 0;
  /**
   * <code>.basekv.SaveSnapshotDataReply.Result result = 3;</code>
   * @return The enum numeric value on the wire for result.
   */
  @java.lang.Override public int getResultValue() {
    return result_;
  }
  /**
   * <code>.basekv.SaveSnapshotDataReply.Result result = 3;</code>
   * @return The result.
   */
  @java.lang.Override public com.zachary.bifromq.basekv.proto.SaveSnapshotDataReply.Result getResult() {
    com.zachary.bifromq.basekv.proto.SaveSnapshotDataReply.Result result = com.zachary.bifromq.basekv.proto.SaveSnapshotDataReply.Result.forNumber(result_);
    return result == null ? com.zachary.bifromq.basekv.proto.SaveSnapshotDataReply.Result.UNRECOGNIZED : result;
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
    if (reqId_ != 0) {
      output.writeUInt32(2, reqId_);
    }
    if (result_ != com.zachary.bifromq.basekv.proto.SaveSnapshotDataReply.Result.OK.getNumber()) {
      output.writeEnum(3, result_);
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
    if (reqId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, reqId_);
    }
    if (result_ != com.zachary.bifromq.basekv.proto.SaveSnapshotDataReply.Result.OK.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, result_);
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
    if (!(obj instanceof com.zachary.bifromq.basekv.proto.SaveSnapshotDataReply)) {
      return super.equals(obj);
    }
    com.zachary.bifromq.basekv.proto.SaveSnapshotDataReply other = (com.zachary.bifromq.basekv.proto.SaveSnapshotDataReply) obj;

    if (!getSessionId()
        .equals(other.getSessionId())) return false;
    if (getReqId()
        != other.getReqId()) return false;
    if (result_ != other.result_) return false;
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
    hash = (37 * hash) + REQID_FIELD_NUMBER;
    hash = (53 * hash) + getReqId();
    hash = (37 * hash) + RESULT_FIELD_NUMBER;
    hash = (53 * hash) + result_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.zachary.bifromq.basekv.proto.SaveSnapshotDataReply parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.zachary.bifromq.basekv.proto.SaveSnapshotDataReply parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.zachary.bifromq.basekv.proto.SaveSnapshotDataReply parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.zachary.bifromq.basekv.proto.SaveSnapshotDataReply parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.zachary.bifromq.basekv.proto.SaveSnapshotDataReply parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.zachary.bifromq.basekv.proto.SaveSnapshotDataReply parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.zachary.bifromq.basekv.proto.SaveSnapshotDataReply parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.zachary.bifromq.basekv.proto.SaveSnapshotDataReply parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.zachary.bifromq.basekv.proto.SaveSnapshotDataReply parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.zachary.bifromq.basekv.proto.SaveSnapshotDataReply parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.zachary.bifromq.basekv.proto.SaveSnapshotDataReply parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.zachary.bifromq.basekv.proto.SaveSnapshotDataReply parseFrom(
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
  public static Builder newBuilder(com.zachary.bifromq.basekv.proto.SaveSnapshotDataReply prototype) {
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
   * Protobuf type {@code basekv.SaveSnapshotDataReply}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:basekv.SaveSnapshotDataReply)
      com.zachary.bifromq.basekv.proto.SaveSnapshotDataReplyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.zachary.bifromq.basekv.proto.StoreMessageOuterClass.internal_static_basekv_SaveSnapshotDataReply_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.zachary.bifromq.basekv.proto.StoreMessageOuterClass.internal_static_basekv_SaveSnapshotDataReply_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.zachary.bifromq.basekv.proto.SaveSnapshotDataReply.class, com.zachary.bifromq.basekv.proto.SaveSnapshotDataReply.Builder.class);
    }

    // Construct using com.zachary.bifromq.basekv.proto.SaveSnapshotDataReply.newBuilder()
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
      reqId_ = 0;
      result_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.zachary.bifromq.basekv.proto.StoreMessageOuterClass.internal_static_basekv_SaveSnapshotDataReply_descriptor;
    }

    @java.lang.Override
    public com.zachary.bifromq.basekv.proto.SaveSnapshotDataReply getDefaultInstanceForType() {
      return com.zachary.bifromq.basekv.proto.SaveSnapshotDataReply.getDefaultInstance();
    }

    @java.lang.Override
    public com.zachary.bifromq.basekv.proto.SaveSnapshotDataReply build() {
      com.zachary.bifromq.basekv.proto.SaveSnapshotDataReply result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.zachary.bifromq.basekv.proto.SaveSnapshotDataReply buildPartial() {
      com.zachary.bifromq.basekv.proto.SaveSnapshotDataReply result = new com.zachary.bifromq.basekv.proto.SaveSnapshotDataReply(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.zachary.bifromq.basekv.proto.SaveSnapshotDataReply result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.sessionId_ = sessionId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.reqId_ = reqId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.result_ = result_;
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
      if (other instanceof com.zachary.bifromq.basekv.proto.SaveSnapshotDataReply) {
        return mergeFrom((com.zachary.bifromq.basekv.proto.SaveSnapshotDataReply)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.zachary.bifromq.basekv.proto.SaveSnapshotDataReply other) {
      if (other == com.zachary.bifromq.basekv.proto.SaveSnapshotDataReply.getDefaultInstance()) return this;
      if (!other.getSessionId().isEmpty()) {
        sessionId_ = other.sessionId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getReqId() != 0) {
        setReqId(other.getReqId());
      }
      if (other.result_ != 0) {
        setResultValue(other.getResultValue());
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
            case 16: {
              reqId_ = input.readUInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              result_ = input.readEnum();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
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

    private int reqId_ ;
    /**
     * <code>uint32 reqId = 2;</code>
     * @return The reqId.
     */
    @java.lang.Override
    public int getReqId() {
      return reqId_;
    }
    /**
     * <code>uint32 reqId = 2;</code>
     * @param value The reqId to set.
     * @return This builder for chaining.
     */
    public Builder setReqId(int value) {
      
      reqId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 reqId = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearReqId() {
      bitField0_ = (bitField0_ & ~0x00000002);
      reqId_ = 0;
      onChanged();
      return this;
    }

    private int result_ = 0;
    /**
     * <code>.basekv.SaveSnapshotDataReply.Result result = 3;</code>
     * @return The enum numeric value on the wire for result.
     */
    @java.lang.Override public int getResultValue() {
      return result_;
    }
    /**
     * <code>.basekv.SaveSnapshotDataReply.Result result = 3;</code>
     * @param value The enum numeric value on the wire for result to set.
     * @return This builder for chaining.
     */
    public Builder setResultValue(int value) {
      result_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.basekv.SaveSnapshotDataReply.Result result = 3;</code>
     * @return The result.
     */
    @java.lang.Override
    public com.zachary.bifromq.basekv.proto.SaveSnapshotDataReply.Result getResult() {
      com.zachary.bifromq.basekv.proto.SaveSnapshotDataReply.Result result = com.zachary.bifromq.basekv.proto.SaveSnapshotDataReply.Result.forNumber(result_);
      return result == null ? com.zachary.bifromq.basekv.proto.SaveSnapshotDataReply.Result.UNRECOGNIZED : result;
    }
    /**
     * <code>.basekv.SaveSnapshotDataReply.Result result = 3;</code>
     * @param value The result to set.
     * @return This builder for chaining.
     */
    public Builder setResult(com.zachary.bifromq.basekv.proto.SaveSnapshotDataReply.Result value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      result_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.basekv.SaveSnapshotDataReply.Result result = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearResult() {
      bitField0_ = (bitField0_ & ~0x00000004);
      result_ = 0;
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


    // @@protoc_insertion_point(builder_scope:basekv.SaveSnapshotDataReply)
  }

  // @@protoc_insertion_point(class_scope:basekv.SaveSnapshotDataReply)
  private static final com.zachary.bifromq.basekv.proto.SaveSnapshotDataReply DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.zachary.bifromq.basekv.proto.SaveSnapshotDataReply();
  }

  public static com.zachary.bifromq.basekv.proto.SaveSnapshotDataReply getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SaveSnapshotDataReply>
      PARSER = new com.google.protobuf.AbstractParser<SaveSnapshotDataReply>() {
    @java.lang.Override
    public SaveSnapshotDataReply parsePartialFrom(
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

  public static com.google.protobuf.Parser<SaveSnapshotDataReply> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SaveSnapshotDataReply> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.zachary.bifromq.basekv.proto.SaveSnapshotDataReply getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

