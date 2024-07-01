// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: retainservice/RetainCoProc.proto

package com.zachary.bifromq.retain.rpc.proto;

/**
 * Protobuf type {@code retainservice.RetainServiceROCoProcOutput}
 */
public final class RetainServiceROCoProcOutput extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:retainservice.RetainServiceROCoProcOutput)
    RetainServiceROCoProcOutputOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RetainServiceROCoProcOutput.newBuilder() to construct.
  private RetainServiceROCoProcOutput(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RetainServiceROCoProcOutput() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RetainServiceROCoProcOutput();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return RetainCoProcProtos.internal_static_retainservice_RetainServiceROCoProcOutput_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return RetainCoProcProtos.internal_static_retainservice_RetainServiceROCoProcOutput_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            RetainServiceROCoProcOutput.class, RetainServiceROCoProcOutput.Builder.class);
  }

  private int typeCase_ = 0;
  private java.lang.Object type_;
  public enum TypeCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    MATCHREPLY(1),
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
        case 1: return MATCHREPLY;
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

  public static final int MATCHREPLY_FIELD_NUMBER = 1;
  /**
   * <code>.retainservice.MatchCoProcReply matchReply = 1;</code>
   * @return Whether the matchReply field is set.
   */
  @java.lang.Override
  public boolean hasMatchReply() {
    return typeCase_ == 1;
  }
  /**
   * <code>.retainservice.MatchCoProcReply matchReply = 1;</code>
   * @return The matchReply.
   */
  @java.lang.Override
  public MatchCoProcReply getMatchReply() {
    if (typeCase_ == 1) {
       return (MatchCoProcReply) type_;
    }
    return MatchCoProcReply.getDefaultInstance();
  }
  /**
   * <code>.retainservice.MatchCoProcReply matchReply = 1;</code>
   */
  @java.lang.Override
  public MatchCoProcReplyOrBuilder getMatchReplyOrBuilder() {
    if (typeCase_ == 1) {
       return (MatchCoProcReply) type_;
    }
    return MatchCoProcReply.getDefaultInstance();
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
    if (typeCase_ == 1) {
      output.writeMessage(1, (MatchCoProcReply) type_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (typeCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (MatchCoProcReply) type_);
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
    if (!(obj instanceof RetainServiceROCoProcOutput)) {
      return super.equals(obj);
    }
    RetainServiceROCoProcOutput other = (RetainServiceROCoProcOutput) obj;

    if (!getTypeCase().equals(other.getTypeCase())) return false;
    switch (typeCase_) {
      case 1:
        if (!getMatchReply()
            .equals(other.getMatchReply())) return false;
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
    switch (typeCase_) {
      case 1:
        hash = (37 * hash) + MATCHREPLY_FIELD_NUMBER;
        hash = (53 * hash) + getMatchReply().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static RetainServiceROCoProcOutput parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static RetainServiceROCoProcOutput parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static RetainServiceROCoProcOutput parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static RetainServiceROCoProcOutput parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static RetainServiceROCoProcOutput parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static RetainServiceROCoProcOutput parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static RetainServiceROCoProcOutput parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static RetainServiceROCoProcOutput parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static RetainServiceROCoProcOutput parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static RetainServiceROCoProcOutput parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static RetainServiceROCoProcOutput parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static RetainServiceROCoProcOutput parseFrom(
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
  public static Builder newBuilder(RetainServiceROCoProcOutput prototype) {
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
   * Protobuf type {@code retainservice.RetainServiceROCoProcOutput}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:retainservice.RetainServiceROCoProcOutput)
          RetainServiceROCoProcOutputOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return RetainCoProcProtos.internal_static_retainservice_RetainServiceROCoProcOutput_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return RetainCoProcProtos.internal_static_retainservice_RetainServiceROCoProcOutput_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              RetainServiceROCoProcOutput.class, RetainServiceROCoProcOutput.Builder.class);
    }

    // Construct using com.zachary.bifromq.retain.rpc.proto.RetainServiceROCoProcOutput.newBuilder()
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
      if (matchReplyBuilder_ != null) {
        matchReplyBuilder_.clear();
      }
      typeCase_ = 0;
      type_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return RetainCoProcProtos.internal_static_retainservice_RetainServiceROCoProcOutput_descriptor;
    }

    @java.lang.Override
    public RetainServiceROCoProcOutput getDefaultInstanceForType() {
      return RetainServiceROCoProcOutput.getDefaultInstance();
    }

    @java.lang.Override
    public RetainServiceROCoProcOutput build() {
      RetainServiceROCoProcOutput result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public RetainServiceROCoProcOutput buildPartial() {
      RetainServiceROCoProcOutput result = new RetainServiceROCoProcOutput(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(RetainServiceROCoProcOutput result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(RetainServiceROCoProcOutput result) {
      result.typeCase_ = typeCase_;
      result.type_ = this.type_;
      if (typeCase_ == 1 &&
          matchReplyBuilder_ != null) {
        result.type_ = matchReplyBuilder_.build();
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
      if (other instanceof RetainServiceROCoProcOutput) {
        return mergeFrom((RetainServiceROCoProcOutput)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(RetainServiceROCoProcOutput other) {
      if (other == RetainServiceROCoProcOutput.getDefaultInstance()) return this;
      switch (other.getTypeCase()) {
        case MATCHREPLY: {
          mergeMatchReply(other.getMatchReply());
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
            case 10: {
              input.readMessage(
                  getMatchReplyFieldBuilder().getBuilder(),
                  extensionRegistry);
              typeCase_ = 1;
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

    private com.google.protobuf.SingleFieldBuilderV3<
            MatchCoProcReply, MatchCoProcReply.Builder, MatchCoProcReplyOrBuilder> matchReplyBuilder_;
    /**
     * <code>.retainservice.MatchCoProcReply matchReply = 1;</code>
     * @return Whether the matchReply field is set.
     */
    @java.lang.Override
    public boolean hasMatchReply() {
      return typeCase_ == 1;
    }
    /**
     * <code>.retainservice.MatchCoProcReply matchReply = 1;</code>
     * @return The matchReply.
     */
    @java.lang.Override
    public MatchCoProcReply getMatchReply() {
      if (matchReplyBuilder_ == null) {
        if (typeCase_ == 1) {
          return (MatchCoProcReply) type_;
        }
        return MatchCoProcReply.getDefaultInstance();
      } else {
        if (typeCase_ == 1) {
          return matchReplyBuilder_.getMessage();
        }
        return MatchCoProcReply.getDefaultInstance();
      }
    }
    /**
     * <code>.retainservice.MatchCoProcReply matchReply = 1;</code>
     */
    public Builder setMatchReply(MatchCoProcReply value) {
      if (matchReplyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        type_ = value;
        onChanged();
      } else {
        matchReplyBuilder_.setMessage(value);
      }
      typeCase_ = 1;
      return this;
    }
    /**
     * <code>.retainservice.MatchCoProcReply matchReply = 1;</code>
     */
    public Builder setMatchReply(
        MatchCoProcReply.Builder builderForValue) {
      if (matchReplyBuilder_ == null) {
        type_ = builderForValue.build();
        onChanged();
      } else {
        matchReplyBuilder_.setMessage(builderForValue.build());
      }
      typeCase_ = 1;
      return this;
    }
    /**
     * <code>.retainservice.MatchCoProcReply matchReply = 1;</code>
     */
    public Builder mergeMatchReply(MatchCoProcReply value) {
      if (matchReplyBuilder_ == null) {
        if (typeCase_ == 1 &&
            type_ != MatchCoProcReply.getDefaultInstance()) {
          type_ = MatchCoProcReply.newBuilder((MatchCoProcReply) type_)
              .mergeFrom(value).buildPartial();
        } else {
          type_ = value;
        }
        onChanged();
      } else {
        if (typeCase_ == 1) {
          matchReplyBuilder_.mergeFrom(value);
        } else {
          matchReplyBuilder_.setMessage(value);
        }
      }
      typeCase_ = 1;
      return this;
    }
    /**
     * <code>.retainservice.MatchCoProcReply matchReply = 1;</code>
     */
    public Builder clearMatchReply() {
      if (matchReplyBuilder_ == null) {
        if (typeCase_ == 1) {
          typeCase_ = 0;
          type_ = null;
          onChanged();
        }
      } else {
        if (typeCase_ == 1) {
          typeCase_ = 0;
          type_ = null;
        }
        matchReplyBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.retainservice.MatchCoProcReply matchReply = 1;</code>
     */
    public MatchCoProcReply.Builder getMatchReplyBuilder() {
      return getMatchReplyFieldBuilder().getBuilder();
    }
    /**
     * <code>.retainservice.MatchCoProcReply matchReply = 1;</code>
     */
    @java.lang.Override
    public MatchCoProcReplyOrBuilder getMatchReplyOrBuilder() {
      if ((typeCase_ == 1) && (matchReplyBuilder_ != null)) {
        return matchReplyBuilder_.getMessageOrBuilder();
      } else {
        if (typeCase_ == 1) {
          return (MatchCoProcReply) type_;
        }
        return MatchCoProcReply.getDefaultInstance();
      }
    }
    /**
     * <code>.retainservice.MatchCoProcReply matchReply = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            MatchCoProcReply, MatchCoProcReply.Builder, MatchCoProcReplyOrBuilder>
        getMatchReplyFieldBuilder() {
      if (matchReplyBuilder_ == null) {
        if (!(typeCase_ == 1)) {
          type_ = MatchCoProcReply.getDefaultInstance();
        }
        matchReplyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                MatchCoProcReply, MatchCoProcReply.Builder, MatchCoProcReplyOrBuilder>(
                (MatchCoProcReply) type_,
                getParentForChildren(),
                isClean());
        type_ = null;
      }
      typeCase_ = 1;
      onChanged();
      return matchReplyBuilder_;
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


    // @@protoc_insertion_point(builder_scope:retainservice.RetainServiceROCoProcOutput)
  }

  // @@protoc_insertion_point(class_scope:retainservice.RetainServiceROCoProcOutput)
  private static final RetainServiceROCoProcOutput DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new RetainServiceROCoProcOutput();
  }

  public static RetainServiceROCoProcOutput getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RetainServiceROCoProcOutput>
      PARSER = new com.google.protobuf.AbstractParser<RetainServiceROCoProcOutput>() {
    @java.lang.Override
    public RetainServiceROCoProcOutput parsePartialFrom(
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

  public static com.google.protobuf.Parser<RetainServiceROCoProcOutput> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RetainServiceROCoProcOutput> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public RetainServiceROCoProcOutput getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

