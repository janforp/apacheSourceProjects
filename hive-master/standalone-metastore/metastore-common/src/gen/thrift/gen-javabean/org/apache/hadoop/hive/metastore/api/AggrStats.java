/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)")
@org.apache.hadoop.classification.InterfaceAudience.Public @org.apache.hadoop.classification.InterfaceStability.Stable public class AggrStats implements org.apache.thrift.TBase<AggrStats, AggrStats._Fields>, java.io.Serializable, Cloneable, Comparable<AggrStats> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("AggrStats");

  private static final org.apache.thrift.protocol.TField COL_STATS_FIELD_DESC = new org.apache.thrift.protocol.TField("colStats", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField PARTS_FOUND_FIELD_DESC = new org.apache.thrift.protocol.TField("partsFound", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField IS_STATS_COMPLIANT_FIELD_DESC = new org.apache.thrift.protocol.TField("isStatsCompliant", org.apache.thrift.protocol.TType.BOOL, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new AggrStatsStandardSchemeFactory());
    schemes.put(TupleScheme.class, new AggrStatsTupleSchemeFactory());
  }

  private List<ColumnStatisticsObj> colStats; // required
  private long partsFound; // required
  private boolean isStatsCompliant; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    COL_STATS((short)1, "colStats"),
    PARTS_FOUND((short)2, "partsFound"),
    IS_STATS_COMPLIANT((short)3, "isStatsCompliant");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // COL_STATS
          return COL_STATS;
        case 2: // PARTS_FOUND
          return PARTS_FOUND;
        case 3: // IS_STATS_COMPLIANT
          return IS_STATS_COMPLIANT;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __PARTSFOUND_ISSET_ID = 0;
  private static final int __ISSTATSCOMPLIANT_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.IS_STATS_COMPLIANT};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.COL_STATS, new org.apache.thrift.meta_data.FieldMetaData("colStats", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ColumnStatisticsObj.class))));
    tmpMap.put(_Fields.PARTS_FOUND, new org.apache.thrift.meta_data.FieldMetaData("partsFound", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.IS_STATS_COMPLIANT, new org.apache.thrift.meta_data.FieldMetaData("isStatsCompliant", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(AggrStats.class, metaDataMap);
  }

  public AggrStats() {
  }

  public AggrStats(
    List<ColumnStatisticsObj> colStats,
    long partsFound)
  {
    this();
    this.colStats = colStats;
    this.partsFound = partsFound;
    setPartsFoundIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public AggrStats(AggrStats other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetColStats()) {
      List<ColumnStatisticsObj> __this__colStats = new ArrayList<ColumnStatisticsObj>(other.colStats.size());
      for (ColumnStatisticsObj other_element : other.colStats) {
        __this__colStats.add(new ColumnStatisticsObj(other_element));
      }
      this.colStats = __this__colStats;
    }
    this.partsFound = other.partsFound;
    this.isStatsCompliant = other.isStatsCompliant;
  }

  public AggrStats deepCopy() {
    return new AggrStats(this);
  }

  @Override
  public void clear() {
    this.colStats = null;
    setPartsFoundIsSet(false);
    this.partsFound = 0;
    setIsStatsCompliantIsSet(false);
    this.isStatsCompliant = false;
  }

  public int getColStatsSize() {
    return (this.colStats == null) ? 0 : this.colStats.size();
  }

  public java.util.Iterator<ColumnStatisticsObj> getColStatsIterator() {
    return (this.colStats == null) ? null : this.colStats.iterator();
  }

  public void addToColStats(ColumnStatisticsObj elem) {
    if (this.colStats == null) {
      this.colStats = new ArrayList<ColumnStatisticsObj>();
    }
    this.colStats.add(elem);
  }

  public List<ColumnStatisticsObj> getColStats() {
    return this.colStats;
  }

  public void setColStats(List<ColumnStatisticsObj> colStats) {
    this.colStats = colStats;
  }

  public void unsetColStats() {
    this.colStats = null;
  }

  /** Returns true if field colStats is set (has been assigned a value) and false otherwise */
  public boolean isSetColStats() {
    return this.colStats != null;
  }

  public void setColStatsIsSet(boolean value) {
    if (!value) {
      this.colStats = null;
    }
  }

  public long getPartsFound() {
    return this.partsFound;
  }

  public void setPartsFound(long partsFound) {
    this.partsFound = partsFound;
    setPartsFoundIsSet(true);
  }

  public void unsetPartsFound() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PARTSFOUND_ISSET_ID);
  }

  /** Returns true if field partsFound is set (has been assigned a value) and false otherwise */
  public boolean isSetPartsFound() {
    return EncodingUtils.testBit(__isset_bitfield, __PARTSFOUND_ISSET_ID);
  }

  public void setPartsFoundIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PARTSFOUND_ISSET_ID, value);
  }

  public boolean isIsStatsCompliant() {
    return this.isStatsCompliant;
  }

  public void setIsStatsCompliant(boolean isStatsCompliant) {
    this.isStatsCompliant = isStatsCompliant;
    setIsStatsCompliantIsSet(true);
  }

  public void unsetIsStatsCompliant() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ISSTATSCOMPLIANT_ISSET_ID);
  }

  /** Returns true if field isStatsCompliant is set (has been assigned a value) and false otherwise */
  public boolean isSetIsStatsCompliant() {
    return EncodingUtils.testBit(__isset_bitfield, __ISSTATSCOMPLIANT_ISSET_ID);
  }

  public void setIsStatsCompliantIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ISSTATSCOMPLIANT_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case COL_STATS:
      if (value == null) {
        unsetColStats();
      } else {
        setColStats((List<ColumnStatisticsObj>)value);
      }
      break;

    case PARTS_FOUND:
      if (value == null) {
        unsetPartsFound();
      } else {
        setPartsFound((Long)value);
      }
      break;

    case IS_STATS_COMPLIANT:
      if (value == null) {
        unsetIsStatsCompliant();
      } else {
        setIsStatsCompliant((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case COL_STATS:
      return getColStats();

    case PARTS_FOUND:
      return getPartsFound();

    case IS_STATS_COMPLIANT:
      return isIsStatsCompliant();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case COL_STATS:
      return isSetColStats();
    case PARTS_FOUND:
      return isSetPartsFound();
    case IS_STATS_COMPLIANT:
      return isSetIsStatsCompliant();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof AggrStats)
      return this.equals((AggrStats)that);
    return false;
  }

  public boolean equals(AggrStats that) {
    if (that == null)
      return false;

    boolean this_present_colStats = true && this.isSetColStats();
    boolean that_present_colStats = true && that.isSetColStats();
    if (this_present_colStats || that_present_colStats) {
      if (!(this_present_colStats && that_present_colStats))
        return false;
      if (!this.colStats.equals(that.colStats))
        return false;
    }

    boolean this_present_partsFound = true;
    boolean that_present_partsFound = true;
    if (this_present_partsFound || that_present_partsFound) {
      if (!(this_present_partsFound && that_present_partsFound))
        return false;
      if (this.partsFound != that.partsFound)
        return false;
    }

    boolean this_present_isStatsCompliant = true && this.isSetIsStatsCompliant();
    boolean that_present_isStatsCompliant = true && that.isSetIsStatsCompliant();
    if (this_present_isStatsCompliant || that_present_isStatsCompliant) {
      if (!(this_present_isStatsCompliant && that_present_isStatsCompliant))
        return false;
      if (this.isStatsCompliant != that.isStatsCompliant)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_colStats = true && (isSetColStats());
    list.add(present_colStats);
    if (present_colStats)
      list.add(colStats);

    boolean present_partsFound = true;
    list.add(present_partsFound);
    if (present_partsFound)
      list.add(partsFound);

    boolean present_isStatsCompliant = true && (isSetIsStatsCompliant());
    list.add(present_isStatsCompliant);
    if (present_isStatsCompliant)
      list.add(isStatsCompliant);

    return list.hashCode();
  }

  @Override
  public int compareTo(AggrStats other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetColStats()).compareTo(other.isSetColStats());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetColStats()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.colStats, other.colStats);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPartsFound()).compareTo(other.isSetPartsFound());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPartsFound()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.partsFound, other.partsFound);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIsStatsCompliant()).compareTo(other.isSetIsStatsCompliant());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsStatsCompliant()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.isStatsCompliant, other.isStatsCompliant);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("AggrStats(");
    boolean first = true;

    sb.append("colStats:");
    if (this.colStats == null) {
      sb.append("null");
    } else {
      sb.append(this.colStats);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("partsFound:");
    sb.append(this.partsFound);
    first = false;
    if (isSetIsStatsCompliant()) {
      if (!first) sb.append(", ");
      sb.append("isStatsCompliant:");
      sb.append(this.isStatsCompliant);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetColStats()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'colStats' is unset! Struct:" + toString());
    }

    if (!isSetPartsFound()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'partsFound' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class AggrStatsStandardSchemeFactory implements SchemeFactory {
    public AggrStatsStandardScheme getScheme() {
      return new AggrStatsStandardScheme();
    }
  }

  private static class AggrStatsStandardScheme extends StandardScheme<AggrStats> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, AggrStats struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // COL_STATS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list308 = iprot.readListBegin();
                struct.colStats = new ArrayList<ColumnStatisticsObj>(_list308.size);
                ColumnStatisticsObj _elem309;
                for (int _i310 = 0; _i310 < _list308.size; ++_i310)
                {
                  _elem309 = new ColumnStatisticsObj();
                  _elem309.read(iprot);
                  struct.colStats.add(_elem309);
                }
                iprot.readListEnd();
              }
              struct.setColStatsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PARTS_FOUND
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.partsFound = iprot.readI64();
              struct.setPartsFoundIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // IS_STATS_COMPLIANT
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.isStatsCompliant = iprot.readBool();
              struct.setIsStatsCompliantIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, AggrStats struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.colStats != null) {
        oprot.writeFieldBegin(COL_STATS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.colStats.size()));
          for (ColumnStatisticsObj _iter311 : struct.colStats)
          {
            _iter311.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(PARTS_FOUND_FIELD_DESC);
      oprot.writeI64(struct.partsFound);
      oprot.writeFieldEnd();
      if (struct.isSetIsStatsCompliant()) {
        oprot.writeFieldBegin(IS_STATS_COMPLIANT_FIELD_DESC);
        oprot.writeBool(struct.isStatsCompliant);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class AggrStatsTupleSchemeFactory implements SchemeFactory {
    public AggrStatsTupleScheme getScheme() {
      return new AggrStatsTupleScheme();
    }
  }

  private static class AggrStatsTupleScheme extends TupleScheme<AggrStats> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, AggrStats struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.colStats.size());
        for (ColumnStatisticsObj _iter312 : struct.colStats)
        {
          _iter312.write(oprot);
        }
      }
      oprot.writeI64(struct.partsFound);
      BitSet optionals = new BitSet();
      if (struct.isSetIsStatsCompliant()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetIsStatsCompliant()) {
        oprot.writeBool(struct.isStatsCompliant);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, AggrStats struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list313 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.colStats = new ArrayList<ColumnStatisticsObj>(_list313.size);
        ColumnStatisticsObj _elem314;
        for (int _i315 = 0; _i315 < _list313.size; ++_i315)
        {
          _elem314 = new ColumnStatisticsObj();
          _elem314.read(iprot);
          struct.colStats.add(_elem314);
        }
      }
      struct.setColStatsIsSet(true);
      struct.partsFound = iprot.readI64();
      struct.setPartsFoundIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.isStatsCompliant = iprot.readBool();
        struct.setIsStatsCompliantIsSet(true);
      }
    }
  }

}

