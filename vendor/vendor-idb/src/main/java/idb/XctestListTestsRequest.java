// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: idb.proto

package idb;

/**
 * Protobuf type {@code idb.XctestListTestsRequest}
 */
public  final class XctestListTestsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:idb.XctestListTestsRequest)
    XctestListTestsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use XctestListTestsRequest.newBuilder() to construct.
  private XctestListTestsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private XctestListTestsRequest() {
    bundleName_ = "";
    appPath_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new XctestListTestsRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private XctestListTestsRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
            java.lang.String s = input.readStringRequireUtf8();

            bundleName_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            appPath_ = s;
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return idb.Idb.internal_static_idb_XctestListTestsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return idb.Idb.internal_static_idb_XctestListTestsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            idb.XctestListTestsRequest.class, idb.XctestListTestsRequest.Builder.class);
  }

  public static final int BUNDLE_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object bundleName_;
  /**
   * <code>string bundle_name = 1;</code>
   * @return The bundleName.
   */
  public java.lang.String getBundleName() {
    java.lang.Object ref = bundleName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      bundleName_ = s;
      return s;
    }
  }
  /**
   * <code>string bundle_name = 1;</code>
   * @return The bytes for bundleName.
   */
  public com.google.protobuf.ByteString
      getBundleNameBytes() {
    java.lang.Object ref = bundleName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      bundleName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int APP_PATH_FIELD_NUMBER = 2;
  private volatile java.lang.Object appPath_;
  /**
   * <code>string app_path = 2;</code>
   * @return The appPath.
   */
  public java.lang.String getAppPath() {
    java.lang.Object ref = appPath_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      appPath_ = s;
      return s;
    }
  }
  /**
   * <code>string app_path = 2;</code>
   * @return The bytes for appPath.
   */
  public com.google.protobuf.ByteString
      getAppPathBytes() {
    java.lang.Object ref = appPath_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      appPath_ = b;
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
    if (!getBundleNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, bundleName_);
    }
    if (!getAppPathBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, appPath_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getBundleNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, bundleName_);
    }
    if (!getAppPathBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, appPath_);
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
    if (!(obj instanceof idb.XctestListTestsRequest)) {
      return super.equals(obj);
    }
    idb.XctestListTestsRequest other = (idb.XctestListTestsRequest) obj;

    if (!getBundleName()
        .equals(other.getBundleName())) return false;
    if (!getAppPath()
        .equals(other.getAppPath())) return false;
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
    hash = (37 * hash) + BUNDLE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getBundleName().hashCode();
    hash = (37 * hash) + APP_PATH_FIELD_NUMBER;
    hash = (53 * hash) + getAppPath().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static idb.XctestListTestsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static idb.XctestListTestsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static idb.XctestListTestsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static idb.XctestListTestsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static idb.XctestListTestsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static idb.XctestListTestsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static idb.XctestListTestsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static idb.XctestListTestsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static idb.XctestListTestsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static idb.XctestListTestsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static idb.XctestListTestsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static idb.XctestListTestsRequest parseFrom(
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
  public static Builder newBuilder(idb.XctestListTestsRequest prototype) {
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
   * Protobuf type {@code idb.XctestListTestsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:idb.XctestListTestsRequest)
      idb.XctestListTestsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return idb.Idb.internal_static_idb_XctestListTestsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return idb.Idb.internal_static_idb_XctestListTestsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              idb.XctestListTestsRequest.class, idb.XctestListTestsRequest.Builder.class);
    }

    // Construct using idb.XctestListTestsRequest.newBuilder()
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
      bundleName_ = "";

      appPath_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return idb.Idb.internal_static_idb_XctestListTestsRequest_descriptor;
    }

    @java.lang.Override
    public idb.XctestListTestsRequest getDefaultInstanceForType() {
      return idb.XctestListTestsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public idb.XctestListTestsRequest build() {
      idb.XctestListTestsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public idb.XctestListTestsRequest buildPartial() {
      idb.XctestListTestsRequest result = new idb.XctestListTestsRequest(this);
      result.bundleName_ = bundleName_;
      result.appPath_ = appPath_;
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
      if (other instanceof idb.XctestListTestsRequest) {
        return mergeFrom((idb.XctestListTestsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(idb.XctestListTestsRequest other) {
      if (other == idb.XctestListTestsRequest.getDefaultInstance()) return this;
      if (!other.getBundleName().isEmpty()) {
        bundleName_ = other.bundleName_;
        onChanged();
      }
      if (!other.getAppPath().isEmpty()) {
        appPath_ = other.appPath_;
        onChanged();
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
      idb.XctestListTestsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (idb.XctestListTestsRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object bundleName_ = "";
    /**
     * <code>string bundle_name = 1;</code>
     * @return The bundleName.
     */
    public java.lang.String getBundleName() {
      java.lang.Object ref = bundleName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        bundleName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string bundle_name = 1;</code>
     * @return The bytes for bundleName.
     */
    public com.google.protobuf.ByteString
        getBundleNameBytes() {
      java.lang.Object ref = bundleName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        bundleName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string bundle_name = 1;</code>
     * @param value The bundleName to set.
     * @return This builder for chaining.
     */
    public Builder setBundleName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      bundleName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string bundle_name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearBundleName() {
      
      bundleName_ = getDefaultInstance().getBundleName();
      onChanged();
      return this;
    }
    /**
     * <code>string bundle_name = 1;</code>
     * @param value The bytes for bundleName to set.
     * @return This builder for chaining.
     */
    public Builder setBundleNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      bundleName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object appPath_ = "";
    /**
     * <code>string app_path = 2;</code>
     * @return The appPath.
     */
    public java.lang.String getAppPath() {
      java.lang.Object ref = appPath_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        appPath_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string app_path = 2;</code>
     * @return The bytes for appPath.
     */
    public com.google.protobuf.ByteString
        getAppPathBytes() {
      java.lang.Object ref = appPath_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        appPath_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string app_path = 2;</code>
     * @param value The appPath to set.
     * @return This builder for chaining.
     */
    public Builder setAppPath(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      appPath_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string app_path = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAppPath() {
      
      appPath_ = getDefaultInstance().getAppPath();
      onChanged();
      return this;
    }
    /**
     * <code>string app_path = 2;</code>
     * @param value The bytes for appPath to set.
     * @return This builder for chaining.
     */
    public Builder setAppPathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      appPath_ = value;
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


    // @@protoc_insertion_point(builder_scope:idb.XctestListTestsRequest)
  }

  // @@protoc_insertion_point(class_scope:idb.XctestListTestsRequest)
  private static final idb.XctestListTestsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new idb.XctestListTestsRequest();
  }

  public static idb.XctestListTestsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<XctestListTestsRequest>
      PARSER = new com.google.protobuf.AbstractParser<XctestListTestsRequest>() {
    @java.lang.Override
    public XctestListTestsRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new XctestListTestsRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<XctestListTestsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<XctestListTestsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public idb.XctestListTestsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
