// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DataAnalisysService.proto

package smartair.dataAnalisysService;

public final class dataAnalisysServiceImpl {
  private dataAnalisysServiceImpl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smartair_dataAnalisysService_getDataRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smartair_dataAnalisysService_getDataRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smartair_dataAnalisysService_getDataResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smartair_dataAnalisysService_getDataResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031DataAnalisysService.proto\022\034smartair.da" +
      "taAnalisysService\"#\n\016getDataRequest\022\021\n\tt" +
      "imeStamp\030\001 \001(\001\"U\n\017getDataResponse\022\025\n\rfro" +
      "mTimeStamp\030\001 \001(\001\022\030\n\020currentTimeStamp\030\002 \001" +
      "(\001\022\021\n\tcoReading\030\003 \001(\0022\177\n\023dataAnalisysSer" +
      "vice\022h\n\007getData\022,.smartair.dataAnalisysS" +
      "ervice.getDataRequest\032-.smartair.dataAna" +
      "lisysService.getDataResponse\"\000B9\n\034smarta" +
      "ir.dataAnalisysServiceB\027dataAnalisysServ" +
      "iceImplP\001b\006proto3"
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
    internal_static_smartair_dataAnalisysService_getDataRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_smartair_dataAnalisysService_getDataRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smartair_dataAnalisysService_getDataRequest_descriptor,
        new java.lang.String[] { "TimeStamp", });
    internal_static_smartair_dataAnalisysService_getDataResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_smartair_dataAnalisysService_getDataResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smartair_dataAnalisysService_getDataResponse_descriptor,
        new java.lang.String[] { "FromTimeStamp", "CurrentTimeStamp", "CoReading", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
