// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: distservice/DistCoProc.proto

package com.zachary.bifromq.dist.rpc.proto;

/**
 * Protobuf type {@code distservice.InboxSubInfo}
 */
public final class InboxSubInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:distservice.InboxSubInfo)
    InboxSubInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use InboxSubInfo.newBuilder() to construct.
  private InboxSubInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InboxSubInfo() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new InboxSubInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.zachary.bifromq.dist.rpc.proto.DistCoProcProtos.internal_static_distservice_InboxSubInfo_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 1:
        return internalGetTopicFilters();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.zachary.bifromq.dist.rpc.proto.DistCoProcProtos.internal_static_distservice_InboxSubInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.zachary.bifromq.dist.rpc.proto.InboxSubInfo.class, com.zachary.bifromq.dist.rpc.proto.InboxSubInfo.Builder.class);
  }

  public static final int TOPICFILTERS_FIELD_NUMBER = 1;
  private static final class TopicFiltersDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, java.lang.Integer> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.Integer>newDefaultInstance(
                com.zachary.bifromq.dist.rpc.proto.DistCoProcProtos.internal_static_distservice_InboxSubInfo_TopicFiltersEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.ENUM,
                com.zachary.bifromq.type.QoS.AT_MOST_ONCE.getNumber());
  }
  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<
      java.lang.String, java.lang.Integer> topicFilters_;
  private com.google.protobuf.MapField<java.lang.String, java.lang.Integer>
  internalGetTopicFilters() {
    if (topicFilters_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          TopicFiltersDefaultEntryHolder.defaultEntry);
    }
    return topicFilters_;
  }
  private static final
  com.google.protobuf.Internal.MapAdapter.Converter<
      java.lang.Integer, com.zachary.bifromq.type.QoS> topicFiltersValueConverter =
          com.google.protobuf.Internal.MapAdapter.newEnumConverter(
              com.zachary.bifromq.type.QoS.internalGetValueMap(),
              com.zachary.bifromq.type.QoS.UNRECOGNIZED);
  private static final java.util.Map<java.lang.String, com.zachary.bifromq.type.QoS>
  internalGetAdaptedTopicFiltersMap(
      java.util.Map<java.lang.String, java.lang.Integer> map) {
    return new com.google.protobuf.Internal.MapAdapter<
        java.lang.String, com.zachary.bifromq.type.QoS, java.lang.Integer>(
            map, topicFiltersValueConverter);
  }
  public int getTopicFiltersCount() {
    return internalGetTopicFilters().getMap().size();
  }
  /**
   * <pre>
   * key: Original TopicFilter
   * </pre>
   *
   * <code>map&lt;string, .commontype.QoS&gt; topicFilters = 1;</code>
   */
  @java.lang.Override
  public boolean containsTopicFilters(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    return internalGetTopicFilters().getMap().containsKey(key);
  }
  /**
   * Use {@link #getTopicFiltersMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, com.zachary.bifromq.type.QoS>
  getTopicFilters() {
    return getTopicFiltersMap();
  }
  /**
   * <pre>
   * key: Original TopicFilter
   * </pre>
   *
   * <code>map&lt;string, .commontype.QoS&gt; topicFilters = 1;</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, com.zachary.bifromq.type.QoS>
  getTopicFiltersMap() {
    return internalGetAdaptedTopicFiltersMap(
        internalGetTopicFilters().getMap());}
  /**
   * <pre>
   * key: Original TopicFilter
   * </pre>
   *
   * <code>map&lt;string, .commontype.QoS&gt; topicFilters = 1;</code>
   */
  @java.lang.Override
  public /* nullable */
