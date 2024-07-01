// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: distservice/DistCoProc.proto

package com.zachary.bifromq.dist.rpc.proto;

/**
 * Protobuf type {@code distservice.BatchDist}
 */
public final class BatchDist extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:distservice.BatchDist)
    BatchDistOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BatchDist.newBuilder() to construct.
  private BatchDist(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BatchDist() {
    distPack_ = java.util.Collections.emptyList();
    orderKey_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BatchDist();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.zachary.bifromq.dist.rpc.proto.DistCoProcProtos.internal_static_distservice_BatchDist_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.zachary.bifromq.dist.rpc.proto.DistCoProcProtos.internal_static_distservice_BatchDist_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.zachary.bifromq.dist.rpc.proto.BatchDist.class, com.zachary.bifromq.dist.rpc.proto.BatchDist.Builder.class);
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

  public static final int DISTPACK_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<com.zachary.bifromq.dist.rpc.proto.DistPack> distPack_;
  /**
   * <pre>
   * sorted by tenantId and topic
   * </pre>
   *
   * <code>repeated .distservice.DistPack distPack = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.zachary.bifromq.dist.rpc.proto.DistPack> getDistPackList() {
    return distPack_;
  }
  /**
   * <pre>
   * sorted by tenantId and topic
   * </pre>
   *
   * <code>repeated .distservice.DistPack distPack = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.zachary.bifromq.dist.rpc.proto.DistPackOrBuilder> 
      getDistPackOrBuilderList() {
    return distPack_;
  }
  /**
   * <pre>
   * sorted by tenantId and topic
   * </pre>
   *
   * <code>repeated .distservice.DistPack distPack = 2;</code>
   */
  @java.lang.Override
  public int getDistPackCount() {
    return distPack_.size();
  }
  /**
   * <pre>
   * sorted by tenantId and topic
   * </pre>
   *
   * <code>repeated .distservice.DistPack distPack = 2;</code>
   */
  @java.lang.Override
  public com.zachary.bifromq.dist.rpc.proto.DistPack getDistPack(int index) {
    return distPack_.get(index);
  }
  /**
   * <pre>
   * sorted by tenantId and topic
   * </pre>
   *
   * <code>repeated .distservice.DistPack distPack = 2;</code>
   */
  @java.lang.Override
  public com.zachary.bifromq.dist.rpc.proto.DistPackOrBuilder getDistPackOrBuilder(
      int index) {
    return distPack_.get(index);
  }

  public static final int ORDERKEY_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object orderKey_ = "";
  /**
   * <code>string orderKey = 3;</code>
   * @return The orderKey.
   */
  @java.lang.Override
  public java.lang.String getOrderKey() {
    java.lang.Object ref = orderKey_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      orderKey_ = s;
      return s;
    }
  }
  /**
   * <code>string orderKey = 3;</code>
   * @return The bytes for orderKey.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOrderKeyBytes() {
    java.lang.Object ref = orderKey_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      orderKey_ = b;
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
    for (int i = 0; i < distPack_.size(); i++) {
      output.writeMessage(2, distPack_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(orderKey_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, orderKey_);
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
    for (int i = 0; i < distPack_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, distPack_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(orderKey_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, orderKey_);
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
    if (!(obj instanceof com.zachary.bifromq.dist.rpc.proto.BatchDist)) {
      return super.equals(obj);
    }
    com.zachary.bifromq.dist.rpc.proto.BatchDist other = (com.zachary.bifromq.dist.rpc.proto.BatchDist) obj;

    if (getReqId()
        != other.getReqId()) return false;
    if (!getDistPackList()
        .equals(other.getDistPackList())) return false;
    if (!getOrderKey()
        .equals(other.getOrderKey())) return false;
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
    if (getDistPackCount() > 0) {
      hash = (37 * hash) + DISTPACK_FIELD_NUMBER;
      hash = (53 * hash) + getDistPackList().hashCode();
    }
    hash = (37 * hash) + ORDERKEY_FIELD_NUMBER;
    hash = (53 * hash) + getOrderKey().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.zachary.bifromq.dist.rpc.proto.BatchDist parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.zachary.bifromq.dist.rpc.proto.BatchDist parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.zachary.bifromq.dist.rpc.proto.BatchDist parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.zachary.bifromq.dist.rpc.proto.BatchDist parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.zachary.bifromq.dist.rpc.proto.BatchDist parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.zachary.bifromq.dist.rpc.proto.BatchDist parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.zachary.bifromq.dist.rpc.proto.BatchDist parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.zachary.bifromq.dist.rpc.proto.BatchDist parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.zachary.bifromq.dist.rpc.proto.BatchDist parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.zachary.bifromq.dist.rpc.proto.BatchDist parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.zachary.bifromq.dist.rpc.proto.BatchDist parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.zachary.bifromq.dist.rpc.proto.BatchDist parseFrom(
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
  public static Builder newBuilder(com.zachary.bifromq.dist.rpc.proto.BatchDist prototype) {
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
   * Protobuf type {@code distservice.BatchDist}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:distservice.BatchDist)
      com.zachary.bifromq.dist.rpc.proto.BatchDistOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.zachary.bifromq.dist.rpc.proto.DistCoProcProtos.internal_static_distservice_BatchDist_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.zachary.bifromq.dist.rpc.proto.DistCoProcProtos.internal_static_distservice_BatchDist_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.zachary.bifromq.dist.rpc.proto.BatchDist.class, com.zachary.bifromq.dist.rpc.proto.BatchDist.Builder.class);
    }

    // Construct using com.zachary.bifromq.dist.rpc.proto.BatchDist.newBuilder()
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
      if (distPackBuilder_ == null) {
        distPack_ = java.util.Collections.emptyList();
      } else {
        distPack_ = null;
        distPackBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      orderKey_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.zachary.bifromq.dist.rpc.proto.DistCoProcProtos.internal_static_distservice_BatchDist_descriptor;
    }

    @java.lang.Override
    public com.zachary.bifromq.dist.rpc.proto.BatchDist getDefaultInstanceForType() {
      return com.zachary.bifromq.dist.rpc.proto.BatchDist.getDefaultInstance();
    }

    @java.lang.Override
    public com.zachary.bifromq.dist.rpc.proto.BatchDist build() {
      com.zachary.bifromq.dist.rpc.proto.BatchDist result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.zachary.bifromq.dist.rpc.proto.BatchDist buildPartial() {
      com.zachary.bifromq.dist.rpc.proto.BatchDist result = new com.zachary.bifromq.dist.rpc.proto.BatchDist(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.zachary.bifromq.dist.rpc.proto.BatchDist result) {
      if (distPackBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          distPack_ = java.util.Collections.unmodifiableList(distPack_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.distPack_ = distPack_;
      } else {
        result.distPack_ = distPackBuilder_.build();
      }
    }

    private void buildPartial0(com.zachary.bifromq.dist.rpc.proto.BatchDist result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.reqId_ = reqId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.orderKey_ = orderKey_;
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
      if (other instanceof com.zachary.bifromq.dist.rpc.proto.BatchDist) {
        return mergeFrom((com.zachary.bifromq.dist.rpc.proto.BatchDist)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.zachary.bifromq.dist.rpc.proto.BatchDist other) {
      if (other == com.zachary.bifromq.dist.rpc.proto.BatchDist.getDefaultInstance()) return this;
      if (other.getReqId() != 0L) {
        setReqId(other.getReqId());
      }
      if (distPackBuilder_ == null) {
        if (!other.distPack_.isEmpty()) {
          if (distPack_.isEmpty()) {
            distPack_ = other.distPack_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureDistPackIsMutable();
            distPack_.addAll(other.distPack_);
          }
          onChanged();
        }
      } else {
        if (!other.distPack_.isEmpty()) {
          if (distPackBuilder_.isEmpty()) {
            distPackBuilder_.dispose();
            distPackBuilder_ = null;
            distPack_ = other.distPack_;
            bitField0_ = (bitField0_ & ~0x00000002);
            distPackBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getDistPackFieldBuilder() : null;
          } else {
            distPackBuilder_.addAllMessages(other.distPack_);
          }
        }
      }
      if (!other.getOrderKey().isEmpty()) {
        orderKey_ = other.orderKey_;
        bitField0_ |= 0x00000004;
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
            case 18: {
              com.zachary.bifromq.dist.rpc.proto.DistPack m =
                  input.readMessage(
                      com.zachary.bifromq.dist.rpc.proto.DistPack.parser(),
                      extensionRegistry);
              if (distPackBuilder_ == null) {
                ensureDistPackIsMutable();
                distPack_.add(m);
              } else {
                distPackBuilder_.addMessage(m);
              }
              break;
            } // case 18
            case 26: {
              orderKey_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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

    private java.util.List<com.zachary.bifromq.dist.rpc.proto.DistPack> distPack_ =
      java.util.Collections.emptyList();
    private void ensureDistPackIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        distPack_ = new java.util.ArrayList<com.zachary.bifromq.dist.rpc.proto.DistPack>(distPack_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.zachary.bifromq.dist.rpc.proto.DistPack, com.zachary.bifromq.dist.rpc.proto.DistPack.Builder, com.zachary.bifromq.dist.rpc.proto.DistPackOrBuilder> distPackBuilder_;

    /**
     * <pre>
     * sorted by tenantId and topic
     * </pre>
     *
     * <code>repeated .distservice.DistPack distPack = 2;</code>
     */
    public java.util.List<com.zachary.bifromq.dist.rpc.proto.DistPack> getDistPackList() {
      if (distPackBuilder_ == null) {
        return java.util.Collections.unmodifiableList(distPack_);
      } else {
        return distPackBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * sorted by tenantId and topic
     * </pre>
     *
     * <code>repeated .distservice.DistPack distPack = 2;</code>
     */
    public int getDistPackCount() {
      if (distPackBuilder_ == null) {
        return distPack_.size();
      } else {
        return distPackBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * sorted by tenantId and topic
     * </pre>
     *
     * <code>repeated .distservice.DistPack distPack = 2;</code>
     */
    public com.zachary.bifromq.dist.rpc.proto.DistPack getDistPack(int index) {
      if (distPackBuilder_ == null) {
        return distPack_.get(index);
      } else {
        return distPackBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * sorted by tenantId and topic
     * </pre>
     *
     * <code>repeated .distservice.DistPack distPack = 2;</code>
     */
    public Builder setDistPack(
        int index, com.zachary.bifromq.dist.rpc.proto.DistPack value) {
      if (distPackBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDistPackIsMutable();
        distPack_.set(index, value);
        onChanged();
      } else {
        distPackBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * sorted by tenantId and topic
     * </pre>
     *
     * <code>repeated .distservice.DistPack distPack = 2;</code>
     */
    public Builder setDistPack(
        int index, com.zachary.bifromq.dist.rpc.proto.DistPack.Builder builderForValue) {
      if (distPackBuilder_ == null) {
        ensureDistPackIsMutable();
        distPack_.set(index, builderForValue.build());
        onChanged();
      } else {
        distPackBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * sorted by tenantId and topic
     * </pre>
     *
     * <code>repeated .distservice.DistPack distPack = 2;</code>
     */
    public Builder addDistPack(com.zachary.bifromq.dist.rpc.proto.DistPack value) {
      if (distPackBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDistPackIsMutable();
        distPack_.add(value);
        onChanged();
      } else {
        distPackBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * sorted by tenantId and topic
     * </pre>
     *
     * <code>repeated .distservice.DistPack distPack = 2;</code>
     */
    public Builder addDistPack(
        int index, com.zachary.bifromq.dist.rpc.proto.DistPack value) {
      if (distPackBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDistPackIsMutable();
        distPack_.add(index, value);
        onChanged();
      } else {
        distPackBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * sorted by tenantId and topic
     * </pre>
     *
     * <code>repeated .distservice.DistPack distPack = 2;</code>
     */
    public Builder addDistPack(
        com.zachary.bifromq.dist.rpc.proto.DistPack.Builder builderForValue) {
      if (distPackBuilder_ == null) {
        ensureDistPackIsMutable();
        distPack_.add(builderForValue.build());
        onChanged();
      } else {
        distPackBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * sorted by tenantId and topic
     * </pre>
     *
     * <code>repeated .distservice.DistPack distPack = 2;</code>
     */
    public Builder addDistPack(
        int index, com.zachary.bifromq.dist.rpc.proto.DistPack.Builder builderForValue) {
      if (distPackBuilder_ == null) {
        ensureDistPackIsMutable();
        distPack_.add(index, builderForValue.build());
        onChanged();
      } else {
        distPackBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * sorted by tenantId and topic
     * </pre>
     *
     * <code>repeated .distservice.DistPack distPack = 2;</code>
     */
    public Builder addAllDistPack(
        java.lang.Iterable<? extends com.zachary.bifromq.dist.rpc.proto.DistPack> values) {
      if (distPackBuilder_ == null) {
        ensureDistPackIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, distPack_);
        onChanged();
      } else {
        distPackBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * sorted by tenantId and topic
     * </pre>
     *
     * <code>repeated .distservice.DistPack distPack = 2;</code>
     */
    public Builder clearDistPack() {
      if (distPackBuilder_ == null) {
        distPack_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        distPackBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * sorted by tenantId and topic
     * </pre>
     *
     * <code>repeated .distservice.DistPack distPack = 2;</code>
     */
    public Builder removeDistPack(int index) {
      if (distPackBuilder_ == null) {
        ensureDistPackIsMutable();
        distPack_.remove(index);
        onChanged();
      } else {
        distPackBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * sorted by tenantId and topic
     * </pre>
     *
     * <code>repeated .distservice.DistPack distPack = 2;</code>
     */
    public com.zachary.bifromq.dist.rpc.proto.DistPack.Builder getDistPackBuilder(
        int index) {
      return getDistPackFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * sorted by tenantId and topic
     * </pre>
     *
     * <code>repeated .distservice.DistPack distPack = 2;</code>
     */
    public com.zachary.bifromq.dist.rpc.proto.DistPackOrBuilder getDistPackOrBuilder(
        int index) {
      if (distPackBuilder_ == null) {
        return distPack_.get(index);  } else {
        return distPackBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * sorted by tenantId and topic
     * </pre>
     *
     * <code>repeated .distservice.DistPack distPack = 2;</code>
     */
    public java.util.List<? extends com.zachary.bifromq.dist.rpc.proto.DistPackOrBuilder> 
         getDistPackOrBuilderList() {
      if (distPackBuilder_ != null) {
        return distPackBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(distPack_);
      }
    }
    /**
     * <pre>
     * sorted by tenantId and topic
     * </pre>
     *
     * <code>repeated .distservice.DistPack distPack = 2;</code>
     */
    public com.zachary.bifromq.dist.rpc.proto.DistPack.Builder addDistPackBuilder() {
      return getDistPackFieldBuilder().addBuilder(
          com.zachary.bifromq.dist.rpc.proto.DistPack.getDefaultInstance());
    }
    /**
     * <pre>
     * sorted by tenantId and topic
     * </pre>
     *
     * <code>repeated .distservice.DistPack distPack = 2;</code>
     */
    public com.zachary.bifromq.dist.rpc.proto.DistPack.Builder addDistPackBuilder(
        int index) {
      return getDistPackFieldBuilder().addBuilder(
          index, com.zachary.bifromq.dist.rpc.proto.DistPack.getDefaultInstance());
    }
    /**
     * <pre>
     * sorted by tenantId and topic
     * </pre>
     *
     * <code>repeated .distservice.DistPack distPack = 2;</code>
     */
    public java.util.List<com.zachary.bifromq.dist.rpc.proto.DistPack.Builder> 
         getDistPackBuilderList() {
      return getDistPackFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.zachary.bifromq.dist.rpc.proto.DistPack, com.zachary.bifromq.dist.rpc.proto.DistPack.Builder, com.zachary.bifromq.dist.rpc.proto.DistPackOrBuilder> 
        getDistPackFieldBuilder() {
      if (distPackBuilder_ == null) {
        distPackBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.zachary.bifromq.dist.rpc.proto.DistPack, com.zachary.bifromq.dist.rpc.proto.DistPack.Builder, com.zachary.bifromq.dist.rpc.proto.DistPackOrBuilder>(
                distPack_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        distPack_ = null;
      }
      return distPackBuilder_;
    }

    private java.lang.Object orderKey_ = "";
    /**
     * <code>string orderKey = 3;</code>
     * @return The orderKey.
     */
    public java.lang.String getOrderKey() {
      java.lang.Object ref = orderKey_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        orderKey_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string orderKey = 3;</code>
     * @return The bytes for orderKey.
     */
    public com.google.protobuf.ByteString
        getOrderKeyBytes() {
      java.lang.Object ref = orderKey_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        orderKey_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string orderKey = 3;</code>
     * @param value The orderKey to set.
     * @return This builder for chaining.
     */
    public Builder setOrderKey(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      orderKey_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string orderKey = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearOrderKey() {
      orderKey_ = getDefaultInstance().getOrderKey();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string orderKey = 3;</code>
     * @param value The bytes for orderKey to set.
     * @return This builder for chaining.
     */
    public Builder setOrderKeyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      orderKey_ = value;
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:distservice.BatchDist)
  }

  // @@protoc_insertion_point(class_scope:distservice.BatchDist)
  private static final com.zachary.bifromq.dist.rpc.proto.BatchDist DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.zachary.bifromq.dist.rpc.proto.BatchDist();
  }

  public static com.zachary.bifromq.dist.rpc.proto.BatchDist getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BatchDist>
      PARSER = new com.google.protobuf.AbstractParser<BatchDist>() {
    @java.lang.Override
    public BatchDist parsePartialFrom(
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

  public static com.google.protobuf.Parser<BatchDist> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BatchDist> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.zachary.bifromq.dist.rpc.proto.BatchDist getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

