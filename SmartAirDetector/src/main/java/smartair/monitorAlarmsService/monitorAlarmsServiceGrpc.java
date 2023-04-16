package smartair.monitorAlarmsService;

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
    comments = "Source: MonitorAlarmsService.proto")
public final class monitorAlarmsServiceGrpc {

  private monitorAlarmsServiceGrpc() {}

  public static final String SERVICE_NAME = "smartair.monitorAlarmsService.monitorAlarmsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<smartair.monitorAlarmsService.setThresholdRequest,
      smartair.monitorAlarmsService.setThresholdResponse> getSetThresholdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setThreshold",
      requestType = smartair.monitorAlarmsService.setThresholdRequest.class,
      responseType = smartair.monitorAlarmsService.setThresholdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<smartair.monitorAlarmsService.setThresholdRequest,
      smartair.monitorAlarmsService.setThresholdResponse> getSetThresholdMethod() {
    io.grpc.MethodDescriptor<smartair.monitorAlarmsService.setThresholdRequest, smartair.monitorAlarmsService.setThresholdResponse> getSetThresholdMethod;
    if ((getSetThresholdMethod = monitorAlarmsServiceGrpc.getSetThresholdMethod) == null) {
      synchronized (monitorAlarmsServiceGrpc.class) {
        if ((getSetThresholdMethod = monitorAlarmsServiceGrpc.getSetThresholdMethod) == null) {
          monitorAlarmsServiceGrpc.getSetThresholdMethod = getSetThresholdMethod = 
              io.grpc.MethodDescriptor.<smartair.monitorAlarmsService.setThresholdRequest, smartair.monitorAlarmsService.setThresholdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smartair.monitorAlarmsService.monitorAlarmsService", "setThreshold"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartair.monitorAlarmsService.setThresholdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartair.monitorAlarmsService.setThresholdResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new monitorAlarmsServiceMethodDescriptorSupplier("setThreshold"))
                  .build();
          }
        }
     }
     return getSetThresholdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<smartair.monitorAlarmsService.setThresholdRequest,
      smartair.monitorAlarmsService.alertMonitorResponse> getStartAlertMonitorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "startAlertMonitor",
      requestType = smartair.monitorAlarmsService.setThresholdRequest.class,
      responseType = smartair.monitorAlarmsService.alertMonitorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<smartair.monitorAlarmsService.setThresholdRequest,
      smartair.monitorAlarmsService.alertMonitorResponse> getStartAlertMonitorMethod() {
    io.grpc.MethodDescriptor<smartair.monitorAlarmsService.setThresholdRequest, smartair.monitorAlarmsService.alertMonitorResponse> getStartAlertMonitorMethod;
    if ((getStartAlertMonitorMethod = monitorAlarmsServiceGrpc.getStartAlertMonitorMethod) == null) {
      synchronized (monitorAlarmsServiceGrpc.class) {
        if ((getStartAlertMonitorMethod = monitorAlarmsServiceGrpc.getStartAlertMonitorMethod) == null) {
          monitorAlarmsServiceGrpc.getStartAlertMonitorMethod = getStartAlertMonitorMethod = 
              io.grpc.MethodDescriptor.<smartair.monitorAlarmsService.setThresholdRequest, smartair.monitorAlarmsService.alertMonitorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smartair.monitorAlarmsService.monitorAlarmsService", "startAlertMonitor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartair.monitorAlarmsService.setThresholdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartair.monitorAlarmsService.alertMonitorResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new monitorAlarmsServiceMethodDescriptorSupplier("startAlertMonitor"))
                  .build();
          }
        }
     }
     return getStartAlertMonitorMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static monitorAlarmsServiceStub newStub(io.grpc.Channel channel) {
    return new monitorAlarmsServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static monitorAlarmsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new monitorAlarmsServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static monitorAlarmsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new monitorAlarmsServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static abstract class monitorAlarmsServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void setThreshold(smartair.monitorAlarmsService.setThresholdRequest request,
        io.grpc.stub.StreamObserver<smartair.monitorAlarmsService.setThresholdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetThresholdMethod(), responseObserver);
    }

    /**
     */
    public void startAlertMonitor(smartair.monitorAlarmsService.setThresholdRequest request,
        io.grpc.stub.StreamObserver<smartair.monitorAlarmsService.alertMonitorResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStartAlertMonitorMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSetThresholdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                smartair.monitorAlarmsService.setThresholdRequest,
                smartair.monitorAlarmsService.setThresholdResponse>(
                  this, METHODID_SET_THRESHOLD)))
          .addMethod(
            getStartAlertMonitorMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                smartair.monitorAlarmsService.setThresholdRequest,
                smartair.monitorAlarmsService.alertMonitorResponse>(
                  this, METHODID_START_ALERT_MONITOR)))
          .build();
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class monitorAlarmsServiceStub extends io.grpc.stub.AbstractStub<monitorAlarmsServiceStub> {
    private monitorAlarmsServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private monitorAlarmsServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected monitorAlarmsServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new monitorAlarmsServiceStub(channel, callOptions);
    }

    /**
     */
    public void setThreshold(smartair.monitorAlarmsService.setThresholdRequest request,
        io.grpc.stub.StreamObserver<smartair.monitorAlarmsService.setThresholdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetThresholdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void startAlertMonitor(smartair.monitorAlarmsService.setThresholdRequest request,
        io.grpc.stub.StreamObserver<smartair.monitorAlarmsService.alertMonitorResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStartAlertMonitorMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class monitorAlarmsServiceBlockingStub extends io.grpc.stub.AbstractStub<monitorAlarmsServiceBlockingStub> {
    private monitorAlarmsServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private monitorAlarmsServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected monitorAlarmsServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new monitorAlarmsServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public smartair.monitorAlarmsService.setThresholdResponse setThreshold(smartair.monitorAlarmsService.setThresholdRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetThresholdMethod(), getCallOptions(), request);
    }

    /**
     */
    public smartair.monitorAlarmsService.alertMonitorResponse startAlertMonitor(smartair.monitorAlarmsService.setThresholdRequest request) {
      return blockingUnaryCall(
          getChannel(), getStartAlertMonitorMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class monitorAlarmsServiceFutureStub extends io.grpc.stub.AbstractStub<monitorAlarmsServiceFutureStub> {
    private monitorAlarmsServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private monitorAlarmsServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected monitorAlarmsServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new monitorAlarmsServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<smartair.monitorAlarmsService.setThresholdResponse> setThreshold(
        smartair.monitorAlarmsService.setThresholdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetThresholdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<smartair.monitorAlarmsService.alertMonitorResponse> startAlertMonitor(
        smartair.monitorAlarmsService.setThresholdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStartAlertMonitorMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SET_THRESHOLD = 0;
  private static final int METHODID_START_ALERT_MONITOR = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final monitorAlarmsServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(monitorAlarmsServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SET_THRESHOLD:
          serviceImpl.setThreshold((smartair.monitorAlarmsService.setThresholdRequest) request,
              (io.grpc.stub.StreamObserver<smartair.monitorAlarmsService.setThresholdResponse>) responseObserver);
          break;
        case METHODID_START_ALERT_MONITOR:
          serviceImpl.startAlertMonitor((smartair.monitorAlarmsService.setThresholdRequest) request,
              (io.grpc.stub.StreamObserver<smartair.monitorAlarmsService.alertMonitorResponse>) responseObserver);
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

  private static abstract class monitorAlarmsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    monitorAlarmsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return smartair.monitorAlarmsService.monitorAlarmsServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("monitorAlarmsService");
    }
  }

  private static final class monitorAlarmsServiceFileDescriptorSupplier
      extends monitorAlarmsServiceBaseDescriptorSupplier {
    monitorAlarmsServiceFileDescriptorSupplier() {}
  }

  private static final class monitorAlarmsServiceMethodDescriptorSupplier
      extends monitorAlarmsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    monitorAlarmsServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (monitorAlarmsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new monitorAlarmsServiceFileDescriptorSupplier())
              .addMethod(getSetThresholdMethod())
              .addMethod(getStartAlertMonitorMethod())
              .build();
        }
      }
    }
    return result;
  }
}
