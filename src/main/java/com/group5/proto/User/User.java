// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: User.proto

package com.group5.proto.User;

public final class User {
  private User() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_group5_proto_User_GetUserByIdRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_group5_proto_User_GetUserByIdRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_group5_proto_User_GetUserByIdResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_group5_proto_User_GetUserByIdResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nUser.proto\022\025com.group5.proto.User\"$\n\022G" +
      "etUserByIdRequest\022\016\n\006userId\030\001 \001(\003\"O\n\023Get" +
      "UserByIdResponse\022\n\n\002id\030\001 \001(\003\022\014\n\004name\030\002 \001" +
      "(\t\022\017\n\007surname\030\003 \001(\t\022\r\n\005email\030\004 \001(\t2s\n\013Us" +
      "erService\022d\n\013getUserById\022).com.group5.pr" +
      "oto.User.GetUserByIdRequest\032*.com.group5" +
      ".proto.User.GetUserByIdResponseB\002P\001b\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_group5_proto_User_GetUserByIdRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_group5_proto_User_GetUserByIdRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_group5_proto_User_GetUserByIdRequest_descriptor,
        new java.lang.String[] { "UserId", });
    internal_static_com_group5_proto_User_GetUserByIdResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_group5_proto_User_GetUserByIdResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_group5_proto_User_GetUserByIdResponse_descriptor,
        new java.lang.String[] { "Id", "Name", "Surname", "Email", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
