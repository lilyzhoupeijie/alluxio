// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/file_system_master.proto

package alluxio.grpc;

/**
 * Protobuf type {@code alluxio.grpc.file.PersistCommandOptions}
 */
public  final class PersistCommandOptions extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:alluxio.grpc.file.PersistCommandOptions)
    PersistCommandOptionsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PersistCommandOptions.newBuilder() to construct.
  private PersistCommandOptions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PersistCommandOptions() {
    persistFiles_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PersistCommandOptions();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PersistCommandOptions(
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              persistFiles_ = new java.util.ArrayList<alluxio.grpc.PersistFile>();
              mutable_bitField0_ |= 0x00000001;
            }
            persistFiles_.add(
                input.readMessage(alluxio.grpc.PersistFile.PARSER, extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownField(
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        persistFiles_ = java.util.Collections.unmodifiableList(persistFiles_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return alluxio.grpc.FileSystemMasterProto.internal_static_alluxio_grpc_file_PersistCommandOptions_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return alluxio.grpc.FileSystemMasterProto.internal_static_alluxio_grpc_file_PersistCommandOptions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            alluxio.grpc.PersistCommandOptions.class, alluxio.grpc.PersistCommandOptions.Builder.class);
  }

  public static final int PERSISTFILES_FIELD_NUMBER = 1;
  private java.util.List<alluxio.grpc.PersistFile> persistFiles_;
  /**
   * <code>repeated .alluxio.grpc.file.PersistFile persistFiles = 1;</code>
   */
  public java.util.List<alluxio.grpc.PersistFile> getPersistFilesList() {
    return persistFiles_;
  }
  /**
   * <code>repeated .alluxio.grpc.file.PersistFile persistFiles = 1;</code>
   */
  public java.util.List<? extends alluxio.grpc.PersistFileOrBuilder> 
      getPersistFilesOrBuilderList() {
    return persistFiles_;
  }
  /**
   * <code>repeated .alluxio.grpc.file.PersistFile persistFiles = 1;</code>
   */
  public int getPersistFilesCount() {
    return persistFiles_.size();
  }
  /**
   * <code>repeated .alluxio.grpc.file.PersistFile persistFiles = 1;</code>
   */
  public alluxio.grpc.PersistFile getPersistFiles(int index) {
    return persistFiles_.get(index);
  }
  /**
   * <code>repeated .alluxio.grpc.file.PersistFile persistFiles = 1;</code>
   */
  public alluxio.grpc.PersistFileOrBuilder getPersistFilesOrBuilder(
      int index) {
    return persistFiles_.get(index);
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
    for (int i = 0; i < persistFiles_.size(); i++) {
      output.writeMessage(1, persistFiles_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < persistFiles_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, persistFiles_.get(i));
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
    if (!(obj instanceof alluxio.grpc.PersistCommandOptions)) {
      return super.equals(obj);
    }
    alluxio.grpc.PersistCommandOptions other = (alluxio.grpc.PersistCommandOptions) obj;

    if (!getPersistFilesList()
        .equals(other.getPersistFilesList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getPersistFilesCount() > 0) {
      hash = (37 * hash) + PERSISTFILES_FIELD_NUMBER;
      hash = (53 * hash) + getPersistFilesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static alluxio.grpc.PersistCommandOptions parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.PersistCommandOptions parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.PersistCommandOptions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.PersistCommandOptions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.PersistCommandOptions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.PersistCommandOptions parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.PersistCommandOptions parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static alluxio.grpc.PersistCommandOptions parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static alluxio.grpc.PersistCommandOptions parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static alluxio.grpc.PersistCommandOptions parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static alluxio.grpc.PersistCommandOptions parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static alluxio.grpc.PersistCommandOptions parseFrom(
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
  public static Builder newBuilder(alluxio.grpc.PersistCommandOptions prototype) {
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
   * Protobuf type {@code alluxio.grpc.file.PersistCommandOptions}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:alluxio.grpc.file.PersistCommandOptions)
      alluxio.grpc.PersistCommandOptionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return alluxio.grpc.FileSystemMasterProto.internal_static_alluxio_grpc_file_PersistCommandOptions_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return alluxio.grpc.FileSystemMasterProto.internal_static_alluxio_grpc_file_PersistCommandOptions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              alluxio.grpc.PersistCommandOptions.class, alluxio.grpc.PersistCommandOptions.Builder.class);
    }

    // Construct using alluxio.grpc.PersistCommandOptions.newBuilder()
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
        getPersistFilesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (persistFilesBuilder_ == null) {
        persistFiles_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        persistFilesBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return alluxio.grpc.FileSystemMasterProto.internal_static_alluxio_grpc_file_PersistCommandOptions_descriptor;
    }

    @java.lang.Override
    public alluxio.grpc.PersistCommandOptions getDefaultInstanceForType() {
      return alluxio.grpc.PersistCommandOptions.getDefaultInstance();
    }

    @java.lang.Override
    public alluxio.grpc.PersistCommandOptions build() {
      alluxio.grpc.PersistCommandOptions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public alluxio.grpc.PersistCommandOptions buildPartial() {
      alluxio.grpc.PersistCommandOptions result = new alluxio.grpc.PersistCommandOptions(this);
      int from_bitField0_ = bitField0_;
      if (persistFilesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          persistFiles_ = java.util.Collections.unmodifiableList(persistFiles_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.persistFiles_ = persistFiles_;
      } else {
        result.persistFiles_ = persistFilesBuilder_.build();
      }
      onBuilt();
      return result;
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
      if (other instanceof alluxio.grpc.PersistCommandOptions) {
        return mergeFrom((alluxio.grpc.PersistCommandOptions)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(alluxio.grpc.PersistCommandOptions other) {
      if (other == alluxio.grpc.PersistCommandOptions.getDefaultInstance()) return this;
      if (persistFilesBuilder_ == null) {
        if (!other.persistFiles_.isEmpty()) {
          if (persistFiles_.isEmpty()) {
            persistFiles_ = other.persistFiles_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePersistFilesIsMutable();
            persistFiles_.addAll(other.persistFiles_);
          }
          onChanged();
        }
      } else {
        if (!other.persistFiles_.isEmpty()) {
          if (persistFilesBuilder_.isEmpty()) {
            persistFilesBuilder_.dispose();
            persistFilesBuilder_ = null;
            persistFiles_ = other.persistFiles_;
            bitField0_ = (bitField0_ & ~0x00000001);
            persistFilesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPersistFilesFieldBuilder() : null;
          } else {
            persistFilesBuilder_.addAllMessages(other.persistFiles_);
          }
        }
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
      alluxio.grpc.PersistCommandOptions parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (alluxio.grpc.PersistCommandOptions) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<alluxio.grpc.PersistFile> persistFiles_ =
      java.util.Collections.emptyList();
    private void ensurePersistFilesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        persistFiles_ = new java.util.ArrayList<alluxio.grpc.PersistFile>(persistFiles_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        alluxio.grpc.PersistFile, alluxio.grpc.PersistFile.Builder, alluxio.grpc.PersistFileOrBuilder> persistFilesBuilder_;

    /**
     * <code>repeated .alluxio.grpc.file.PersistFile persistFiles = 1;</code>
     */
    public java.util.List<alluxio.grpc.PersistFile> getPersistFilesList() {
      if (persistFilesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(persistFiles_);
      } else {
        return persistFilesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .alluxio.grpc.file.PersistFile persistFiles = 1;</code>
     */
    public int getPersistFilesCount() {
      if (persistFilesBuilder_ == null) {
        return persistFiles_.size();
      } else {
        return persistFilesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .alluxio.grpc.file.PersistFile persistFiles = 1;</code>
     */
    public alluxio.grpc.PersistFile getPersistFiles(int index) {
      if (persistFilesBuilder_ == null) {
        return persistFiles_.get(index);
      } else {
        return persistFilesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .alluxio.grpc.file.PersistFile persistFiles = 1;</code>
     */
    public Builder setPersistFiles(
        int index, alluxio.grpc.PersistFile value) {
      if (persistFilesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePersistFilesIsMutable();
        persistFiles_.set(index, value);
        onChanged();
      } else {
        persistFilesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .alluxio.grpc.file.PersistFile persistFiles = 1;</code>
     */
    public Builder setPersistFiles(
        int index, alluxio.grpc.PersistFile.Builder builderForValue) {
      if (persistFilesBuilder_ == null) {
        ensurePersistFilesIsMutable();
        persistFiles_.set(index, builderForValue.build());
        onChanged();
      } else {
        persistFilesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .alluxio.grpc.file.PersistFile persistFiles = 1;</code>
     */
    public Builder addPersistFiles(alluxio.grpc.PersistFile value) {
      if (persistFilesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePersistFilesIsMutable();
        persistFiles_.add(value);
        onChanged();
      } else {
        persistFilesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .alluxio.grpc.file.PersistFile persistFiles = 1;</code>
     */
    public Builder addPersistFiles(
        int index, alluxio.grpc.PersistFile value) {
      if (persistFilesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePersistFilesIsMutable();
        persistFiles_.add(index, value);
        onChanged();
      } else {
        persistFilesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .alluxio.grpc.file.PersistFile persistFiles = 1;</code>
     */
    public Builder addPersistFiles(
        alluxio.grpc.PersistFile.Builder builderForValue) {
      if (persistFilesBuilder_ == null) {
        ensurePersistFilesIsMutable();
        persistFiles_.add(builderForValue.build());
        onChanged();
      } else {
        persistFilesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .alluxio.grpc.file.PersistFile persistFiles = 1;</code>
     */
    public Builder addPersistFiles(
        int index, alluxio.grpc.PersistFile.Builder builderForValue) {
      if (persistFilesBuilder_ == null) {
        ensurePersistFilesIsMutable();
        persistFiles_.add(index, builderForValue.build());
        onChanged();
      } else {
        persistFilesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .alluxio.grpc.file.PersistFile persistFiles = 1;</code>
     */
    public Builder addAllPersistFiles(
        java.lang.Iterable<? extends alluxio.grpc.PersistFile> values) {
      if (persistFilesBuilder_ == null) {
        ensurePersistFilesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, persistFiles_);
        onChanged();
      } else {
        persistFilesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .alluxio.grpc.file.PersistFile persistFiles = 1;</code>
     */
    public Builder clearPersistFiles() {
      if (persistFilesBuilder_ == null) {
        persistFiles_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        persistFilesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .alluxio.grpc.file.PersistFile persistFiles = 1;</code>
     */
    public Builder removePersistFiles(int index) {
      if (persistFilesBuilder_ == null) {
        ensurePersistFilesIsMutable();
        persistFiles_.remove(index);
        onChanged();
      } else {
        persistFilesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .alluxio.grpc.file.PersistFile persistFiles = 1;</code>
     */
    public alluxio.grpc.PersistFile.Builder getPersistFilesBuilder(
        int index) {
      return getPersistFilesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .alluxio.grpc.file.PersistFile persistFiles = 1;</code>
     */
    public alluxio.grpc.PersistFileOrBuilder getPersistFilesOrBuilder(
        int index) {
      if (persistFilesBuilder_ == null) {
        return persistFiles_.get(index);  } else {
        return persistFilesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .alluxio.grpc.file.PersistFile persistFiles = 1;</code>
     */
    public java.util.List<? extends alluxio.grpc.PersistFileOrBuilder> 
         getPersistFilesOrBuilderList() {
      if (persistFilesBuilder_ != null) {
        return persistFilesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(persistFiles_);
      }
    }
    /**
     * <code>repeated .alluxio.grpc.file.PersistFile persistFiles = 1;</code>
     */
    public alluxio.grpc.PersistFile.Builder addPersistFilesBuilder() {
      return getPersistFilesFieldBuilder().addBuilder(
          alluxio.grpc.PersistFile.getDefaultInstance());
    }
    /**
     * <code>repeated .alluxio.grpc.file.PersistFile persistFiles = 1;</code>
     */
    public alluxio.grpc.PersistFile.Builder addPersistFilesBuilder(
        int index) {
      return getPersistFilesFieldBuilder().addBuilder(
          index, alluxio.grpc.PersistFile.getDefaultInstance());
    }
    /**
     * <code>repeated .alluxio.grpc.file.PersistFile persistFiles = 1;</code>
     */
    public java.util.List<alluxio.grpc.PersistFile.Builder> 
         getPersistFilesBuilderList() {
      return getPersistFilesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        alluxio.grpc.PersistFile, alluxio.grpc.PersistFile.Builder, alluxio.grpc.PersistFileOrBuilder> 
        getPersistFilesFieldBuilder() {
      if (persistFilesBuilder_ == null) {
        persistFilesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            alluxio.grpc.PersistFile, alluxio.grpc.PersistFile.Builder, alluxio.grpc.PersistFileOrBuilder>(
                persistFiles_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        persistFiles_ = null;
      }
      return persistFilesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:alluxio.grpc.file.PersistCommandOptions)
  }

  // @@protoc_insertion_point(class_scope:alluxio.grpc.file.PersistCommandOptions)
  private static final alluxio.grpc.PersistCommandOptions DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new alluxio.grpc.PersistCommandOptions();
  }

  public static alluxio.grpc.PersistCommandOptions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<PersistCommandOptions>
      PARSER = new com.google.protobuf.AbstractParser<PersistCommandOptions>() {
    @java.lang.Override
    public PersistCommandOptions parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PersistCommandOptions(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PersistCommandOptions> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PersistCommandOptions> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public alluxio.grpc.PersistCommandOptions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
