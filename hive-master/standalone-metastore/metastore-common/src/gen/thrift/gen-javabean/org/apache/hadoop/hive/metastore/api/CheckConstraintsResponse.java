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
@org.apache.hadoop.classification.InterfaceAudience.Public @org.apache.hadoop.classification.InterfaceStability.Stable public class CheckConstraintsResponse implements org.apache.thrift.TBase<CheckConstraintsResponse, CheckConstraintsResponse._Fields>, java.io.Serializable, Cloneable, Comparable<CheckConstraintsResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CheckConstraintsResponse");

  private static final org.apache.thrift.protocol.TField CHECK_CONSTRAINTS_FIELD_DESC = new org.apache.thrift.protocol.TField("checkConstraints", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CheckConstraintsResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CheckConstraintsResponseTupleSchemeFactory());
  }

  private List<SQLCheckConstraint> checkConstraints; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CHECK_CONSTRAINTS((short)1, "checkConstraints");

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
        case 1: // CHECK_CONSTRAINTS
          return CHECK_CONSTRAINTS;
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CHECK_CONSTRAINTS, new org.apache.thrift.meta_data.FieldMetaData("checkConstraints", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SQLCheckConstraint.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CheckConstraintsResponse.class, metaDataMap);
  }

  public CheckConstraintsResponse() {
  }

  public CheckConstraintsResponse(
    List<SQLCheckConstraint> checkConstraints)
  {
    this();
    this.checkConstraints = checkConstraints;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CheckConstraintsResponse(CheckConstraintsResponse other) {
    if (other.isSetCheckConstraints()) {
      List<SQLCheckConstraint> __this__checkConstraints = new ArrayList<SQLCheckConstraint>(other.checkConstraints.size());
      for (SQLCheckConstraint other_element : other.checkConstraints) {
        __this__checkConstraints.add(new SQLCheckConstraint(other_element));
      }
      this.checkConstraints = __this__checkConstraints;
    }
  }

  public CheckConstraintsResponse deepCopy() {
    return new CheckConstraintsResponse(this);
  }

  @Override
  public void clear() {
    this.checkConstraints = null;
  }

  public int getCheckConstraintsSize() {
    return (this.checkConstraints == null) ? 0 : this.checkConstraints.size();
  }

  public java.util.Iterator<SQLCheckConstraint> getCheckConstraintsIterator() {
    return (this.checkConstraints == null) ? null : this.checkConstraints.iterator();
  }

  public void addToCheckConstraints(SQLCheckConstraint elem) {
    if (this.checkConstraints == null) {
      this.checkConstraints = new ArrayList<SQLCheckConstraint>();
    }
    this.checkConstraints.add(elem);
  }

  public List<SQLCheckConstraint> getCheckConstraints() {
    return this.checkConstraints;
  }

  public void setCheckConstraints(List<SQLCheckConstraint> checkConstraints) {
    this.checkConstraints = checkConstraints;
  }

  public void unsetCheckConstraints() {
    this.checkConstraints = null;
  }

  /** Returns true if field checkConstraints is set (has been assigned a value) and false otherwise */
  public boolean isSetCheckConstraints() {
    return this.checkConstraints != null;
  }

  public void setCheckConstraintsIsSet(boolean value) {
    if (!value) {
      this.checkConstraints = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CHECK_CONSTRAINTS:
      if (value == null) {
        unsetCheckConstraints();
      } else {
        setCheckConstraints((List<SQLCheckConstraint>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CHECK_CONSTRAINTS:
      return getCheckConstraints();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CHECK_CONSTRAINTS:
      return isSetCheckConstraints();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CheckConstraintsResponse)
      return this.equals((CheckConstraintsResponse)that);
    return false;
  }

  public boolean equals(CheckConstraintsResponse that) {
    if (that == null)
      return false;

    boolean this_present_checkConstraints = true && this.isSetCheckConstraints();
    boolean that_present_checkConstraints = true && that.isSetCheckConstraints();
    if (this_present_checkConstraints || that_present_checkConstraints) {
      if (!(this_present_checkConstraints && that_present_checkConstraints))
        return false;
      if (!this.checkConstraints.equals(that.checkConstraints))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_checkConstraints = true && (isSetCheckConstraints());
    list.add(present_checkConstraints);
    if (present_checkConstraints)
      list.add(checkConstraints);

    return list.hashCode();
  }

  @Override
  public int compareTo(CheckConstraintsResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetCheckConstraints()).compareTo(other.isSetCheckConstraints());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCheckConstraints()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.checkConstraints, other.checkConstraints);
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
    StringBuilder sb = new StringBuilder("CheckConstraintsResponse(");
    boolean first = true;

    sb.append("checkConstraints:");
    if (this.checkConstraints == null) {
      sb.append("null");
    } else {
      sb.append(this.checkConstraints);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetCheckConstraints()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'checkConstraints' is unset! Struct:" + toString());
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class CheckConstraintsResponseStandardSchemeFactory implements SchemeFactory {
    public CheckConstraintsResponseStandardScheme getScheme() {
      return new CheckConstraintsResponseStandardScheme();
    }
  }

  private static class CheckConstraintsResponseStandardScheme extends StandardScheme<CheckConstraintsResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CheckConstraintsResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CHECK_CONSTRAINTS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list392 = iprot.readListBegin();
                struct.checkConstraints = new ArrayList<SQLCheckConstraint>(_list392.size);
                SQLCheckConstraint _elem393;
                for (int _i394 = 0; _i394 < _list392.size; ++_i394)
                {
                  _elem393 = new SQLCheckConstraint();
                  _elem393.read(iprot);
                  struct.checkConstraints.add(_elem393);
                }
                iprot.readListEnd();
              }
              struct.setCheckConstraintsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, CheckConstraintsResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.checkConstraints != null) {
        oprot.writeFieldBegin(CHECK_CONSTRAINTS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.checkConstraints.size()));
          for (SQLCheckConstraint _iter395 : struct.checkConstraints)
          {
            _iter395.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CheckConstraintsResponseTupleSchemeFactory implements SchemeFactory {
    public CheckConstraintsResponseTupleScheme getScheme() {
      return new CheckConstraintsResponseTupleScheme();
    }
  }

  private static class CheckConstraintsResponseTupleScheme extends TupleScheme<CheckConstraintsResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CheckConstraintsResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.checkConstraints.size());
        for (SQLCheckConstraint _iter396 : struct.checkConstraints)
        {
          _iter396.write(oprot);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CheckConstraintsResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list397 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.checkConstraints = new ArrayList<SQLCheckConstraint>(_list397.size);
        SQLCheckConstraint _elem398;
        for (int _i399 = 0; _i399 < _list397.size; ++_i399)
        {
          _elem398 = new SQLCheckConstraint();
          _elem398.read(iprot);
          struct.checkConstraints.add(_elem398);
        }
      }
      struct.setCheckConstraintsIsSet(true);
    }
  }

}

