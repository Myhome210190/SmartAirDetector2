// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SensorService.proto

package smartair.sensorService;

public interface getDataResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:smartair.sensorService.getDataResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *last timestamp of data 
   * </pre>
   *
   * <code>double fromTimeStamp = 1;</code>
   */
  double getFromTimeStamp();

  /**
   * <pre>
   *COemission detected
   * </pre>
   *
   * <code>float coReading = 2;</code>
   */
  float getCoReading();
}