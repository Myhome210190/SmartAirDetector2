package smartair.sensorService;

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
    comments = "Source: SensorService.proto")
public final class sensorServiceGrpc {

  private sensorServiceGrpc() {}

  public static final String SERVICE_NAME = "smartair.sensorService.sensorService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<smartair.sensorService.inputDataRequest,
      smartair.sensorService.inputDataResponse> getInputDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "inputData",
      requestType = smartair.sensorService.inputDataRequest.class,
      responseType = smartair.sensorService.inputDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<smartair.sensorService.inputDataRequest,
      smartair.sensorService.inputDataResponse> getInputDataMethod() {
    io.grpc.MethodDescriptor<smartair.sensorService.inputDataRequest, smartair.sensorService.inputDataResponse> getInputDataMethod;
    if ((getInputDataMethod = sensorServiceGrpc.getInputDataMethod) == null) {
      synchronized (sensorServiceGrpc.class) {
        if ((getInputDataMethod = sensorServiceGrpc.getInputDataMethod) == null) {
          sensorServiceGrpc.getInputDataMethod = getInputDataMethod = 
              io.grpc.MethodDescriptor.<smartair.sensorService.inputDataRequest, smartair.sensorService.inputDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smartair.sensorService.sensorService", "inputData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartair.sensorService.inputDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartair.sensorService.inputDataResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new sensorServiceMethodDescriptorSupplier("inputData"))
                  .build();
          }
        }
     }
     return getInputDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<smartair.sensorService.getDataRequest,
      smartair.sensorService.getDataResponse> getGetDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getData",
      requestType = smartair.sensorService.getDataRequest.class,
      responseType = smartair.sensorService.getDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<smartair.sensorService.getDataRequest,
      smartair.sensorService.getDataResponse> getGetDataMethod() {
    io.grpc.MethodDescriptor<smartair.sensorService.getDataRequest, smartair.sensorService.getDataResponse> getGetDataMethod;
    if ((getGetDataMethod = sensorServiceGrpc.getGetDataMethod) == null) {
      synchronized (sensorServiceGrpc.class) {
        if ((getGetDataMethod = sensorServiceGrpc.getGetDataMethod) == null) {
          sensorServiceGrpc.getGetDataMethod = getGetDataMethod = 
              io.grpc.MethodDescriptor.<smartair.sensorService.getDataRequest, smartair.sensorService.getDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smartair.sensorService.sensorService", "getData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartair.sensorService.getDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartair.sensorService.getDataResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new sensorServiceMethodDescriptorSupplier("getData"))
                  .build();
          }
        }
     }
     return getGetDataMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static sensorServiceStub newStub(io.grpc.Channel channel) {
    return new sensorServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static sensorServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new sensorServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static sensorServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new sensorServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static abstract class sensorServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void inputData(smartair.sensorService.inputDataRequest request,
        io.grpc.stub.StreamObserver<smartair.sensorService.inputDataResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getInputDataMethod(), responseObserver);
    }

    /**
     */
    public void getData(smartair.sensorService.getDataRequest request,
        io.grpc.stub.StreamObserver<smartair.sensorService.getDataResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetDataMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getInputDataMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                smartair.sensorService.inputDataRequest,
                smartair.sensorService.inputDataResponse>(
                  this, METHODID_INPUT_DATA)))
          .addMethod(
            getGetDataMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                smartair.sensorService.getDataRequest,
                smartair.sensorService.getDataResponse>(
                  this, METHODID_GET_DATA)))
          .build();
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class sensorServiceStub extends io.grpc.stub.AbstractStub<sensorServiceStub> {
    private sensorServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private sensorServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected sensorServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new sensorServiceStub(channel, callOptions);
    }

    /**
     */
    public void inputData(smartair.sensorService.inputDataRequest request,
        io.grpc.stub.StreamObserver<smartair.sensorService.inputDataResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInputDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getData(smartair.sensorService.getDataRequest request,
        io.grpc.stub.StreamObserver<smartair.sensorService.getDataResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetDataMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class sensorServiceBlockingStub extends io.grpc.stub.AbstractStub<sensorServiceBlockingStub> {
    private sensorServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private sensorServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected sensorServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new sensorServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public smartair.sensorService.inputDataResponse inputData(smartair.sensorService.inputDataRequest request) {
      return blockingUnaryCall(
          getChannel(), getInputDataMethod(), getCallOptions(), request);
    }

    /**
     */
    public smartair.sensorService.getDataResponse getData(smartair.sensorService.getDataRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetDataMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class sensorServiceFutureStub extends io.grpc.stub.AbstractStub<sensorServiceFutureStub> {
    private sensorServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private sensorServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected sensorServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new sensorServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<smartair.sensorService.inputDataResponse> inputData(
        smartair.sensorService.inputDataRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getInputDataMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<smartair.sensorService.getDataResponse> getData(
        smartair.sensorService.getDataRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetDataMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_INPUT_DATA = 0;
  private static final int METHODID_GET_DATA = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final sensorServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(sensorServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_INPUT_DATA:
          serviceImpl.inputData((smartair.sensorService.inputDataRequest) request,
              (io.grpc.stub.StreamObserver<smartair.sensorService.inputDataResponse>) responseObserver);
          break;
        case METHODID_GET_DATA:
          serviceImpl.getData((smartair.sensorService.getDataRequest) request,
              (io.grpc.stub.StreamObserver<smartair.sensorService.getDataResponse>) responseObserver);
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

  private static abstract class sensorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    sensorServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return smartair.sensorService.sensorServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("sensorService");
    }
  }

  private static final class sensorServiceFileDescriptorSupplier
      extends sensorServiceBaseDescriptorSupplier {
    sensorServiceFileDescriptorSupplier() {}
  }

  private static final class sensorServiceMethodDescriptorSupplier
      extends sensorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    sensorServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (sensorServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new sensorServiceFileDescriptorSupplier())
              .addMethod(getInputDataMethod())
              .addMethod(getGetDataMethod())
              .build();
        }
      }
    }
    return result;
  }
}
