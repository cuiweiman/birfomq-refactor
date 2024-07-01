// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: basekv/raft/Voting.proto

package com.zachary.bifromq.basekv.raft.proto;

/**
 * Protobuf type {@code basekv.raft.Voting}
 */
public final class Voting extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:basekv.raft.Voting)
    VotingOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Voting.newBuilder() to construct.
  private Voting(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Voting() {
    for_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Voting();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.zachary.bifromq.basekv.raft.proto.VotingOuterClass.internal_static_basekv_raft_Voting_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.zachary.bifromq.basekv.raft.proto.VotingOuterClass.internal_static_basekv_raft_Voting_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.zachary.bifromq.basekv.raft.proto.Voting.class, com.zachary.bifromq.basekv.raft.proto.Voting.Builder.class);
  }

  public static final int TERM_FIELD_NUMBER = 1;
  private long term_ = 0L;
  /**
   * <pre>
   * voting term
   * </pre>
   *
   * <code>uint64 term = 1;</code>
   * @return The term.
   */
  @java.lang.Override
  public long getTerm() {
    return term_;
  }

  public static final int FOR_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object for_ = "";
  /**
   * <pre>
   * the voted peer
   * </pre>
   *
   * <code>string for = 2;</code>
   * @return The for.
   */
  @java.lang.Override
  public java.lang.String getFor() {
    java.lang.Object ref = for_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      for_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * the voted peer
   * </pre>
   *
   * <code>string for = 2;</code>
   * @return The bytes for for.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getForBytes() {
    java.lang.Object ref = for_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      for_ = b;
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
    if (term_ != 0L) {
      output.writeUInt64(1, term_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(for_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, for_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (term_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, term_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(for_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, for_);
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
    if (!(obj instanceof com.zachary.bifromq.basekv.raft.proto.Voting)) {
      return super.equals(obj);
    }
    com.zachary.bifromq.basekv.raft.proto.Voting other = (com.zachary.bifromq.basekv.raft.proto.Voting) obj;

    if (getTerm()
        != other.getTerm()) return false;
    if (!getFor()
        .equals(other.getFor())) return false;
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
    hash = (37 * hash) + TERM_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTerm());
    hash = (37 * hash) + FOR_FIELD_NUMBER;
    hash = (53 * hash) + getFor().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.zachary.bifromq.basekv.raft.proto.Voting parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.zachary.bifromq.basekv.raft.proto.Voting parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.zachary.bifromq.basekv.raft.proto.Voting parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.zachary.bifromq.basekv.raft.proto.Voting parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.zachary.bifromq.basekv.raft.proto.Voting parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.zachary.bifromq.basekv.raft.proto.Voting parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.zachary.bifromq.basekv.raft.proto.Voting parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.zachary.bifromq.basekv.raft.proto.Voting parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.zachary.bifromq.basekv.raft.proto.Voting parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.zachary.bifromq.basekv.raft.proto.Voting parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.zachary.bifromq.basekv.raft.proto.Voting parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.zachary.bifromq.basekv.raft.proto.Voting parseFrom(
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
  public static Builder newBuilder(com.zachary.bifromq.basekv.raft.proto.Voting prototype) {
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
   * Protobuf type {@code basekv.raft.Voting}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:basekv.raft.Voting)
      com.zachary.bifromq.basekv.raft.proto.VotingOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.zachary.bifromq.basekv.raft.proto.VotingOuterClass.internal_static_basekv_raft_Voting_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.zachary.bifromq.basekv.raft.proto.VotingOuterClass.internal_static_basekv_raft_Voting_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.zachary.bifromq.basekv.raft.proto.Voting.class, com.zachary.bifromq.basekv.raft.proto.Voting.Builder.class);
    }

    // Construct using com.zachary.bifromq.basekv.raft.proto.Voting.newBuilder()
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
      term_ = 0L;
      for_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.zachary.bifromq.basekv.raft.proto.VotingOuterClass.internal_static_basekv_raft_Voting_descriptor;
    }

    @java.lang.Override
    public com.zachary.bifromq.basekv.raft.proto.Voting getDefaultInstanceForType() {
      return com.zachary.bifromq.basekv.raft.proto.Voting.getDefaultInstance();
    }

    @java.lang.Override
    public com.zachary.bifromq.basekv.raft.proto.Voting build() {
      com.zachary.bifromq.basekv.raft.proto.Voting result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.zachary.bifromq.basekv.raft.proto.Voting buildPartial() {
      com.zachary.bifromq.basekv.raft.proto.Voting result = new com.zachary.bifromq.basekv.raft.proto.Voting(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.zachary.bifromq.basekv.raft.proto.Voting result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.term_ = term_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.for_ = for_;
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
      if (other instanceof com.zachary.bifromq.basekv.raft.proto.Voting) {
        return mergeFrom((com.zachary.bifromq.basekv.raft.proto.Voting)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.zachary.bifromq.basekv.raft.proto.Voting other) {
      if (other == com.zachary.bifromq.basekv.raft.proto.Voting.getDefaultInstance()) return this;
      if (other.getTerm() != 0L) {
        setTerm(other.getTerm());
      }
      if (!other.getFor().isEmpty()) {
        for_ = other.for_;
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
              term_ = input.readUInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              for_ = input.readStringRequireUtf8();
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

    private long term_ ;
    /**
     * <pre>
     * voting term
     * </pre>
     *
     * <code>uint64 term = 1;</code>
     * @return The term.
     */
    @java.lang.Override
    public long getTerm() {
      return term_;
    }
    /**
     * <pre>
     * voting term
     * </pre>
     *
     * <code>uint64 term = 1;</code>
     * @param value The term to set.
     * @return This builder for chaining.
     */
    public Builder setTerm(long value) {
      
      term_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * voting term
     * </pre>
     *
     * <code>uint64 term = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTerm() {
      bitField0_ = (bitField0_ & ~0x00000001);
      term_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object for_ = "";
    /**
     * <pre>
     * the voted peer
     * </pre>
     *
     * <code>string for = 2;</code>
     * @return The for.
     */
    public java.lang.String getFor() {
      java.lang.Object ref = for_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        for_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * the voted peer
     * </pre>
     *
     * <code>string for = 2;</code>
     * @return The bytes for for.
     */
    public com.google.protobuf.ByteString
        getForBytes() {
      java.lang.Object ref = for_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        for_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * the voted peer
     * </pre>
     *
     * <code>string for = 2;</code>
     * @param value The for to set.
     * @return This builder for chaining.
     */
    public Builder setFor(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      for_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the voted peer
     * </pre>
     *
     * <code>string for = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearFor() {
      for_ = getDefaultInstance().getFor();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the voted peer
     * </pre>
     *
     * <code>string for = 2;</code>
     * @param value The bytes for for to set.
     * @return This builder for chaining.
     */
    public Builder setForBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      for_ = value;
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


    // @@protoc_insertion_point(builder_scope:basekv.raft.Voting)
  }

  // @@protoc_insertion_point(class_scope:basekv.raft.Voting)
  private static final com.zachary.bifromq.basekv.raft.proto.Voting DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.zachary.bifromq.basekv.raft.proto.Voting();
  }

  public static com.zachary.bifromq.basekv.raft.proto.Voting getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Voting>
      PARSER = new com.google.protobuf.AbstractParser<Voting>() {
    @java.lang.Override
    public Voting parsePartialFrom(
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

  public static com.google.protobuf.Parser<Voting> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Voting> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.zachary.bifromq.basekv.raft.proto.Voting getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

