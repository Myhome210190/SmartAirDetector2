// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MonitorAlarmsService.proto

package smartair.monitorAlarmsService;

public final class monitorAlarmsServiceImpl {
  private monitorAlarmsServiceImpl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smartair_monitorAlarmsService_setThresholdRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smartair_monitorAlarmsService_setThresholdRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smartair_monitorAlarmsService_setThresholdResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smartair_monitorAlarmsService_setThresholdResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smartair_monitorAlarmsService_alertMonitorResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smartair_monitorAlarmsService_alertMonitorResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032MonitorAlarmsService.proto\022\035smartair.m" +
      "onitorAlarmsService\"(\n\023setThresholdReque" +
      "st\022\021\n\tthreshold\030\001 \001(\002\",\n\024setThresholdRes" +
      "ponse\022\024\n\014thresholdSet\030\001 \001(\010\",\n\024alertMoni" +
      "torResponse\022\024\n\014alertMessage\030\001 \001(\0102\221\002\n\024mo" +
      "nitorAlarmsService\022y\n\014setThreshold\0222.sma" +
      "rtair.monitorAlarmsService.setThresholdR" +
      "equest\0323.smartair.monitorAlarmsService.s" +
      "etThresholdResponse\"\000\022~\n\021startAlertMonit" +
      "or\0222.smartair.monitorAlarmsService.setTh" +
      "resholdRequest\0323.smartair.monitorAlarmsS" +
      "ervice.alertMonitorResponse\"\000B;\n\035smartai" +
      "r.monitorAlarmsServiceB\030monitorAlarmsSer" +
      "viceImplP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_smartair_monitorAlarmsService_setThresholdRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_smartair_monitorAlarmsService_setThresholdRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smartair_monitorAlarmsService_setThresholdRequest_descriptor,
        new java.lang.String[] { "Threshold", });
    internal_static_smartair_monitorAlarmsService_setThresholdResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_smartair_monitorAlarmsService_setThresholdResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smartair_monitorAlarmsService_setThresholdResponse_descriptor,
        new java.lang.String[] { "ThresholdSet", });
    internal_static_smartair_monitorAlarmsService_alertMonitorResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_smartair_monitorAlarmsService_alertMonitorResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smartair_monitorAlarmsService_alertMonitorResponse_descriptor,
        new java.lang.String[] { "AlertMessage", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
