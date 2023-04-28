/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package cz.esw.serialization.avro;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class ADataset extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 720163763718914419L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ADataset\",\"namespace\":\"cz.esw.serialization.avro\",\"fields\":[{\"name\":\"info\",\"type\":{\"type\":\"record\",\"name\":\"AMeasurementInfo\",\"fields\":[{\"name\":\"id\",\"type\":\"int\"},{\"name\":\"timestamp\",\"type\":\"long\"},{\"name\":\"measurerName\",\"type\":\"string\"}]}},{\"name\":\"records\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":\"double\"}}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<ADataset> ENCODER =
      new BinaryMessageEncoder<ADataset>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<ADataset> DECODER =
      new BinaryMessageDecoder<ADataset>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<ADataset> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<ADataset> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<ADataset> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<ADataset>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this ADataset to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a ADataset from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a ADataset instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static ADataset fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private cz.esw.serialization.avro.AMeasurementInfo info;
  private java.util.Map<java.lang.CharSequence,java.util.List<java.lang.Double>> records;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public ADataset() {}

  /**
   * All-args constructor.
   * @param info The new value for info
   * @param records The new value for records
   */
  public ADataset(cz.esw.serialization.avro.AMeasurementInfo info, java.util.Map<java.lang.CharSequence,java.util.List<java.lang.Double>> records) {
    this.info = info;
    this.records = records;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return info;
    case 1: return records;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: info = (cz.esw.serialization.avro.AMeasurementInfo)value$; break;
    case 1: records = (java.util.Map<java.lang.CharSequence,java.util.List<java.lang.Double>>)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'info' field.
   * @return The value of the 'info' field.
   */
  public cz.esw.serialization.avro.AMeasurementInfo getInfo() {
    return info;
  }


  /**
   * Sets the value of the 'info' field.
   * @param value the value to set.
   */
  public void setInfo(cz.esw.serialization.avro.AMeasurementInfo value) {
    this.info = value;
  }

  /**
   * Gets the value of the 'records' field.
   * @return The value of the 'records' field.
   */
  public java.util.Map<java.lang.CharSequence,java.util.List<java.lang.Double>> getRecords() {
    return records;
  }


  /**
   * Sets the value of the 'records' field.
   * @param value the value to set.
   */
  public void setRecords(java.util.Map<java.lang.CharSequence,java.util.List<java.lang.Double>> value) {
    this.records = value;
  }

  /**
   * Creates a new ADataset RecordBuilder.
   * @return A new ADataset RecordBuilder
   */
  public static cz.esw.serialization.avro.ADataset.Builder newBuilder() {
    return new cz.esw.serialization.avro.ADataset.Builder();
  }

  /**
   * Creates a new ADataset RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new ADataset RecordBuilder
   */
  public static cz.esw.serialization.avro.ADataset.Builder newBuilder(cz.esw.serialization.avro.ADataset.Builder other) {
    if (other == null) {
      return new cz.esw.serialization.avro.ADataset.Builder();
    } else {
      return new cz.esw.serialization.avro.ADataset.Builder(other);
    }
  }

  /**
   * Creates a new ADataset RecordBuilder by copying an existing ADataset instance.
   * @param other The existing instance to copy.
   * @return A new ADataset RecordBuilder
   */
  public static cz.esw.serialization.avro.ADataset.Builder newBuilder(cz.esw.serialization.avro.ADataset other) {
    if (other == null) {
      return new cz.esw.serialization.avro.ADataset.Builder();
    } else {
      return new cz.esw.serialization.avro.ADataset.Builder(other);
    }
  }

  /**
   * RecordBuilder for ADataset instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ADataset>
    implements org.apache.avro.data.RecordBuilder<ADataset> {

    private cz.esw.serialization.avro.AMeasurementInfo info;
    private cz.esw.serialization.avro.AMeasurementInfo.Builder infoBuilder;
    private java.util.Map<java.lang.CharSequence,java.util.List<java.lang.Double>> records;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(cz.esw.serialization.avro.ADataset.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.info)) {
        this.info = data().deepCopy(fields()[0].schema(), other.info);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (other.hasInfoBuilder()) {
        this.infoBuilder = cz.esw.serialization.avro.AMeasurementInfo.newBuilder(other.getInfoBuilder());
      }
      if (isValidValue(fields()[1], other.records)) {
        this.records = data().deepCopy(fields()[1].schema(), other.records);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
    }

    /**
     * Creates a Builder by copying an existing ADataset instance
     * @param other The existing instance to copy.
     */
    private Builder(cz.esw.serialization.avro.ADataset other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.info)) {
        this.info = data().deepCopy(fields()[0].schema(), other.info);
        fieldSetFlags()[0] = true;
      }
      this.infoBuilder = null;
      if (isValidValue(fields()[1], other.records)) {
        this.records = data().deepCopy(fields()[1].schema(), other.records);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'info' field.
      * @return The value.
      */
    public cz.esw.serialization.avro.AMeasurementInfo getInfo() {
      return info;
    }


    /**
      * Sets the value of the 'info' field.
      * @param value The value of 'info'.
      * @return This builder.
      */
    public cz.esw.serialization.avro.ADataset.Builder setInfo(cz.esw.serialization.avro.AMeasurementInfo value) {
      validate(fields()[0], value);
      this.infoBuilder = null;
      this.info = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'info' field has been set.
      * @return True if the 'info' field has been set, false otherwise.
      */
    public boolean hasInfo() {
      return fieldSetFlags()[0];
    }

    /**
     * Gets the Builder instance for the 'info' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public cz.esw.serialization.avro.AMeasurementInfo.Builder getInfoBuilder() {
      if (infoBuilder == null) {
        if (hasInfo()) {
          setInfoBuilder(cz.esw.serialization.avro.AMeasurementInfo.newBuilder(info));
        } else {
          setInfoBuilder(cz.esw.serialization.avro.AMeasurementInfo.newBuilder());
        }
      }
      return infoBuilder;
    }

    /**
     * Sets the Builder instance for the 'info' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public cz.esw.serialization.avro.ADataset.Builder setInfoBuilder(cz.esw.serialization.avro.AMeasurementInfo.Builder value) {
      clearInfo();
      infoBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'info' field has an active Builder instance
     * @return True if the 'info' field has an active Builder instance
     */
    public boolean hasInfoBuilder() {
      return infoBuilder != null;
    }

    /**
      * Clears the value of the 'info' field.
      * @return This builder.
      */
    public cz.esw.serialization.avro.ADataset.Builder clearInfo() {
      info = null;
      infoBuilder = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'records' field.
      * @return The value.
      */
    public java.util.Map<java.lang.CharSequence,java.util.List<java.lang.Double>> getRecords() {
      return records;
    }


    /**
      * Sets the value of the 'records' field.
      * @param value The value of 'records'.
      * @return This builder.
      */
    public cz.esw.serialization.avro.ADataset.Builder setRecords(java.util.Map<java.lang.CharSequence,java.util.List<java.lang.Double>> value) {
      validate(fields()[1], value);
      this.records = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'records' field has been set.
      * @return True if the 'records' field has been set, false otherwise.
      */
    public boolean hasRecords() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'records' field.
      * @return This builder.
      */
    public cz.esw.serialization.avro.ADataset.Builder clearRecords() {
      records = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public ADataset build() {
      try {
        ADataset record = new ADataset();
        if (infoBuilder != null) {
          try {
            record.info = this.infoBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("info"));
            throw e;
          }
        } else {
          record.info = fieldSetFlags()[0] ? this.info : (cz.esw.serialization.avro.AMeasurementInfo) defaultValue(fields()[0]);
        }
        record.records = fieldSetFlags()[1] ? this.records : (java.util.Map<java.lang.CharSequence,java.util.List<java.lang.Double>>) defaultValue(fields()[1]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<ADataset>
    WRITER$ = (org.apache.avro.io.DatumWriter<ADataset>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<ADataset>
    READER$ = (org.apache.avro.io.DatumReader<ADataset>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    this.info.customEncode(out);

    long size0 = this.records.size();
    out.writeMapStart();
    out.setItemCount(size0);
    long actualSize0 = 0;
    for (java.util.Map.Entry<java.lang.CharSequence, java.util.List<java.lang.Double>> e0: this.records.entrySet()) {
      actualSize0++;
      out.startItem();
      out.writeString(e0.getKey());
      java.util.List<java.lang.Double> v0 = e0.getValue();
      long size1 = v0.size();
      out.writeArrayStart();
      out.setItemCount(size1);
      long actualSize1 = 0;
      for (java.lang.Double e1: v0) {
        actualSize1++;
        out.startItem();
        out.writeDouble(e1);
      }
      out.writeArrayEnd();
      if (actualSize1 != size1)
        throw new java.util.ConcurrentModificationException("Array-size written was " + size1 + ", but element count was " + actualSize1 + ".");
    }
    out.writeMapEnd();
    if (actualSize0 != size0)
      throw new java.util.ConcurrentModificationException("Map-size written was " + size0 + ", but element count was " + actualSize0 + ".");

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      if (this.info == null) {
        this.info = new cz.esw.serialization.avro.AMeasurementInfo();
      }
      this.info.customDecode(in);

      long size0 = in.readMapStart();
      java.util.Map<java.lang.CharSequence,java.util.List<java.lang.Double>> m0 = this.records; // Need fresh name due to limitation of macro system
      if (m0 == null) {
        m0 = new java.util.HashMap<java.lang.CharSequence,java.util.List<java.lang.Double>>((int)size0);
        this.records = m0;
      } else m0.clear();
      for ( ; 0 < size0; size0 = in.mapNext()) {
        for ( ; size0 != 0; size0--) {
          java.lang.CharSequence k0 = null;
          k0 = in.readString(k0 instanceof Utf8 ? (Utf8)k0 : null);
          java.util.List<java.lang.Double> v0 = null;
          long size1 = in.readArrayStart();
          java.util.List<java.lang.Double> a1 = v0;
          if (a1 == null) {
            a1 = new SpecificData.Array<java.lang.Double>((int)size1, SCHEMA$.getField("records").schema().getValueType());
            v0 = a1;
          } else a1.clear();
          SpecificData.Array<java.lang.Double> ga1 = (a1 instanceof SpecificData.Array ? (SpecificData.Array<java.lang.Double>)a1 : null);
          for ( ; 0 < size1; size1 = in.arrayNext()) {
            for ( ; size1 != 0; size1--) {
              java.lang.Double e1 = (ga1 != null ? ga1.peek() : null);
              e1 = in.readDouble();
              a1.add(e1);
            }
          }
          m0.put(k0, v0);
        }
      }

    } else {
      for (int i = 0; i < 2; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (this.info == null) {
            this.info = new cz.esw.serialization.avro.AMeasurementInfo();
          }
          this.info.customDecode(in);
          break;

        case 1:
          long size0 = in.readMapStart();
          java.util.Map<java.lang.CharSequence,java.util.List<java.lang.Double>> m0 = this.records; // Need fresh name due to limitation of macro system
          if (m0 == null) {
            m0 = new java.util.HashMap<java.lang.CharSequence,java.util.List<java.lang.Double>>((int)size0);
            this.records = m0;
          } else m0.clear();
          for ( ; 0 < size0; size0 = in.mapNext()) {
            for ( ; size0 != 0; size0--) {
              java.lang.CharSequence k0 = null;
              k0 = in.readString(k0 instanceof Utf8 ? (Utf8)k0 : null);
              java.util.List<java.lang.Double> v0 = null;
              long size1 = in.readArrayStart();
              java.util.List<java.lang.Double> a1 = v0;
              if (a1 == null) {
                a1 = new SpecificData.Array<java.lang.Double>((int)size1, SCHEMA$.getField("records").schema().getValueType());
                v0 = a1;
              } else a1.clear();
              SpecificData.Array<java.lang.Double> ga1 = (a1 instanceof SpecificData.Array ? (SpecificData.Array<java.lang.Double>)a1 : null);
              for ( ; 0 < size1; size1 = in.arrayNext()) {
                for ( ; size1 != 0; size1--) {
                  java.lang.Double e1 = (ga1 != null ? ga1.peek() : null);
                  e1 = in.readDouble();
                  a1.add(e1);
                }
              }
              m0.put(k0, v0);
            }
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










