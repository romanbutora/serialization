// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: measurements.proto

package cz.esw.serialization.proto;

public final class Measurements {
  private Measurements() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_esw_PMeasurementInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_esw_PMeasurementInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_esw_Doubles_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_esw_Doubles_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_esw_PDataset_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_esw_PDataset_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_esw_PDataset_RecordsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_esw_PDataset_RecordsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_esw_PDatasets_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_esw_PDatasets_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_esw_PResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_esw_PResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_esw_PResult_AveragesEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_esw_PResult_AveragesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_esw_PResults_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_esw_PResults_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022measurements.proto\022\003esw\"G\n\020PMeasuremen" +
      "tInfo\022\n\n\002id\030\001 \001(\005\022\021\n\ttimestamp\030\002 \001(\003\022\024\n\014" +
      "measurerName\030\003 \001(\t\"\030\n\007Doubles\022\r\n\005value\030\001" +
      " \003(\001\"\232\001\n\010PDataset\022#\n\004info\030\001 \001(\0132\025.esw.PM" +
      "easurementInfo\022+\n\007records\030\002 \003(\0132\032.esw.PD" +
      "ataset.RecordsEntry\032<\n\014RecordsEntry\022\013\n\003k" +
      "ey\030\001 \001(\t\022\033\n\005value\030\002 \001(\0132\014.esw.Doubles:\0028" +
      "\001\",\n\tPDatasets\022\037\n\010pdataset\030\001 \003(\0132\r.esw.P" +
      "Dataset\"\215\001\n\007PResult\022#\n\004info\030\001 \001(\0132\025.esw." +
      "PMeasurementInfo\022,\n\010averages\030\002 \003(\0132\032.esw" +
      ".PResult.AveragesEntry\032/\n\rAveragesEntry\022" +
      "\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\001:\0028\001\")\n\010PResu" +
      "lts\022\035\n\007results\030\001 \003(\0132\014.esw.PResultB\036\n\032cz" +
      ".esw.serialization.protoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_esw_PMeasurementInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_esw_PMeasurementInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_esw_PMeasurementInfo_descriptor,
        new java.lang.String[] { "Id", "Timestamp", "MeasurerName", });
    internal_static_esw_Doubles_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_esw_Doubles_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_esw_Doubles_descriptor,
        new java.lang.String[] { "Value", });
    internal_static_esw_PDataset_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_esw_PDataset_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_esw_PDataset_descriptor,
        new java.lang.String[] { "Info", "Records", });
    internal_static_esw_PDataset_RecordsEntry_descriptor =
      internal_static_esw_PDataset_descriptor.getNestedTypes().get(0);
    internal_static_esw_PDataset_RecordsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_esw_PDataset_RecordsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_esw_PDatasets_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_esw_PDatasets_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_esw_PDatasets_descriptor,
        new java.lang.String[] { "Pdataset", });
    internal_static_esw_PResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_esw_PResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_esw_PResult_descriptor,
        new java.lang.String[] { "Info", "Averages", });
    internal_static_esw_PResult_AveragesEntry_descriptor =
      internal_static_esw_PResult_descriptor.getNestedTypes().get(0);
    internal_static_esw_PResult_AveragesEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_esw_PResult_AveragesEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_esw_PResults_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_esw_PResults_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_esw_PResults_descriptor,
        new java.lang.String[] { "Results", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
