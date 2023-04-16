package smartair.dataAnalisysService;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * Interface exported by the server.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: DataAnalisysService.proto")
public final class dataAnalisysServiceGrpc {

  private dataAnalisysServiceGrpc() {}

  public static final String SERVICE_NAME = "smartair.dataAnalisysService.dataAnalisysService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<smartair.dataAnalisysService.getDataRequest,
      smartair.dataAnalisysService.getDataResponse> getGetDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getData",
      requestType = smartair.dataAnalisysService.getDataRequest.class,
      responseType = smartair.dataAnalisysService.getDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<smartair.dataAnalisysService.getDataRequest,
      smartair.dataAnalisysService.getDataResponse> getGetDataMethod() {
    io.grpc.MethodDescriptor<smartair.dataAnalisysService.getDataRequest, smartair.dataAnalisysService.getDataResponse> getGetDataMethod;
    if ((getGetDataMethod = dataAnalisysServiceGrpc.getGetDataMethod) == null) {
      synchronized (dataAnalisysServiceGrpc.class) {
        if ((getGetDataMethod = dataAnalisysServiceGrpc.getGetDataMethod) == null) {
          dataAnalisysServiceGrpc.getGetDataMethod = getGetDataMethod = 
              io.grpc.MethodDescriptor.<smartair.dataAnalisysService.getDataRequest, smartair.dataAnalisysService.getDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smartair.dataAnalisysService.dataAnalisysService", "getData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartair.dataAnalisysService.getDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartair.dataAnalisysService.getDataResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new dataAnalisysServiceMethodDescriptorSupplier("getData"))
                  .build();
          }
        }
     }
     return getGetDataMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static dataAnalisysServiceStub newStub(io.grpc.Channel channel) {
    return new dataAnalisysServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static dataAnalisysServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new dataAnalisysServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static dataAnalisysServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new dataAnalisysServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static abstract class dataAnalisysServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getData(smartair.dataAnalisysService.getDataRequest request,
        io.grpc.stub.StreamObserver<smartair.dataAnalisysService.getDataResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetDataMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetDataMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                smartair.dataAnalisysService.getDataRequest,
                smartair.dataAnalisysService.getDataResponse>(
                  this, METHODID_GET_DATA)))
          .build();
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class dataAnalisysServiceStub extends io.grpc.stub.AbstractStub<dataAnalisysServiceStub> {
    private dataAnalisysServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private dataAnalisysServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected dataAnalisysServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new dataAnalisysServiceStub(channel, callOptions);
    }

    /**
     */
    public void getData(smartair.dataAnalisysService.getDataRequest request,
        io.grpc.stub.StreamObserver<smartair.dataAnalisysService.getDataResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetDataMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class dataAnalisysServiceBlockingStub extends io.grpc.stub.AbstractStub<dataAnalisysServiceBlockingStub> {
    private dataAnalisysServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private dataAnalisysServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected dataAnalisysServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new dataAnalisysServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public smartair.dataAnalisysService.getDataResponse getData(smartair.dataAnalisysService.getDataRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetDataMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class dataAnalisysServiceFutureStub extends io.grpc.stub.AbstractStub<dataAnalisysServiceFutureStub> {
    private dataAnalisysServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private dataAnalisysServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected dataAnalisysServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new dataAnalisysServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<smartair.dataAnalisysService.getDataResponse> getData(
        smartair.dataAnalisysService.getDataRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetDataMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_DATA = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final dataAnalisysServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(dataAnalisysServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_DATA:
          serviceImpl.getData((smartair.dataAnalisysService.getDataRequest) request,
              (io.grpc.stub.StreamObserver<smartair.dataAnalisysService.getDataResponse>) responseObserver);
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

  private static abstract class dataAnalisysServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    dataAnalisysServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return smartair.dataAnalisysService.dataAnalisysServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("dataAnalisysService");
    }
  }

  private static final class dataAnalisysServiceFileDescriptorSupplier
      extends dataAnalisysServiceBaseDescriptorSupplier {
    dataAnalisysServiceFileDescriptorSupplier() {}
  }

  private static final class dataAnalisysServiceMethodDescriptorSupplier
      extends dataAnalisysServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    dataAnalisysServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (dataAnalisysServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new dataAnalisysServiceFileDescriptorSupplier())
              .addMethod(getGetDataMethod())
              .build();
        }
      }
    }
    return result;
  }
}
