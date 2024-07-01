// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: inboxservice/InboxService.proto

package com.zachary.bifromq.inbox.rpc.proto;

/**
 * Protobuf type {@code inboxservice.CommitRequest}
 */
public final class CommitRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:inboxservice.CommitRequest)
    CommitRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CommitRequest.newBuilder() to construct.
  private CommitRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CommitRequest() {
    qos_ = 0;
    inboxId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CommitRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.zachary.bifromq.inbox.rpc.proto.InboxServiceProtos.internal_static_inboxservice_CommitRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.zachary.bifromq.inbox.rpc.proto.InboxServiceProtos.internal_static_inboxservice_CommitRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.zachary.bifromq.inbox.rpc.proto.CommitRequest.class, com.zachary.bifromq.inbox.rpc.proto.CommitRequest.Builder.class);
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

  public static final int QOS_FIELD_NUMBER = 2;
  private int qos_ = 0;
  /**
   * <code>.commontype.QoS qos = 2;</code>
   * @return The enum numeric value on the wire for qos.
   */
  @java.lang.Override public int getQosValue() {
    return qos_;
  }
  /**
   * <code>.commontype.QoS qos = 2;</code>
   * @return The qos.
   */
  @java.lang.Override public com.zachary.bifromq.type.QoS getQos() {
    com.zachary.bifromq.type.QoS result = com.zachary.bifromq.type.QoS.forNumber(qos_);
    return result == null ? com.zachary.bifromq.type.QoS.UNRECOGNIZED : result;
  }

  public static final int UPTOSEQ_FIELD_NUMBER = 3;
  private long upToSeq_ = 0L;
  /**
   * <code>uint64 upToSeq = 3;</code>
   * @return The upToSeq.
   */
  @java.lang.Override
  public long getUpToSeq() {
    return upToSeq_;
  }

  public static final int INBOXID_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object inboxId_ = "";
  /**
   * <code>string inboxId = 4;</code>
   * @return The inboxId.
   */
  @java.lang.Override
  public java.lang.String getInboxId() {
    java.lang.Object ref = inboxId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      inboxId_ = s;
      return s;
    }
  }
  /**
   * <code>string inboxId = 4;</code>
   * @return The bytes for inboxId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getInboxIdBytes() {
    java.lang.Object ref = inboxId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      inboxId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CLIENTINFO_FIELD_NUMBER = 5;
  private com.zachary.bifromq.type.ClientInfo clientInfo_;
  /**
   * <code>.commontype.ClientInfo clientInfo = 5;</code>
   * @return Whether the clientInfo field is set.
   */
  @java.lang.Override
  public boolean hasClientInfo() {
    return clientInfo_ != null;
  }
  /**
   * <code>.commontype.ClientInfo clientInfo = 5;</code>
   * @return The clientInfo.
   */
  @java.lang.Override
  public com.zachary.bifromq.type.ClientInfo getClientInfo() {
    return clientInfo_ == null ? com.zachary.bifromq.type.ClientInfo.getDefaultInstance() : clientInfo_;
  }
  /**
   * <code>.commontype.ClientInfo clientInfo = 5;</code>
   */
  @java.lang.Override
  public com.zachary.bifromq.type.ClientInfoOrBuilder getClientInfoOrBuilder() {
    return clientInfo_ == null ? com.zachary.bifromq.type.ClientInfo.getDefaultInstance() : clientInfo_;
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
    if (qos_ != com.zachary.bifromq.type.QoS.AT_MOST_ONCE.getNumber()) {
      output.writeEnum(2, qos_);
    }
    if (upToSeq_ != 0L) {
      output.writeUInt64(3, upToSeq_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(inboxId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, inboxId_);
    }
    if (clientInfo_ != null) {
      output.writeMessage(5, getClientInfo());
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
    if (qos_ != com.zachary.bifromq.type.QoS.AT_MOST_ONCE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, qos_);
    }
    if (upToSeq_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(3, upToSeq_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(inboxId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, inboxId_);
    }
    if (clientInfo_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getClientInfo());
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
    if (!(obj instanceof com.zachary.bifromq.inbox.rpc.proto.CommitRequest)) {
      return super.equals(obj);
    }
    com.zachary.bifromq.inbox.rpc.proto.CommitRequest other = (com.zachary.bifromq.inbox.rpc.proto.CommitRequest) obj;

    if (getReqId()
        != other.getReqId()) return false;
    if (qos_ != other.qos_) return false;
    if (getUpToSeq()
        != other.getUpToSeq()) return false;
    if (!getInboxId()
        .equals(other.getInboxId())) return false;
    if (hasClientInfo() != other.hasClientInfo()) return false;
    if (hasClientInfo()) {
      if (!getClientInfo()
          .equals(other.getClientInfo())) return false;
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
    hash = (37 * hash) + QOS_FIELD_NUMBER;
    hash = (53 * hash) + qos_;
    hash = (37 * hash) + UPTOSEQ_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getUpToSeq());
    hash = (37 * hash) + INBOXID_FIELD_NUMBER;
    hash = (53 * hash) + getInboxId().hashCode();
    if (hasClientInfo()) {
      hash = (37 * hash) + CLIENTINFO_FIELD_NUMBER;
      hash = (53 * hash) + getClientInfo().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.zachary.bifromq.inbox.rpc.proto.CommitRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.zachary.bifromq.inbox.rpc.proto.CommitRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.zachary.bifromq.inbox.rpc.proto.CommitRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.zachary.bifromq.inbox.rpc.proto.CommitRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.zachary.bifromq.inbox.rpc.proto.CommitRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.zachary.bifromq.inbox.rpc.proto.CommitRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.zachary.bifromq.inbox.rpc.proto.CommitRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.zachary.bifromq.inbox.rpc.proto.CommitRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.zachary.bifromq.inbox.rpc.proto.CommitRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.zachary.bifromq.inbox.rpc.proto.CommitRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.zachary.bifromq.inbox.rpc.proto.CommitRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.zachary.bifromq.inbox.rpc.proto.CommitRequest parseFrom(
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
  public static Builder newBuilder(com.zachary.bifromq.inbox.rpc.proto.CommitRequest prototype) {
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
   * Protobuf type {@code inboxservice.CommitRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:inboxservice.CommitRequest)
      com.zachary.bifromq.inbox.rpc.proto.CommitRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.zachary.bifromq.inbox.rpc.proto.InboxServiceProtos.internal_static_inboxservice_CommitRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.zachary.bifromq.inbox.rpc.proto.InboxServiceProtos.internal_static_inboxservice_CommitRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.zachary.bifromq.inbox.rpc.proto.CommitRequest.class, com.zachary.bifromq.inbox.rpc.proto.CommitRequest.Builder.class);
    }

    // Construct using com.zachary.bifromq.inbox.rpc.proto.CommitRequest.newBuilder()
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
      qos_ = 0;
      upToSeq_ = 0L;
      inboxId_ = "";
      clientInfo_ = null;
      if (clientInfoBuilder_ != null) {
        clientInfoBuilder_.dispose();
        clientInfoBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.zachary.bifromq.inbox.rpc.proto.InboxServiceProtos.internal_static_inboxservice_CommitRequest_descriptor;
    }

    @java.lang.Override
    public com.zachary.bifromq.inbox.rpc.proto.CommitRequest getDefaultInstanceForType() {
      return com.zachary.bifromq.inbox.rpc.proto.CommitRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.zachary.bifromq.inbox.rpc.proto.CommitRequest build() {
      com.zachary.bifromq.inbox.rpc.proto.CommitRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.zachary.bifromq.inbox.rpc.proto.CommitRequest buildPartial() {
      com.zachary.bifromq.inbox.rpc.proto.CommitRequest result = new com.zachary.bifromq.inbox.rpc.proto.CommitRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.zachary.bifromq.inbox.rpc.proto.CommitRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.reqId_ = reqId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.qos_ = qos_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.upToSeq_ = upToSeq_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.inboxId_ = inboxId_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.clientInfo_ = clientInfoBuilder_ == null
            ? clientInfo_
            : clientInfoBuilder_.build();
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
      if (other instanceof com.zachary.bifromq.inbox.rpc.proto.CommitRequest) {
        return mergeFrom((com.zachary.bifromq.inbox.rpc.proto.CommitRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.zachary.bifromq.inbox.rpc.proto.CommitRequest other) {
      if (other == com.zachary.bifromq.inbox.rpc.proto.CommitRequest.getDefaultInstance()) return this;
      if (other.getReqId() != 0L) {
        setReqId(other.getReqId());
      }
      if (other.qos_ != 0) {
        setQosValue(other.getQosValue());
      }
      if (other.getUpToSeq() != 0L) {
        setUpToSeq(other.getUpToSeq());
      }
      if (!other.getInboxId().isEmpty()) {
        inboxId_ = other.inboxId_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      if (other.hasClientInfo()) {
        mergeClientInfo(other.getClientInfo());
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
              qos_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              upToSeq_ = input.readUInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 34: {
              inboxId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 42: {
              input.readMessage(
                  getClientInfoFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000010;
              break;
            } // case 42
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

    private int qos_ = 0;
    /**
     * <code>.commontype.QoS qos = 2;</code>
     * @return The enum numeric value on the wire for qos.
     */
    @java.lang.Override public int getQosValue() {
      return qos_;
    }
    /**
     * <code>.commontype.QoS qos = 2;</code>
     * @param value The enum numeric value on the wire for qos to set.
     * @return This builder for chaining.
     */
    public Builder setQosValue(int value) {
      qos_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.commontype.QoS qos = 2;</code>
     * @return The qos.
     */
    @java.lang.Override
    public com.zachary.bifromq.type.QoS getQos() {
      com.zachary.bifromq.type.QoS result = com.zachary.bifromq.type.QoS.forNumber(qos_);
      return result == null ? com.zachary.bifromq.type.QoS.UNRECOGNIZED : result;
    }
    /**
     * <code>.commontype.QoS qos = 2;</code>
     * @param value The qos to set.
     * @return This builder for chaining.
     */
    public Builder setQos(com.zachary.bifromq.type.QoS value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      qos_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.commontype.QoS qos = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearQos() {
      bitField0_ = (bitField0_ & ~0x00000002);
      qos_ = 0;
      onChanged();
      return this;
    }

    private long upToSeq_ ;
    /**
     * <code>uint64 upToSeq = 3;</code>
     * @return The upToSeq.
     */
    @java.lang.Override
    public long getUpToSeq() {
      return upToSeq_;
    }
    /**
     * <code>uint64 upToSeq = 3;</code>
     * @param value The upToSeq to set.
     * @return This builder for chaining.
     */
    public Builder setUpToSeq(long value) {
      
      upToSeq_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 upToSeq = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearUpToSeq() {
      bitField0_ = (bitField0_ & ~0x00000004);
      upToSeq_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object inboxId_ = "";
    /**
     * <code>string inboxId = 4;</code>
     * @return The inboxId.
     */
    public java.lang.String getInboxId() {
      java.lang.Object ref = inboxId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        inboxId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string inboxId = 4;</code>
     * @return The bytes for inboxId.
     */
    public com.google.protobuf.ByteString
        getInboxIdBytes() {
      java.lang.Object ref = inboxId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        inboxId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string inboxId = 4;</code>
     * @param value The inboxId to set.
     * @return This builder for chaining.
     */
    public Builder setInboxId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      inboxId_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>string inboxId = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearInboxId() {
      inboxId_ = getDefaultInstance().getInboxId();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>string inboxId = 4;</code>
     * @param value The bytes for inboxId to set.
     * @return This builder for chaining.
     */
    public Builder setInboxIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      inboxId_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    private com.zachary.bifromq.type.ClientInfo clientInfo_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.zachary.bifromq.type.ClientInfo, com.zachary.bifromq.type.ClientInfo.Builder, com.zachary.bifromq.type.ClientInfoOrBuilder> clientInfoBuilder_;
    /**
     * <code>.commontype.ClientInfo clientInfo = 5;</code>
     * @return Whether the clientInfo field is set.
     */
    public boolean hasClientInfo() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <code>.commontype.ClientInfo clientInfo = 5;</code>
     * @return The clientInfo.
     */
    public com.zachary.bifromq.type.ClientInfo getClientInfo() {
      if (clientInfoBuilder_ == null) {
        return clientInfo_ == null ? com.zachary.bifromq.type.ClientInfo.getDefaultInstance() : clientInfo_;
      } else {
        return clientInfoBuilder_.getMessage();
      }
    }
    /**
     * <code>.commontype.ClientInfo clientInfo = 5;</code>
     */
    public Builder setClientInfo(com.zachary.bifromq.type.ClientInfo value) {
      if (clientInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        clientInfo_ = value;
      } else {
        clientInfoBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>.commontype.ClientInfo clientInfo = 5;</code>
     */
    public Builder setClientInfo(
        com.zachary.bifromq.type.ClientInfo.Builder builderForValue) {
      if (clientInfoBuilder_ == null) {
        clientInfo_ = builderForValue.build();
      } else {
        clientInfoBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>.commontype.ClientInfo clientInfo = 5;</code>
     */
    public Builder mergeClientInfo(com.zachary.bifromq.type.ClientInfo value) {
      if (clientInfoBuilder_ == null) {
        if (((bitField0_ & 0x00000010) != 0) &&
          clientInfo_ != null &&
          clientInfo_ != com.zachary.bifromq.type.ClientInfo.getDefaultInstance()) {
          getClientInfoBuilder().mergeFrom(value);
        } else {
          clientInfo_ = value;
        }
      } else {
        clientInfoBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>.commontype.ClientInfo clientInfo = 5;</code>
     */
    public Builder clearClientInfo() {
      bitField0_ = (bitField0_ & ~0x00000010);
      clientInfo_ = null;
      if (clientInfoBuilder_ != null) {
        clientInfoBuilder_.dispose();
        clientInfoBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.commontype.ClientInfo clientInfo = 5;</code>
     */
    public com.zachary.bifromq.type.ClientInfo.Builder getClientInfoBuilder() {
      bitField0_ |= 0x00000010;
      onChanged();
      return getClientInfoFieldBuilder().getBuilder();
    }
    /**
     * <code>.commontype.ClientInfo clientInfo = 5;</code>
     */
    public com.zachary.bifromq.type.ClientInfoOrBuilder getClientInfoOrBuilder() {
      if (clientInfoBuilder_ != null) {
        return clientInfoBuilder_.getMessageOrBuilder();
      } else {
        return clientInfo_ == null ?
            com.zachary.bifromq.type.ClientInfo.getDefaultInstance() : clientInfo_;
      }
    }
    /**
     * <code>.commontype.ClientInfo clientInfo = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.zachary.bifromq.type.ClientInfo, com.zachary.bifromq.type.ClientInfo.Builder, com.zachary.bifromq.type.ClientInfoOrBuilder> 
        getClientInfoFieldBuilder() {
      if (clientInfoBuilder_ == null) {
        clientInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.zachary.bifromq.type.ClientInfo, com.zachary.bifromq.type.ClientInfo.Builder, com.zachary.bifromq.type.ClientInfoOrBuilder>(
                getClientInfo(),
                getParentForChildren(),
                isClean());
        clientInfo_ = null;
      }
      return clientInfoBuilder_;
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


    // @@protoc_insertion_point(builder_scope:inboxservice.CommitRequest)
  }

  // @@protoc_insertion_point(class_scope:inboxservice.CommitRequest)
  private static final com.zachary.bifromq.inbox.rpc.proto.CommitRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.zachary.bifromq.inbox.rpc.proto.CommitRequest();
  }

  public static com.zachary.bifromq.inbox.rpc.proto.CommitRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CommitRequest>
      PARSER = new com.google.protobuf.AbstractParser<CommitRequest>() {
    @java.lang.Override
    public CommitRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CommitRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CommitRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.zachary.bifromq.inbox.rpc.proto.CommitRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