com.zachary.bifromq.type.QoS getTopicFiltersOrDefault(
      java.lang.String key,
      /* nullable */
com.zachary.bifromq.type.QoS defaultValue) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.Integer> map =
        internalGetTopicFilters().getMap();
    return map.containsKey(key)
           ? topicFiltersValueConverter.doForward(map.get(key))
           : defaultValue;
  }
  /**
   * <pre>
   * key: Original TopicFilter
   * </pre>
   *
   * <code>map&lt;string, .commontype.QoS&gt; topicFilters = 1;</code>
   */
  @java.lang.Override
  public com.zachary.bifromq.type.QoS getTopicFiltersOrThrow(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.Integer> map =
        internalGetTopicFilters().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return topicFiltersValueConverter.doForward(map.get(key));
  }
  /**
   * Use {@link #getTopicFiltersValueMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.Integer>
  getTopicFiltersValue() {
    return getTopicFiltersValueMap();
  }
  /**
   * <pre>
   * key: Original TopicFilter
   * </pre>
   *
   * <code>map&lt;string, .commontype.QoS&gt; topicFilters = 1;</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, java.lang.Integer>
  getTopicFiltersValueMap() {
    return internalGetTopicFilters().getMap();
  }
  /**
   * <pre>
   * key: Original TopicFilter
   * </pre>
   *
   * <code>map&lt;string, .commontype.QoS&gt; topicFilters = 1;</code>
   */
  @java.lang.Override
  public int getTopicFiltersValueOrDefault(
      java.lang.String key,
      int defaultValue) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.Integer> map =
        internalGetTopicFilters().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * key: Original TopicFilter
   * </pre>
   *
   * <code>map&lt;string, .commontype.QoS&gt; topicFilters = 1;</code>
   */
  @java.lang.Override
  public int getTopicFiltersValueOrThrow(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.Integer> map =
        internalGetTopicFilters().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetTopicFilters(),
        TopicFiltersDefaultEntryHolder.defaultEntry,
        1);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.String, java.lang.Integer> entry
         : internalGetTopicFilters().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.Integer>
      topicFilters__ = TopicFiltersDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, topicFilters__);
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
    if (!(obj instanceof com.zachary.bifromq.dist.rpc.proto.InboxSubInfo)) {
      return super.equals(obj);
    }
    com.zachary.bifromq.dist.rpc.proto.InboxSubInfo other = (com.zachary.bifromq.dist.rpc.proto.InboxSubInfo) obj;

    if (!internalGetTopicFilters().equals(
        other.internalGetTopicFilters())) return false;
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
    if (!internalGetTopicFilters().getMap().isEmpty()) {
      hash = (37 * hash) + TOPICFILTERS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetTopicFilters().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.zachary.bifromq.dist.rpc.proto.InboxSubInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.zachary.bifromq.dist.rpc.proto.InboxSubInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.zachary.bifromq.dist.rpc.proto.InboxSubInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.zachary.bifromq.dist.rpc.proto.InboxSubInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.zachary.bifromq.dist.rpc.proto.InboxSubInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.zachary.bifromq.dist.rpc.proto.InboxSubInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.zachary.bifromq.dist.rpc.proto.InboxSubInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.zachary.bifromq.dist.rpc.proto.InboxSubInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.zachary.bifromq.dist.rpc.proto.InboxSubInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.zachary.bifromq.dist.rpc.proto.InboxSubInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.zachary.bifromq.dist.rpc.proto.InboxSubInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.zachary.bifromq.dist.rpc.proto.InboxSubInfo parseFrom(
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
  public static Builder newBuilder(com.zachary.bifromq.dist.rpc.proto.InboxSubInfo prototype) {
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
   * Protobuf type {@code distservice.InboxSubInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:distservice.InboxSubInfo)
      com.zachary.bifromq.dist.rpc.proto.InboxSubInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.zachary.bifromq.dist.rpc.proto.DistCoProcProtos.internal_static_distservice_InboxSubInfo_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetTopicFilters();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetMutableTopicFilters();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.zachary.bifromq.dist.rpc.proto.DistCoProcProtos.internal_static_distservice_InboxSubInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.zachary.bifromq.dist.rpc.proto.InboxSubInfo.class, com.zachary.bifromq.dist.rpc.proto.InboxSubInfo.Builder.class);
    }

    // Construct using com.zachary.bifromq.dist.rpc.proto.InboxSubInfo.newBuilder()
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
      internalGetMutableTopicFilters().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.zachary.bifromq.dist.rpc.proto.DistCoProcProtos.internal_static_distservice_InboxSubInfo_descriptor;
    }

    @java.lang.Override
    public com.zachary.bifromq.dist.rpc.proto.InboxSubInfo getDefaultInstanceForType() {
      return com.zachary.bifromq.dist.rpc.proto.InboxSubInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.zachary.bifromq.dist.rpc.proto.InboxSubInfo build() {
      com.zachary.bifromq.dist.rpc.proto.InboxSubInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.zachary.bifromq.dist.rpc.proto.InboxSubInfo buildPartial() {
      com.zachary.bifromq.dist.rpc.proto.InboxSubInfo result = new com.zachary.bifromq.dist.rpc.proto.InboxSubInfo(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.zachary.bifromq.dist.rpc.proto.InboxSubInfo result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.topicFilters_ = internalGetTopicFilters();
        result.topicFilters_.makeImmutable();
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
      if (other instanceof com.zachary.bifromq.dist.rpc.proto.InboxSubInfo) {
        return mergeFrom((com.zachary.bifromq.dist.rpc.proto.InboxSubInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.zachary.bifromq.dist.rpc.proto.InboxSubInfo other) {
      if (other == com.zachary.bifromq.dist.rpc.proto.InboxSubInfo.getDefaultInstance()) return this;
      internalGetMutableTopicFilters().mergeFrom(
          other.internalGetTopicFilters());
      bitField0_ |= 0x00000001;
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
              com.google.protobuf.MapEntry<java.lang.String, java.lang.Integer>
              topicFilters__ = input.readMessage(
                  TopicFiltersDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              internalGetMutableTopicFilters().getMutableMap().put(
                  topicFilters__.getKey(), topicFilters__.getValue());
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

    private com.google.protobuf.MapField<
        java.lang.String, java.lang.Integer> topicFilters_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.Integer>
        internalGetTopicFilters() {
      if (topicFilters_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            TopicFiltersDefaultEntryHolder.defaultEntry);
      }
      return topicFilters_;
    }
    private com.google.protobuf.MapField<java.lang.String, java.lang.Integer>
        internalGetMutableTopicFilters() {
      if (topicFilters_ == null) {
        topicFilters_ = com.google.protobuf.MapField.newMapField(
            TopicFiltersDefaultEntryHolder.defaultEntry);
      }
      if (!topicFilters_.isMutable()) {
        topicFilters_ = topicFilters_.copy();
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return topicFilters_;
    }
    public int getTopicFiltersCount() {
      return internalGetTopicFilters().getMap().size();
    }
    /**
     * <pre>
     * key: Original TopicFilter
     * </pre>
     *
     * <code>map&lt;string, .commontype.QoS&gt; topicFilters = 1;</code>
     */
    @java.lang.Override
    public boolean containsTopicFilters(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      return internalGetTopicFilters().getMap().containsKey(key);
    }
    /**
     * Use {@link #getTopicFiltersMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.zachary.bifromq.type.QoS>
    getTopicFilters() {
      return getTopicFiltersMap();
    }
    /**
     * <pre>
     * key: Original TopicFilter
     * </pre>
     *
     * <code>map&lt;string, .commontype.QoS&gt; topicFilters = 1;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, com.zachary.bifromq.type.QoS>
    getTopicFiltersMap() {
      return internalGetAdaptedTopicFiltersMap(
          internalGetTopicFilters().getMap());}
    /**
     * <pre>
     * key: Original TopicFilter
     * </pre>
     *
     * <code>map&lt;string, .commontype.QoS&gt; topicFilters = 1;</code>
     */
    @java.lang.Override
    public /* nullable */
com.zachary.bifromq.type.QoS getTopicFiltersOrDefault(
        java.lang.String key,
        /* nullable */
com.zachary.bifromq.type.QoS defaultValue) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.Integer> map =
          internalGetTopicFilters().getMap();
      return map.containsKey(key)
             ? topicFiltersValueConverter.doForward(map.get(key))
             : defaultValue;
    }
    /**
     * <pre>
     * key: Original TopicFilter
     * </pre>
     *
     * <code>map&lt;string, .commontype.QoS&gt; topicFilters = 1;</code>
     */
    @java.lang.Override
    public com.zachary.bifromq.type.QoS getTopicFiltersOrThrow(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.Integer> map =
          internalGetTopicFilters().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return topicFiltersValueConverter.doForward(map.get(key));
    }
    /**
     * Use {@link #getTopicFiltersValueMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.Integer>
    getTopicFiltersValue() {
      return getTopicFiltersValueMap();
    }
    /**
     * <pre>
     * key: Original TopicFilter
     * </pre>
     *
     * <code>map&lt;string, .commontype.QoS&gt; topicFilters = 1;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, java.lang.Integer>
    getTopicFiltersValueMap() {
      return internalGetTopicFilters().getMap();
    }
    /**
     * <pre>
     * key: Original TopicFilter
     * </pre>
     *
     * <code>map&lt;string, .commontype.QoS&gt; topicFilters = 1;</code>
     */
    @java.lang.Override
    public int getTopicFiltersValueOrDefault(
        java.lang.String key,
        int defaultValue) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.Integer> map =
          internalGetTopicFilters().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * key: Original TopicFilter
     * </pre>
     *
     * <code>map&lt;string, .commontype.QoS&gt; topicFilters = 1;</code>
     */
    @java.lang.Override
    public int getTopicFiltersValueOrThrow(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.Integer> map =
          internalGetTopicFilters().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }
    public Builder clearTopicFilters() {
      bitField0_ = (bitField0_ & ~0x00000001);
      internalGetMutableTopicFilters().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <pre>
     * key: Original TopicFilter
     * </pre>
     *
     * <code>map&lt;string, .commontype.QoS&gt; topicFilters = 1;</code>
     */
    public Builder removeTopicFilters(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      internalGetMutableTopicFilters().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.zachary.bifromq.type.QoS>
        getMutableTopicFilters() {
      bitField0_ |= 0x00000001;
      return internalGetAdaptedTopicFiltersMap(
           internalGetMutableTopicFilters().getMutableMap());
    }
    /**
     * <pre>
     * key: Original TopicFilter
     * </pre>
     *
     * <code>map&lt;string, .commontype.QoS&gt; topicFilters = 1;</code>
     */
    public Builder putTopicFilters(
        java.lang.String key,
        com.zachary.bifromq.type.QoS value) {
      if (key == null) { throw new NullPointerException("map key"); }
      
      internalGetMutableTopicFilters().getMutableMap()
          .put(key, topicFiltersValueConverter.doBackward(value));
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <pre>
     * key: Original TopicFilter
     * </pre>
     *
     * <code>map&lt;string, .commontype.QoS&gt; topicFilters = 1;</code>
     */
    public Builder putAllTopicFilters(
        java.util.Map<java.lang.String, com.zachary.bifromq.type.QoS> values) {
      internalGetAdaptedTopicFiltersMap(
          internalGetMutableTopicFilters().getMutableMap())
              .putAll(values);
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.Integer>
    getMutableTopicFiltersValue() {
      bitField0_ |= 0x00000001;
      return internalGetMutableTopicFilters().getMutableMap();
    }
    /**
     * <pre>
     * key: Original TopicFilter
     * </pre>
     *
     * <code>map&lt;string, .commontype.QoS&gt; topicFilters = 1;</code>
     */
    public Builder putTopicFiltersValue(
        java.lang.String key,
        int value) {
      if (key == null) { throw new NullPointerException("map key"); }
      
      internalGetMutableTopicFilters().getMutableMap()
          .put(key, value);
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <pre>
     * key: Original TopicFilter
     * </pre>
     *
     * <code>map&lt;string, .commontype.QoS&gt; topicFilters = 1;</code>
     */
    public Builder putAllTopicFiltersValue(
        java.util.Map<java.lang.String, java.lang.Integer> values) {
      internalGetMutableTopicFilters().getMutableMap()
          .putAll(values);
      bitField0_ |= 0x00000001;
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


    // @@protoc_insertion_point(builder_scope:distservice.InboxSubInfo)
  }

  // @@protoc_insertion_point(class_scope:distservice.InboxSubInfo)
  private static final com.zachary.bifromq.dist.rpc.proto.InboxSubInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.zachary.bifromq.dist.rpc.proto.InboxSubInfo();
  }

  public static com.zachary.bifromq.dist.rpc.proto.InboxSubInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InboxSubInfo>
      PARSER = new com.google.protobuf.AbstractParser<InboxSubInfo>() {
    @java.lang.Override
    public InboxSubInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<InboxSubInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InboxSubInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.zachary.bifromq.dist.rpc.proto.InboxSubInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

