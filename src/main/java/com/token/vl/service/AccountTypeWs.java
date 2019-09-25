/**
 * AccountTypeWs.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.token.vl.service;

public class AccountTypeWs implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AccountTypeWs(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _INVALID = "INVALID";
    public static final java.lang.String _OTHER = "OTHER";
    public static final java.lang.String _CHECKING = "CHECKING";
    public static final java.lang.String _SAVINGS = "SAVINGS";
    public static final java.lang.String _LOAN = "LOAN";
    public static final java.lang.String _CARD = "CARD";
    public static final AccountTypeWs INVALID = new AccountTypeWs(_INVALID);
    public static final AccountTypeWs OTHER = new AccountTypeWs(_OTHER);
    public static final AccountTypeWs CHECKING = new AccountTypeWs(_CHECKING);
    public static final AccountTypeWs SAVINGS = new AccountTypeWs(_SAVINGS);
    public static final AccountTypeWs LOAN = new AccountTypeWs(_LOAN);
    public static final AccountTypeWs CARD = new AccountTypeWs(_CARD);
    public java.lang.String getValue() { return _value_;}
    public static AccountTypeWs fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AccountTypeWs enumeration = (AccountTypeWs)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AccountTypeWs fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AccountTypeWs.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.vl.token.com/", "accountTypeWs"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
