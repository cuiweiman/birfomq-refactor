// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mqtt3_auth_types.proto

package com.zachary.bifromq.plugin.authprovider.type;

/**
 * Protobuf type {@code mqtt3authtypes.Reject}
 */
public final class Reject extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:mqtt3authtypes.Reject)
    RejectOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Reject.newBuilder() to construct.
  private Reject(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Reject() {
    code_ = 0;
    reason_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Reject();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.zachary.bifromq.plugin.authprovider.type.MQTT3AuthTypesProto.internal_static_mqtt3authtypes_Reject_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.zachary.bifromq.plugin.authprovider.type.MQTT3AuthTypesProto.internal_static_mqtt3authtypes_Reject_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.zachary.bifromq.plugin.authprovider.type.Reject.class, com.zachary.bifromq.plugin.authprovider.type.Reject.Builder.class);
  }

  /**
   * Protobuf enum {@code mqtt3authtypes.Reject.Code}
   */
  public enum Code
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>BadPass = 0;</code>
     */
    BadPass(0),
    /**
     * <code>NotAuthorized = 1;</code>
     */
    NotAuthorized(1),
    /**
     * <code>Error = 2;</code>
     */
    Error(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>BadPass = 0;</code>
     */
    public static final int BadPass_VALUE = 0;
    /**
     * <code>NotAuthorized = 1;</code>
     */
    public static final int NotAuthorized_VALUE = 1;
    /**
     * <code>Error = 2;</code>
     */
    public static final int Error_VALUE = 2;


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
    public static Code valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Code forNumber(int value) {
      switch (value) {
        case 0: return BadPass;
        case 1: return NotAuthorized;
        case 2: return Error;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Code>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Code> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Code>() {
            public Code findValueByNumber(int number) {
              return Code.forNumber(number);
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
      return com.zachary.bifromq.plugin.authprovider.type.Reject.getDescriptor().getEnumTypes().get(0);
    }

    private static final Code[] VALUES = values();

    public static Code valueOf(
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

    private Code(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:mqtt3authtypes.Reject.Code)
  }

  private int bitField0_;
  public static final int CODE_FIELD_NUMBER = 1;
  private int code_ = 0;
  /**
   * <code>.mqtt3authtypes.Reject.Code code = 1;</code>
   * @return The enum numeric value on the wire for code.
   */
  @java.lang.Override public int getCodeValue() {
    return code_;
  }
  /**
   * <code>.mqtt3authtypes.Reject.Code code = 1;</code>
   * @return The code.
   */
  @java.lang.Override public com.zachary.bifromq.plugin.authprovider.type.Reject.Code getCode() {
    com.zachary.bifromq.plugin.authprovider.type.Reject.Code result = com.zachary.bifromq.plugin.authprovider.type.Reject.Code.forNumber(code_);
    return result == null ? com.zachary.bifromq.plugin.authprovider.type.Reject.Code.UNRECOGNIZED : result;
  }

  public static final int REASON_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object reason_ = "";
  /**
   * <pre>
   * optional description
   * </pre>
   *
   * <code>optional string reason = 2;</code>
   * @return Whether the reason field is set.
   */
  @java.lang.Override
  public boolean hasReason() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * optional description
   * </pre>
   *
   * <code>optional string reason = 2;</code>
   * @return The reason.
   */
  @java.lang.Override
  public java.lang.String getReason() {
    java.lang.Object ref = reason_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      reason_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * optional description
   * </pre>
   *
   * <code>optional string reason = 2;</code>
   * @return The bytes for reason.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getReasonBytes() {
    java.lang.Object ref = reason_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      reason_ = b;
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
    if (code_ != com.zachary.bifromq.plugin.authprovider.type.Reject.Code.BadPass.getNumber()) {
      output.writeEnum(1, code_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, reason_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (code_ != com.zachary.bifromq.plugin.authprovider.type.Reject.Code.BadPass.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, code_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, reason_);
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
    if (!(obj instanceof com.zachary.bifromq.plugin.authprovider.type.Reject)) {
      return super.equals(obj);
    }
    com.zachary.bifromq.plugin.authprovider.type.Reject other = (com.zachary.bifromq.plugin.authprovider.type.Reject) obj;

    if (code_ != other.code_) return false;
    if (hasReason() != other.hasReason()) return false;
    if (hasReason()) {
      if (!getReason()
          .equals(other.getReason())) return false;
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
    hash = (37 * hash) + CODE_FIELD_NUMBER;
    hash = (53 * hash) + code_;
    if (hasReason()) {
      hash = (37 * hash) + REASON_FIELD_NUMBER;
      hash = (53 * hash) + getReason().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.zachary.bifromq.plugin.authprovider.type.Reject parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.zachary.bifromq.plugin.authprovider.type.Reject parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.zachary.bifromq.plugin.authprovider.type.Reject parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.zachary.bifromq.plugin.authprovider.type.Reject parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.zachary.bifromq.plugin.authprovider.type.Reject parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.zachary.bifromq.plugin.authprovider.type.Reject parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.zachary.bifromq.plugin.authprovider.type.Reject parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.zachary.bifromq.plugin.authprovider.type.Reject parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.zachary.bifromq.plugin.authprovider.type.Reject parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.zachary.bifromq.plugin.authprovider.type.Reject parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.zachary.bifromq.plugin.authprovider.type.Reject parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.zachary.bifromq.plugin.authprovider.type.Reject parseFrom(
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
  public static Builder newBuilder(com.zachary.bifromq.plugin.authprovider.type.Reject prototype) {
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
   * Protobuf type {@code mqtt3authtypes.Reject}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:mqtt3authtypes.Reject)
      com.zachary.bifromq.plugin.authprovider.type.RejectOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.zachary.bifromq.plugin.authprovider.type.MQTT3AuthTypesProto.internal_static_mqtt3authtypes_Reject_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.zachary.bifromq.plugin.authprovider.type.MQTT3AuthTypesProto.internal_static_mqtt3authtypes_Reject_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.zachary.bifromq.plugin.authprovider.type.Reject.class, com.zachary.bifromq.plugin.authprovider.type.Reject.Builder.class);
    }

    // Construct using com.zachary.bifromq.plugin.authprovider.type.Reject.newBuilder()
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
      code_ = 0;
      reason_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.zachary.bifromq.plugin.authprovider.type.MQTT3AuthTypesProto.internal_static_mqtt3authtypes_Reject_descriptor;
    }

    @java.lang.Override
    public com.zachary.bifromq.plugin.authprovider.type.Reject getDefaultInstanceForType() {
      return com.zachary.bifromq.plugin.authprovider.type.Reject.getDefaultInstance();
    }

    @java.lang.Override
    public com.zachary.bifromq.plugin.authprovider.type.Reject build() {
      com.zachary.bifromq.plugin.authprovider.type.Reject result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.zachary.bifromq.plugin.authprovider.type.Reject buildPartial() {
      com.zachary.bifromq.plugin.authprovider.type.Reject result = new com.zachary.bifromq.plugin.authprovider.type.Reject(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.zachary.bifromq.plugin.authprovider.type.Reject result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.code_ = code_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.reason_ = reason_;
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.zachary.bifromq.plugin.authprovider.type.Reject) {
        return mergeFrom((com.zachary.bifromq.plugin.authprovider.type.Reject)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.zachary.bifromq.plugin.authprovider.type.Reject other) {
      if (other == com.zachary.bifromq.plugin.authprovider.type.Reject.getDefaultInstance()) return this;
      if (other.code_ != 0) {
        setCodeValue(other.getCodeValue());
      }
      if (other.hasReason()) {
        reason_ = other.reason_;
        bitField0_ |= 0x00000002;
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
              code_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              reason_ = input.readStringRequireUtf8();
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

    private int code_ = 0;
    /**
     * <code>.mqtt3authtypes.Reject.Code code = 1;</code>
     * @return The enum numeric value on the wire for code.
     */
    @java.lang.Override public int getCodeValue() {
      return code_;
    }
    /**
     * <code>.mqtt3authtypes.Reject.Code code = 1;</code>
     * @param value The enum numeric value on the wire for code to set.
     * @return This builder for chaining.
     */
    public Builder setCodeValue(int value) {
      code_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.mqtt3authtypes.Reject.Code code = 1;</code>
     * @return The code.
     */
    @java.lang.Override
    public com.zachary.bifromq.plugin.authprovider.type.Reject.Code getCode() {
      com.zachary.bifromq.plugin.authprovider.type.Reject.Code result = com.zachary.bifromq.plugin.authprovider.type.Reject.Code.forNumber(code_);
      return result == null ? com.zachary.bifromq.plugin.authprovider.type.Reject.Code.UNRECOGNIZED : result;
    }
    /**
     * <code>.mqtt3authtypes.Reject.Code code = 1;</code>
     * @param value The code to set.
     * @return This builder for chaining.
     */
    public Builder setCode(com.zachary.bifromq.plugin.authprovider.type.Reject.Code value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      code_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.mqtt3authtypes.Reject.Code code = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCode() {
      bitField0_ = (bitField0_ & ~0x00000001);
      code_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object reason_ = "";
    /**
     * <pre>
     * optional description
     * </pre>
     *
     * <code>optional string reason = 2;</code>
     * @return Whether the reason field is set.
     */
    public boolean hasReason() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * optional description
     * </pre>
     *
     * <code>optional string reason = 2;</code>
     * @return The reason.
     */
    public java.lang.String getReason() {
      java.lang.Object ref = reason_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        reason_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * optional description
     * </pre>
     *
     * <code>optional string reason = 2;</code>
     * @return The bytes for reason.
     */
    public com.google.protobuf.ByteString
        getReasonBytes() {
      java.lang.Object ref = reason_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        reason_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * optional description
     * </pre>
     *
     * <code>optional string reason = 2;</code>
     * @param value The reason to set.
     * @return This builder for chaining.
     */
    public Builder setReason(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      reason_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * optional description
     * </pre>
     *
     * <code>optional string reason = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearReason() {
      reason_ = getDefaultInstance().getReason();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * optional description
     * </pre>
     *
     * <code>optional string reason = 2;</code>
     * @param value The bytes for reason to set.
     * @return This builder for chaining.
     */
    public Builder setReasonBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      reason_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:mqtt3authtypes.Reject)
  }

  // @@protoc_insertion_point(class_scope:mqtt3authtypes.Reject)
  private static final com.zachary.bifromq.plugin.authprovider.type.Reject DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.zachary.bifromq.plugin.authprovider.type.Reject();
  }

  public static com.zachary.bifromq.plugin.authprovider.type.Reject getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Reject>
      PARSER = new com.google.protobuf.AbstractParser<Reject>() {
    @java.lang.Override
    public Reject parsePartialFrom(
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

  public static com.google.protobuf.Parser<Reject> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Reject> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.zachary.bifromq.plugin.authprovider.type.Reject getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

