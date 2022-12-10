package com.group5.proto.Listing;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: Listing.proto")
public final class ListingServiceGrpc {

  private ListingServiceGrpc() {}

  public static final String SERVICE_NAME = "com.group5.proto.Listing.ListingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.group5.proto.Listing.CreateHouseListingRequest,
      com.group5.proto.Listing.HouseResponse> getCreateListingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createListing",
      requestType = com.group5.proto.Listing.CreateHouseListingRequest.class,
      responseType = com.group5.proto.Listing.HouseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.group5.proto.Listing.CreateHouseListingRequest,
      com.group5.proto.Listing.HouseResponse> getCreateListingMethod() {
    io.grpc.MethodDescriptor<com.group5.proto.Listing.CreateHouseListingRequest, com.group5.proto.Listing.HouseResponse> getCreateListingMethod;
    if ((getCreateListingMethod = ListingServiceGrpc.getCreateListingMethod) == null) {
      synchronized (ListingServiceGrpc.class) {
        if ((getCreateListingMethod = ListingServiceGrpc.getCreateListingMethod) == null) {
          ListingServiceGrpc.getCreateListingMethod = getCreateListingMethod =
              io.grpc.MethodDescriptor.<com.group5.proto.Listing.CreateHouseListingRequest, com.group5.proto.Listing.HouseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createListing"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.group5.proto.Listing.CreateHouseListingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.group5.proto.Listing.HouseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ListingServiceMethodDescriptorSupplier("createListing"))
              .build();
        }
      }
    }
    return getCreateListingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.group5.proto.Listing.IdRequest,
      com.group5.proto.Listing.HouseResponse> getGetListingByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getListingById",
      requestType = com.group5.proto.Listing.IdRequest.class,
      responseType = com.group5.proto.Listing.HouseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.group5.proto.Listing.IdRequest,
      com.group5.proto.Listing.HouseResponse> getGetListingByIdMethod() {
    io.grpc.MethodDescriptor<com.group5.proto.Listing.IdRequest, com.group5.proto.Listing.HouseResponse> getGetListingByIdMethod;
    if ((getGetListingByIdMethod = ListingServiceGrpc.getGetListingByIdMethod) == null) {
      synchronized (ListingServiceGrpc.class) {
        if ((getGetListingByIdMethod = ListingServiceGrpc.getGetListingByIdMethod) == null) {
          ListingServiceGrpc.getGetListingByIdMethod = getGetListingByIdMethod =
              io.grpc.MethodDescriptor.<com.group5.proto.Listing.IdRequest, com.group5.proto.Listing.HouseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getListingById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.group5.proto.Listing.IdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.group5.proto.Listing.HouseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ListingServiceMethodDescriptorSupplier("getListingById"))
              .build();
        }
      }
    }
    return getGetListingByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.group5.proto.Listing.ListingFiltersRequest,
      com.group5.proto.Listing.ShortListingResponse> getGetFilteredListingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getFilteredListings",
      requestType = com.group5.proto.Listing.ListingFiltersRequest.class,
      responseType = com.group5.proto.Listing.ShortListingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.group5.proto.Listing.ListingFiltersRequest,
      com.group5.proto.Listing.ShortListingResponse> getGetFilteredListingsMethod() {
    io.grpc.MethodDescriptor<com.group5.proto.Listing.ListingFiltersRequest, com.group5.proto.Listing.ShortListingResponse> getGetFilteredListingsMethod;
    if ((getGetFilteredListingsMethod = ListingServiceGrpc.getGetFilteredListingsMethod) == null) {
      synchronized (ListingServiceGrpc.class) {
        if ((getGetFilteredListingsMethod = ListingServiceGrpc.getGetFilteredListingsMethod) == null) {
          ListingServiceGrpc.getGetFilteredListingsMethod = getGetFilteredListingsMethod =
              io.grpc.MethodDescriptor.<com.group5.proto.Listing.ListingFiltersRequest, com.group5.proto.Listing.ShortListingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getFilteredListings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.group5.proto.Listing.ListingFiltersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.group5.proto.Listing.ShortListingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ListingServiceMethodDescriptorSupplier("getFilteredListings"))
              .build();
        }
      }
    }
    return getGetFilteredListingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.group5.proto.Listing.HouseResponse,
      com.group5.proto.Listing.IsOk> getUpdateListingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateListing",
      requestType = com.group5.proto.Listing.HouseResponse.class,
      responseType = com.group5.proto.Listing.IsOk.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.group5.proto.Listing.HouseResponse,
      com.group5.proto.Listing.IsOk> getUpdateListingMethod() {
    io.grpc.MethodDescriptor<com.group5.proto.Listing.HouseResponse, com.group5.proto.Listing.IsOk> getUpdateListingMethod;
    if ((getUpdateListingMethod = ListingServiceGrpc.getUpdateListingMethod) == null) {
      synchronized (ListingServiceGrpc.class) {
        if ((getUpdateListingMethod = ListingServiceGrpc.getUpdateListingMethod) == null) {
          ListingServiceGrpc.getUpdateListingMethod = getUpdateListingMethod =
              io.grpc.MethodDescriptor.<com.group5.proto.Listing.HouseResponse, com.group5.proto.Listing.IsOk>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateListing"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.group5.proto.Listing.HouseResponse.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.group5.proto.Listing.IsOk.getDefaultInstance()))
              .setSchemaDescriptor(new ListingServiceMethodDescriptorSupplier("updateListing"))
              .build();
        }
      }
    }
    return getUpdateListingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.group5.proto.Listing.EmailRequest,
      com.group5.proto.Listing.ShortListingResponse> getGetListingsByEmailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getListingsByEmail",
      requestType = com.group5.proto.Listing.EmailRequest.class,
      responseType = com.group5.proto.Listing.ShortListingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.group5.proto.Listing.EmailRequest,
      com.group5.proto.Listing.ShortListingResponse> getGetListingsByEmailMethod() {
    io.grpc.MethodDescriptor<com.group5.proto.Listing.EmailRequest, com.group5.proto.Listing.ShortListingResponse> getGetListingsByEmailMethod;
    if ((getGetListingsByEmailMethod = ListingServiceGrpc.getGetListingsByEmailMethod) == null) {
      synchronized (ListingServiceGrpc.class) {
        if ((getGetListingsByEmailMethod = ListingServiceGrpc.getGetListingsByEmailMethod) == null) {
          ListingServiceGrpc.getGetListingsByEmailMethod = getGetListingsByEmailMethod =
              io.grpc.MethodDescriptor.<com.group5.proto.Listing.EmailRequest, com.group5.proto.Listing.ShortListingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getListingsByEmail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.group5.proto.Listing.EmailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.group5.proto.Listing.ShortListingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ListingServiceMethodDescriptorSupplier("getListingsByEmail"))
              .build();
        }
      }
    }
    return getGetListingsByEmailMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ListingServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ListingServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ListingServiceStub>() {
        @java.lang.Override
        public ListingServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ListingServiceStub(channel, callOptions);
        }
      };
    return ListingServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ListingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ListingServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ListingServiceBlockingStub>() {
        @java.lang.Override
        public ListingServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ListingServiceBlockingStub(channel, callOptions);
        }
      };
    return ListingServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ListingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ListingServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ListingServiceFutureStub>() {
        @java.lang.Override
        public ListingServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ListingServiceFutureStub(channel, callOptions);
        }
      };
    return ListingServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ListingServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createListing(com.group5.proto.Listing.CreateHouseListingRequest request,
        io.grpc.stub.StreamObserver<com.group5.proto.Listing.HouseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateListingMethod(), responseObserver);
    }

    /**
     */
    public void getListingById(com.group5.proto.Listing.IdRequest request,
        io.grpc.stub.StreamObserver<com.group5.proto.Listing.HouseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetListingByIdMethod(), responseObserver);
    }

    /**
     */
    public void getFilteredListings(com.group5.proto.Listing.ListingFiltersRequest request,
        io.grpc.stub.StreamObserver<com.group5.proto.Listing.ShortListingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFilteredListingsMethod(), responseObserver);
    }

    /**
     */
    public void updateListing(com.group5.proto.Listing.HouseResponse request,
        io.grpc.stub.StreamObserver<com.group5.proto.Listing.IsOk> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateListingMethod(), responseObserver);
    }

    /**
     */
    public void getListingsByEmail(com.group5.proto.Listing.EmailRequest request,
        io.grpc.stub.StreamObserver<com.group5.proto.Listing.ShortListingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetListingsByEmailMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateListingMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.group5.proto.Listing.CreateHouseListingRequest,
                com.group5.proto.Listing.HouseResponse>(
                  this, METHODID_CREATE_LISTING)))
          .addMethod(
            getGetListingByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.group5.proto.Listing.IdRequest,
                com.group5.proto.Listing.HouseResponse>(
                  this, METHODID_GET_LISTING_BY_ID)))
          .addMethod(
            getGetFilteredListingsMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.group5.proto.Listing.ListingFiltersRequest,
                com.group5.proto.Listing.ShortListingResponse>(
                  this, METHODID_GET_FILTERED_LISTINGS)))
          .addMethod(
            getUpdateListingMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.group5.proto.Listing.HouseResponse,
                com.group5.proto.Listing.IsOk>(
                  this, METHODID_UPDATE_LISTING)))
          .addMethod(
            getGetListingsByEmailMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.group5.proto.Listing.EmailRequest,
                com.group5.proto.Listing.ShortListingResponse>(
                  this, METHODID_GET_LISTINGS_BY_EMAIL)))
          .build();
    }
  }

  /**
   */
  public static final class ListingServiceStub extends io.grpc.stub.AbstractAsyncStub<ListingServiceStub> {
    private ListingServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ListingServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ListingServiceStub(channel, callOptions);
    }

    /**
     */
    public void createListing(com.group5.proto.Listing.CreateHouseListingRequest request,
        io.grpc.stub.StreamObserver<com.group5.proto.Listing.HouseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateListingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getListingById(com.group5.proto.Listing.IdRequest request,
        io.grpc.stub.StreamObserver<com.group5.proto.Listing.HouseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetListingByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getFilteredListings(com.group5.proto.Listing.ListingFiltersRequest request,
        io.grpc.stub.StreamObserver<com.group5.proto.Listing.ShortListingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetFilteredListingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateListing(com.group5.proto.Listing.HouseResponse request,
        io.grpc.stub.StreamObserver<com.group5.proto.Listing.IsOk> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateListingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getListingsByEmail(com.group5.proto.Listing.EmailRequest request,
        io.grpc.stub.StreamObserver<com.group5.proto.Listing.ShortListingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetListingsByEmailMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ListingServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ListingServiceBlockingStub> {
    private ListingServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ListingServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ListingServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.group5.proto.Listing.HouseResponse createListing(com.group5.proto.Listing.CreateHouseListingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateListingMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.group5.proto.Listing.HouseResponse getListingById(com.group5.proto.Listing.IdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetListingByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.group5.proto.Listing.ShortListingResponse> getFilteredListings(
        com.group5.proto.Listing.ListingFiltersRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetFilteredListingsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.group5.proto.Listing.IsOk updateListing(com.group5.proto.Listing.HouseResponse request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateListingMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.group5.proto.Listing.ShortListingResponse> getListingsByEmail(
        com.group5.proto.Listing.EmailRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetListingsByEmailMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ListingServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ListingServiceFutureStub> {
    private ListingServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ListingServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ListingServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.group5.proto.Listing.HouseResponse> createListing(
        com.group5.proto.Listing.CreateHouseListingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateListingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.group5.proto.Listing.HouseResponse> getListingById(
        com.group5.proto.Listing.IdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetListingByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.group5.proto.Listing.IsOk> updateListing(
        com.group5.proto.Listing.HouseResponse request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateListingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_LISTING = 0;
  private static final int METHODID_GET_LISTING_BY_ID = 1;
  private static final int METHODID_GET_FILTERED_LISTINGS = 2;
  private static final int METHODID_UPDATE_LISTING = 3;
  private static final int METHODID_GET_LISTINGS_BY_EMAIL = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ListingServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ListingServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_LISTING:
          serviceImpl.createListing((com.group5.proto.Listing.CreateHouseListingRequest) request,
              (io.grpc.stub.StreamObserver<com.group5.proto.Listing.HouseResponse>) responseObserver);
          break;
        case METHODID_GET_LISTING_BY_ID:
          serviceImpl.getListingById((com.group5.proto.Listing.IdRequest) request,
              (io.grpc.stub.StreamObserver<com.group5.proto.Listing.HouseResponse>) responseObserver);
          break;
        case METHODID_GET_FILTERED_LISTINGS:
          serviceImpl.getFilteredListings((com.group5.proto.Listing.ListingFiltersRequest) request,
              (io.grpc.stub.StreamObserver<com.group5.proto.Listing.ShortListingResponse>) responseObserver);
          break;
        case METHODID_UPDATE_LISTING:
          serviceImpl.updateListing((com.group5.proto.Listing.HouseResponse) request,
              (io.grpc.stub.StreamObserver<com.group5.proto.Listing.IsOk>) responseObserver);
          break;
        case METHODID_GET_LISTINGS_BY_EMAIL:
          serviceImpl.getListingsByEmail((com.group5.proto.Listing.EmailRequest) request,
              (io.grpc.stub.StreamObserver<com.group5.proto.Listing.ShortListingResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ListingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ListingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.group5.proto.Listing.Listing.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ListingService");
    }
  }

  private static final class ListingServiceFileDescriptorSupplier
      extends ListingServiceBaseDescriptorSupplier {
    ListingServiceFileDescriptorSupplier() {}
  }

  private static final class ListingServiceMethodDescriptorSupplier
      extends ListingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ListingServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ListingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ListingServiceFileDescriptorSupplier())
              .addMethod(getCreateListingMethod())
              .addMethod(getGetListingByIdMethod())
              .addMethod(getGetFilteredListingsMethod())
              .addMethod(getUpdateListingMethod())
              .addMethod(getGetListingsByEmailMethod())
              .build();
        }
      }
    }
    return result;
  }
}
