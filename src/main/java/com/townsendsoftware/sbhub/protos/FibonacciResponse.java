// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sbhub.proto

package com.townsendsoftware.sbhub.protos;

/**
 * Protobuf type {@code com.townsendsoftware.sbhub.protos.FibonacciResponse}
 */
public  final class FibonacciResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.townsendsoftware.sbhub.protos.FibonacciResponse)
    FibonacciResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FibonacciResponse.newBuilder() to construct.
  private FibonacciResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FibonacciResponse() {
    version_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FibonacciResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            version_ = input.readInt32();
            break;
          }
          case 18: {
            com.townsendsoftware.sbhub.protos.FibonacciSequence.Builder subBuilder = null;
            if (sequence_ != null) {
              subBuilder = sequence_.toBuilder();
            }
            sequence_ = input.readMessage(com.townsendsoftware.sbhub.protos.FibonacciSequence.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(sequence_);
              sequence_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            com.townsendsoftware.sbhub.protos.FibonacciParameters.Builder subBuilder = null;
            if (parameters_ != null) {
              subBuilder = parameters_.toBuilder();
            }
            parameters_ = input.readMessage(com.townsendsoftware.sbhub.protos.FibonacciParameters.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(parameters_);
              parameters_ = subBuilder.buildPartial();
            }

            break;
          }
          case 34: {
            com.townsendsoftware.sbhub.protos.ResponseMessage.Builder subBuilder = null;
            if (message_ != null) {
              subBuilder = message_.toBuilder();
            }
            message_ = input.readMessage(com.townsendsoftware.sbhub.protos.ResponseMessage.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(message_);
              message_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.townsendsoftware.sbhub.protos.SbHubMessages.internal_static_com_townsendsoftware_sbhub_protos_FibonacciResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.townsendsoftware.sbhub.protos.SbHubMessages.internal_static_com_townsendsoftware_sbhub_protos_FibonacciResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.townsendsoftware.sbhub.protos.FibonacciResponse.class, com.townsendsoftware.sbhub.protos.FibonacciResponse.Builder.class);
  }

  public static final int VERSION_FIELD_NUMBER = 1;
  private int version_;
  /**
   * <code>int32 version = 1;</code>
   */
  public int getVersion() {
    return version_;
  }

  public static final int SEQUENCE_FIELD_NUMBER = 2;
  private com.townsendsoftware.sbhub.protos.FibonacciSequence sequence_;
  /**
   * <code>.com.townsendsoftware.sbhub.protos.FibonacciSequence sequence = 2;</code>
   */
  public boolean hasSequence() {
    return sequence_ != null;
  }
  /**
   * <code>.com.townsendsoftware.sbhub.protos.FibonacciSequence sequence = 2;</code>
   */
  public com.townsendsoftware.sbhub.protos.FibonacciSequence getSequence() {
    return sequence_ == null ? com.townsendsoftware.sbhub.protos.FibonacciSequence.getDefaultInstance() : sequence_;
  }
  /**
   * <code>.com.townsendsoftware.sbhub.protos.FibonacciSequence sequence = 2;</code>
   */
  public com.townsendsoftware.sbhub.protos.FibonacciSequenceOrBuilder getSequenceOrBuilder() {
    return getSequence();
  }

  public static final int PARAMETERS_FIELD_NUMBER = 3;
  private com.townsendsoftware.sbhub.protos.FibonacciParameters parameters_;
  /**
   * <code>.com.townsendsoftware.sbhub.protos.FibonacciParameters parameters = 3;</code>
   */
  public boolean hasParameters() {
    return parameters_ != null;
  }
  /**
   * <code>.com.townsendsoftware.sbhub.protos.FibonacciParameters parameters = 3;</code>
   */
  public com.townsendsoftware.sbhub.protos.FibonacciParameters getParameters() {
    return parameters_ == null ? com.townsendsoftware.sbhub.protos.FibonacciParameters.getDefaultInstance() : parameters_;
  }
  /**
   * <code>.com.townsendsoftware.sbhub.protos.FibonacciParameters parameters = 3;</code>
   */
  public com.townsendsoftware.sbhub.protos.FibonacciParametersOrBuilder getParametersOrBuilder() {
    return getParameters();
  }

  public static final int MESSAGE_FIELD_NUMBER = 4;
  private com.townsendsoftware.sbhub.protos.ResponseMessage message_;
  /**
   * <code>.com.townsendsoftware.sbhub.protos.ResponseMessage message = 4;</code>
   */
  public boolean hasMessage() {
    return message_ != null;
  }
  /**
   * <code>.com.townsendsoftware.sbhub.protos.ResponseMessage message = 4;</code>
   */
  public com.townsendsoftware.sbhub.protos.ResponseMessage getMessage() {
    return message_ == null ? com.townsendsoftware.sbhub.protos.ResponseMessage.getDefaultInstance() : message_;
  }
  /**
   * <code>.com.townsendsoftware.sbhub.protos.ResponseMessage message = 4;</code>
   */
  public com.townsendsoftware.sbhub.protos.ResponseMessageOrBuilder getMessageOrBuilder() {
    return getMessage();
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
    if (version_ != 0) {
      output.writeInt32(1, version_);
    }
    if (sequence_ != null) {
      output.writeMessage(2, getSequence());
    }
    if (parameters_ != null) {
      output.writeMessage(3, getParameters());
    }
    if (message_ != null) {
      output.writeMessage(4, getMessage());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (version_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, version_);
    }
    if (sequence_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getSequence());
    }
    if (parameters_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getParameters());
    }
    if (message_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getMessage());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.townsendsoftware.sbhub.protos.FibonacciResponse)) {
      return super.equals(obj);
    }
    com.townsendsoftware.sbhub.protos.FibonacciResponse other = (com.townsendsoftware.sbhub.protos.FibonacciResponse) obj;

    boolean result = true;
    result = result && (getVersion()
        == other.getVersion());
    result = result && (hasSequence() == other.hasSequence());
    if (hasSequence()) {
      result = result && getSequence()
          .equals(other.getSequence());
    }
    result = result && (hasParameters() == other.hasParameters());
    if (hasParameters()) {
      result = result && getParameters()
          .equals(other.getParameters());
    }
    result = result && (hasMessage() == other.hasMessage());
    if (hasMessage()) {
      result = result && getMessage()
          .equals(other.getMessage());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getVersion();
    if (hasSequence()) {
      hash = (37 * hash) + SEQUENCE_FIELD_NUMBER;
      hash = (53 * hash) + getSequence().hashCode();
    }
    if (hasParameters()) {
      hash = (37 * hash) + PARAMETERS_FIELD_NUMBER;
      hash = (53 * hash) + getParameters().hashCode();
    }
    if (hasMessage()) {
      hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
      hash = (53 * hash) + getMessage().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.townsendsoftware.sbhub.protos.FibonacciResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.townsendsoftware.sbhub.protos.FibonacciResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.townsendsoftware.sbhub.protos.FibonacciResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.townsendsoftware.sbhub.protos.FibonacciResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.townsendsoftware.sbhub.protos.FibonacciResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.townsendsoftware.sbhub.protos.FibonacciResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.townsendsoftware.sbhub.protos.FibonacciResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.townsendsoftware.sbhub.protos.FibonacciResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.townsendsoftware.sbhub.protos.FibonacciResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.townsendsoftware.sbhub.protos.FibonacciResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.townsendsoftware.sbhub.protos.FibonacciResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.townsendsoftware.sbhub.protos.FibonacciResponse parseFrom(
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
  public static Builder newBuilder(com.townsendsoftware.sbhub.protos.FibonacciResponse prototype) {
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
   * Protobuf type {@code com.townsendsoftware.sbhub.protos.FibonacciResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.townsendsoftware.sbhub.protos.FibonacciResponse)
      com.townsendsoftware.sbhub.protos.FibonacciResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.townsendsoftware.sbhub.protos.SbHubMessages.internal_static_com_townsendsoftware_sbhub_protos_FibonacciResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.townsendsoftware.sbhub.protos.SbHubMessages.internal_static_com_townsendsoftware_sbhub_protos_FibonacciResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.townsendsoftware.sbhub.protos.FibonacciResponse.class, com.townsendsoftware.sbhub.protos.FibonacciResponse.Builder.class);
    }

    // Construct using com.townsendsoftware.sbhub.protos.FibonacciResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      version_ = 0;

      if (sequenceBuilder_ == null) {
        sequence_ = null;
      } else {
        sequence_ = null;
        sequenceBuilder_ = null;
      }
      if (parametersBuilder_ == null) {
        parameters_ = null;
      } else {
        parameters_ = null;
        parametersBuilder_ = null;
      }
      if (messageBuilder_ == null) {
        message_ = null;
      } else {
        message_ = null;
        messageBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.townsendsoftware.sbhub.protos.SbHubMessages.internal_static_com_townsendsoftware_sbhub_protos_FibonacciResponse_descriptor;
    }

    @java.lang.Override
    public com.townsendsoftware.sbhub.protos.FibonacciResponse getDefaultInstanceForType() {
      return com.townsendsoftware.sbhub.protos.FibonacciResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.townsendsoftware.sbhub.protos.FibonacciResponse build() {
      com.townsendsoftware.sbhub.protos.FibonacciResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.townsendsoftware.sbhub.protos.FibonacciResponse buildPartial() {
      com.townsendsoftware.sbhub.protos.FibonacciResponse result = new com.townsendsoftware.sbhub.protos.FibonacciResponse(this);
      result.version_ = version_;
      if (sequenceBuilder_ == null) {
        result.sequence_ = sequence_;
      } else {
        result.sequence_ = sequenceBuilder_.build();
      }
      if (parametersBuilder_ == null) {
        result.parameters_ = parameters_;
      } else {
        result.parameters_ = parametersBuilder_.build();
      }
      if (messageBuilder_ == null) {
        result.message_ = message_;
      } else {
        result.message_ = messageBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.townsendsoftware.sbhub.protos.FibonacciResponse) {
        return mergeFrom((com.townsendsoftware.sbhub.protos.FibonacciResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.townsendsoftware.sbhub.protos.FibonacciResponse other) {
      if (other == com.townsendsoftware.sbhub.protos.FibonacciResponse.getDefaultInstance()) return this;
      if (other.getVersion() != 0) {
        setVersion(other.getVersion());
      }
      if (other.hasSequence()) {
        mergeSequence(other.getSequence());
      }
      if (other.hasParameters()) {
        mergeParameters(other.getParameters());
      }
      if (other.hasMessage()) {
        mergeMessage(other.getMessage());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.townsendsoftware.sbhub.protos.FibonacciResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.townsendsoftware.sbhub.protos.FibonacciResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int version_ ;
    /**
     * <code>int32 version = 1;</code>
     */
    public int getVersion() {
      return version_;
    }
    /**
     * <code>int32 version = 1;</code>
     */
    public Builder setVersion(int value) {
      
      version_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 version = 1;</code>
     */
    public Builder clearVersion() {
      
      version_ = 0;
      onChanged();
      return this;
    }

    private com.townsendsoftware.sbhub.protos.FibonacciSequence sequence_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.townsendsoftware.sbhub.protos.FibonacciSequence, com.townsendsoftware.sbhub.protos.FibonacciSequence.Builder, com.townsendsoftware.sbhub.protos.FibonacciSequenceOrBuilder> sequenceBuilder_;
    /**
     * <code>.com.townsendsoftware.sbhub.protos.FibonacciSequence sequence = 2;</code>
     */
    public boolean hasSequence() {
      return sequenceBuilder_ != null || sequence_ != null;
    }
    /**
     * <code>.com.townsendsoftware.sbhub.protos.FibonacciSequence sequence = 2;</code>
     */
    public com.townsendsoftware.sbhub.protos.FibonacciSequence getSequence() {
      if (sequenceBuilder_ == null) {
        return sequence_ == null ? com.townsendsoftware.sbhub.protos.FibonacciSequence.getDefaultInstance() : sequence_;
      } else {
        return sequenceBuilder_.getMessage();
      }
    }
    /**
     * <code>.com.townsendsoftware.sbhub.protos.FibonacciSequence sequence = 2;</code>
     */
    public Builder setSequence(com.townsendsoftware.sbhub.protos.FibonacciSequence value) {
      if (sequenceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        sequence_ = value;
        onChanged();
      } else {
        sequenceBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.com.townsendsoftware.sbhub.protos.FibonacciSequence sequence = 2;</code>
     */
    public Builder setSequence(
        com.townsendsoftware.sbhub.protos.FibonacciSequence.Builder builderForValue) {
      if (sequenceBuilder_ == null) {
        sequence_ = builderForValue.build();
        onChanged();
      } else {
        sequenceBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.com.townsendsoftware.sbhub.protos.FibonacciSequence sequence = 2;</code>
     */
    public Builder mergeSequence(com.townsendsoftware.sbhub.protos.FibonacciSequence value) {
      if (sequenceBuilder_ == null) {
        if (sequence_ != null) {
          sequence_ =
            com.townsendsoftware.sbhub.protos.FibonacciSequence.newBuilder(sequence_).mergeFrom(value).buildPartial();
        } else {
          sequence_ = value;
        }
        onChanged();
      } else {
        sequenceBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.com.townsendsoftware.sbhub.protos.FibonacciSequence sequence = 2;</code>
     */
    public Builder clearSequence() {
      if (sequenceBuilder_ == null) {
        sequence_ = null;
        onChanged();
      } else {
        sequence_ = null;
        sequenceBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.com.townsendsoftware.sbhub.protos.FibonacciSequence sequence = 2;</code>
     */
    public com.townsendsoftware.sbhub.protos.FibonacciSequence.Builder getSequenceBuilder() {
      
      onChanged();
      return getSequenceFieldBuilder().getBuilder();
    }
    /**
     * <code>.com.townsendsoftware.sbhub.protos.FibonacciSequence sequence = 2;</code>
     */
    public com.townsendsoftware.sbhub.protos.FibonacciSequenceOrBuilder getSequenceOrBuilder() {
      if (sequenceBuilder_ != null) {
        return sequenceBuilder_.getMessageOrBuilder();
      } else {
        return sequence_ == null ?
            com.townsendsoftware.sbhub.protos.FibonacciSequence.getDefaultInstance() : sequence_;
      }
    }
    /**
     * <code>.com.townsendsoftware.sbhub.protos.FibonacciSequence sequence = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.townsendsoftware.sbhub.protos.FibonacciSequence, com.townsendsoftware.sbhub.protos.FibonacciSequence.Builder, com.townsendsoftware.sbhub.protos.FibonacciSequenceOrBuilder> 
        getSequenceFieldBuilder() {
      if (sequenceBuilder_ == null) {
        sequenceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.townsendsoftware.sbhub.protos.FibonacciSequence, com.townsendsoftware.sbhub.protos.FibonacciSequence.Builder, com.townsendsoftware.sbhub.protos.FibonacciSequenceOrBuilder>(
                getSequence(),
                getParentForChildren(),
                isClean());
        sequence_ = null;
      }
      return sequenceBuilder_;
    }

    private com.townsendsoftware.sbhub.protos.FibonacciParameters parameters_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.townsendsoftware.sbhub.protos.FibonacciParameters, com.townsendsoftware.sbhub.protos.FibonacciParameters.Builder, com.townsendsoftware.sbhub.protos.FibonacciParametersOrBuilder> parametersBuilder_;
    /**
     * <code>.com.townsendsoftware.sbhub.protos.FibonacciParameters parameters = 3;</code>
     */
    public boolean hasParameters() {
      return parametersBuilder_ != null || parameters_ != null;
    }
    /**
     * <code>.com.townsendsoftware.sbhub.protos.FibonacciParameters parameters = 3;</code>
     */
    public com.townsendsoftware.sbhub.protos.FibonacciParameters getParameters() {
      if (parametersBuilder_ == null) {
        return parameters_ == null ? com.townsendsoftware.sbhub.protos.FibonacciParameters.getDefaultInstance() : parameters_;
      } else {
        return parametersBuilder_.getMessage();
      }
    }
    /**
     * <code>.com.townsendsoftware.sbhub.protos.FibonacciParameters parameters = 3;</code>
     */
    public Builder setParameters(com.townsendsoftware.sbhub.protos.FibonacciParameters value) {
      if (parametersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        parameters_ = value;
        onChanged();
      } else {
        parametersBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.com.townsendsoftware.sbhub.protos.FibonacciParameters parameters = 3;</code>
     */
    public Builder setParameters(
        com.townsendsoftware.sbhub.protos.FibonacciParameters.Builder builderForValue) {
      if (parametersBuilder_ == null) {
        parameters_ = builderForValue.build();
        onChanged();
      } else {
        parametersBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.com.townsendsoftware.sbhub.protos.FibonacciParameters parameters = 3;</code>
     */
    public Builder mergeParameters(com.townsendsoftware.sbhub.protos.FibonacciParameters value) {
      if (parametersBuilder_ == null) {
        if (parameters_ != null) {
          parameters_ =
            com.townsendsoftware.sbhub.protos.FibonacciParameters.newBuilder(parameters_).mergeFrom(value).buildPartial();
        } else {
          parameters_ = value;
        }
        onChanged();
      } else {
        parametersBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.com.townsendsoftware.sbhub.protos.FibonacciParameters parameters = 3;</code>
     */
    public Builder clearParameters() {
      if (parametersBuilder_ == null) {
        parameters_ = null;
        onChanged();
      } else {
        parameters_ = null;
        parametersBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.com.townsendsoftware.sbhub.protos.FibonacciParameters parameters = 3;</code>
     */
    public com.townsendsoftware.sbhub.protos.FibonacciParameters.Builder getParametersBuilder() {
      
      onChanged();
      return getParametersFieldBuilder().getBuilder();
    }
    /**
     * <code>.com.townsendsoftware.sbhub.protos.FibonacciParameters parameters = 3;</code>
     */
    public com.townsendsoftware.sbhub.protos.FibonacciParametersOrBuilder getParametersOrBuilder() {
      if (parametersBuilder_ != null) {
        return parametersBuilder_.getMessageOrBuilder();
      } else {
        return parameters_ == null ?
            com.townsendsoftware.sbhub.protos.FibonacciParameters.getDefaultInstance() : parameters_;
      }
    }
    /**
     * <code>.com.townsendsoftware.sbhub.protos.FibonacciParameters parameters = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.townsendsoftware.sbhub.protos.FibonacciParameters, com.townsendsoftware.sbhub.protos.FibonacciParameters.Builder, com.townsendsoftware.sbhub.protos.FibonacciParametersOrBuilder> 
        getParametersFieldBuilder() {
      if (parametersBuilder_ == null) {
        parametersBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.townsendsoftware.sbhub.protos.FibonacciParameters, com.townsendsoftware.sbhub.protos.FibonacciParameters.Builder, com.townsendsoftware.sbhub.protos.FibonacciParametersOrBuilder>(
                getParameters(),
                getParentForChildren(),
                isClean());
        parameters_ = null;
      }
      return parametersBuilder_;
    }

    private com.townsendsoftware.sbhub.protos.ResponseMessage message_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.townsendsoftware.sbhub.protos.ResponseMessage, com.townsendsoftware.sbhub.protos.ResponseMessage.Builder, com.townsendsoftware.sbhub.protos.ResponseMessageOrBuilder> messageBuilder_;
    /**
     * <code>.com.townsendsoftware.sbhub.protos.ResponseMessage message = 4;</code>
     */
    public boolean hasMessage() {
      return messageBuilder_ != null || message_ != null;
    }
    /**
     * <code>.com.townsendsoftware.sbhub.protos.ResponseMessage message = 4;</code>
     */
    public com.townsendsoftware.sbhub.protos.ResponseMessage getMessage() {
      if (messageBuilder_ == null) {
        return message_ == null ? com.townsendsoftware.sbhub.protos.ResponseMessage.getDefaultInstance() : message_;
      } else {
        return messageBuilder_.getMessage();
      }
    }
    /**
     * <code>.com.townsendsoftware.sbhub.protos.ResponseMessage message = 4;</code>
     */
    public Builder setMessage(com.townsendsoftware.sbhub.protos.ResponseMessage value) {
      if (messageBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        message_ = value;
        onChanged();
      } else {
        messageBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.com.townsendsoftware.sbhub.protos.ResponseMessage message = 4;</code>
     */
    public Builder setMessage(
        com.townsendsoftware.sbhub.protos.ResponseMessage.Builder builderForValue) {
      if (messageBuilder_ == null) {
        message_ = builderForValue.build();
        onChanged();
      } else {
        messageBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.com.townsendsoftware.sbhub.protos.ResponseMessage message = 4;</code>
     */
    public Builder mergeMessage(com.townsendsoftware.sbhub.protos.ResponseMessage value) {
      if (messageBuilder_ == null) {
        if (message_ != null) {
          message_ =
            com.townsendsoftware.sbhub.protos.ResponseMessage.newBuilder(message_).mergeFrom(value).buildPartial();
        } else {
          message_ = value;
        }
        onChanged();
      } else {
        messageBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.com.townsendsoftware.sbhub.protos.ResponseMessage message = 4;</code>
     */
    public Builder clearMessage() {
      if (messageBuilder_ == null) {
        message_ = null;
        onChanged();
      } else {
        message_ = null;
        messageBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.com.townsendsoftware.sbhub.protos.ResponseMessage message = 4;</code>
     */
    public com.townsendsoftware.sbhub.protos.ResponseMessage.Builder getMessageBuilder() {
      
      onChanged();
      return getMessageFieldBuilder().getBuilder();
    }
    /**
     * <code>.com.townsendsoftware.sbhub.protos.ResponseMessage message = 4;</code>
     */
    public com.townsendsoftware.sbhub.protos.ResponseMessageOrBuilder getMessageOrBuilder() {
      if (messageBuilder_ != null) {
        return messageBuilder_.getMessageOrBuilder();
      } else {
        return message_ == null ?
            com.townsendsoftware.sbhub.protos.ResponseMessage.getDefaultInstance() : message_;
      }
    }
    /**
     * <code>.com.townsendsoftware.sbhub.protos.ResponseMessage message = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.townsendsoftware.sbhub.protos.ResponseMessage, com.townsendsoftware.sbhub.protos.ResponseMessage.Builder, com.townsendsoftware.sbhub.protos.ResponseMessageOrBuilder> 
        getMessageFieldBuilder() {
      if (messageBuilder_ == null) {
        messageBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.townsendsoftware.sbhub.protos.ResponseMessage, com.townsendsoftware.sbhub.protos.ResponseMessage.Builder, com.townsendsoftware.sbhub.protos.ResponseMessageOrBuilder>(
                getMessage(),
                getParentForChildren(),
                isClean());
        message_ = null;
      }
      return messageBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.townsendsoftware.sbhub.protos.FibonacciResponse)
  }

  // @@protoc_insertion_point(class_scope:com.townsendsoftware.sbhub.protos.FibonacciResponse)
  private static final com.townsendsoftware.sbhub.protos.FibonacciResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.townsendsoftware.sbhub.protos.FibonacciResponse();
  }

  public static com.townsendsoftware.sbhub.protos.FibonacciResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FibonacciResponse>
      PARSER = new com.google.protobuf.AbstractParser<FibonacciResponse>() {
    @java.lang.Override
    public FibonacciResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FibonacciResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FibonacciResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FibonacciResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.townsendsoftware.sbhub.protos.FibonacciResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

