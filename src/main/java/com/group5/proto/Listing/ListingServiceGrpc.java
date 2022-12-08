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
  private static volatile io.grpc.MethodDescriptor<CreateHouseListingRequest,
      HouseResponse> getCreateListingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createListing",
      requestType = CreateHouseListingRequest.class,
      responseType = HouseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<CreateHouseListingRequest,
      HouseResponse> getCreateListingMethod() {
    io.grpc.MethodDescriptor<CreateHouseListingRequest, HouseResponse> getCreateListingMethod;
    if ((getCreateListingMethod = ListingServiceGrpc.getCreateListingMethod) == null) {
      synchronized (ListingServiceGrpc.class) {
        if ((getCreateListingMethod = ListingServiceGrpc.getCreateListingMethod) == null) {
          ListingServiceGrpc.getCreateListingMethod = getCreateListingMethod =
              io.grpc.MethodDescriptor.<CreateHouseListingRequest, HouseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createListing"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CreateHouseListingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  HouseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ListingServiceMethodDescriptorSupplier("createListing"))
              .build();
        }
      }
    }
    return getCreateListingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<IdRequest,
      HouseResponse> getGetListingByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getListingById",
      requestType = IdRequest.class,
      responseType = HouseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<IdRequest,
      HouseResponse> getGetListingByIdMethod() {
    io.grpc.MethodDescriptor<IdRequest, HouseResponse> getGetListingByIdMethod;
    if ((getGetListingByIdMethod = ListingServiceGrpc.getGetListingByIdMethod) == null) {
      synchronized (ListingServiceGrpc.class) {
        if ((getGetListingByIdMethod = ListingServiceGrpc.getGetListingByIdMethod) == null) {
          ListingServiceGrpc.getGetListingByIdMethod = getGetListingByIdMethod =
              io.grpc.MethodDescriptor.<IdRequest, HouseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getListingById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  IdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  HouseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ListingServiceMethodDescriptorSupplier("getListingById"))
              .build();
        }
      }
    }
    return getGetListingByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ListingFiltersRequest,
      ShortListingResponse> getGetFilteredListingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getFilteredListings",
      requestType = ListingFiltersRequest.class,
      responseType = ShortListingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<ListingFiltersRequest,
      ShortListingResponse> getGetFilteredListingsMethod() {
    io.grpc.MethodDescriptor<ListingFiltersRequest, ShortListingResponse> getGetFilteredListingsMethod;
    if ((getGetFilteredListingsMethod = ListingServiceGrpc.getGetFilteredListingsMethod) == null) {
      synchronized (ListingServiceGrpc.class) {
        if ((getGetFilteredListingsMethod = ListingServiceGrpc.getGetFilteredListingsMethod) == null) {
          ListingServiceGrpc.getGetFilteredListingsMethod = getGetFilteredListingsMethod =
              io.grpc.MethodDescriptor.<ListingFiltersRequest, ShortListingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getFilteredListings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ListingFiltersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ShortListingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ListingServiceMethodDescriptorSupplier("getFilteredListings"))
              .build();
        }
      }
    }
    return getGetFilteredListingsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ListingServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ListingServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ListingServiceStub>() {
        @Override
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
        @Override
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
        @Override
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
    public void createListing(CreateHouseListingRequest request,
                              io.grpc.stub.StreamObserver<HouseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateListingMethod(), responseObserver);
    }

    /**
     */
    public void getListingById(IdRequest request,
                               io.grpc.stub.StreamObserver<HouseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetListingByIdMethod(), responseObserver);
    }

    /**
     */
    public void getFilteredListings(ListingFiltersRequest request,
                                    io.grpc.stub.StreamObserver<ShortListingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFilteredListingsMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateListingMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                CreateHouseListingRequest,
                HouseResponse>(
                  this, METHODID_CREATE_LISTING)))
          .addMethod(
            getGetListingByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                IdRequest,
                HouseResponse>(
                  this, METHODID_GET_LISTING_BY_ID)))
          .addMethod(
            getGetFilteredListingsMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                ListingFiltersRequest,
                ShortListingResponse>(
                  this, METHODID_GET_FILTERED_LISTINGS)))
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

    @Override
    protected ListingServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ListingServiceStub(channel, callOptions);
    }

    /**
     */
    public void createListing(CreateHouseListingRequest request,
                              io.grpc.stub.StreamObserver<HouseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateListingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getListingById(IdRequest request,
                               io.grpc.stub.StreamObserver<HouseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetListingByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getFilteredListings(ListingFiltersRequest request,
                                    io.grpc.stub.StreamObserver<ShortListingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetFilteredListingsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ListingServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ListingServiceBlockingStub> {
    private ListingServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected ListingServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ListingServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public HouseResponse createListing(CreateHouseListingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateListingMethod(), getCallOptions(), request);
    }

    /**
     */
    public HouseResponse getListingById(IdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetListingByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<ShortListingResponse> getFilteredListings(
        ListingFiltersRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetFilteredListingsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ListingServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ListingServiceFutureStub> {
    private ListingServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected ListingServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ListingServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<HouseResponse> createListing(
        CreateHouseListingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateListingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<HouseResponse> getListingById(
        IdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetListingByIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_LISTING = 0;
  private static final int METHODID_GET_LISTING_BY_ID = 1;
  private static final int METHODID_GET_FILTERED_LISTINGS = 2;

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

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_LISTING:
          serviceImpl.createListing((CreateHouseListingRequest) request,
              (io.grpc.stub.StreamObserver<HouseResponse>) responseObserver);
          break;
        case METHODID_GET_LISTING_BY_ID:
          serviceImpl.getListingById((IdRequest) request,
              (io.grpc.stub.StreamObserver<HouseResponse>) responseObserver);
          break;
        case METHODID_GET_FILTERED_LISTINGS:
          serviceImpl.getFilteredListings((ListingFiltersRequest) request,
              (io.grpc.stub.StreamObserver<ShortListingResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
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

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return Listing.getDescriptor();
    }

    @Override
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

    @Override
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
              .build();
        }
      }
    }
    return result;
  }
}
