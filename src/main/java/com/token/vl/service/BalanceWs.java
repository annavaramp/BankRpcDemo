/**
 * BalanceWs.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.token.vl.service;

public class BalanceWs  implements java.io.Serializable {
    private java.lang.String account_Id;

    private java.util.Calendar upated_at_ms;

    private com.token.vl.service.MoneyWs current_balance;

    private com.token.vl.service.MoneyWs available_Balance;

    public BalanceWs() {
    }

    public BalanceWs(
           java.lang.String account_Id,
           java.util.Calendar upated_at_ms,
           com.token.vl.service.MoneyWs current_balance,
           com.token.vl.service.MoneyWs available_Balance) {
           this.account_Id = account_Id;
           this.upated_at_ms = upated_at_ms;
           this.current_balance = current_balance;
           this.available_Balance = available_Balance;
    }


    /**
     * Gets the account_Id value for this BalanceWs.
     * 
     * @return account_Id
     */
    public java.lang.String getAccount_Id() {
        return account_Id;
    }


    /**
     * Sets the account_Id value for this BalanceWs.
     * 
     * @param account_Id
     */
    public void setAccount_Id(java.lang.String account_Id) {
        this.account_Id = account_Id;
    }


    /**
     * Gets the upated_at_ms value for this BalanceWs.
     * 
     * @return upated_at_ms
     */
    public java.util.Calendar getUpated_at_ms() {
        return upated_at_ms;
    }


    /**
     * Sets the upated_at_ms value for this BalanceWs.
     * 
     * @param upated_at_ms
     */
    public void setUpated_at_ms(java.util.Calendar upated_at_ms) {
        this.upated_at_ms = upated_at_ms;
    }


    /**
     * Gets the current_balance value for this BalanceWs.
     * 
     * @return current_balance
     */
    public com.token.vl.service.MoneyWs getCurrent_balance() {
        return current_balance;
    }


    /**
     * Sets the current_balance value for this BalanceWs.
     * 
     * @param current_balance
     */
    public void setCurrent_balance(com.token.vl.service.MoneyWs current_balance) {
        this.current_balance = current_balance;
    }


    /**
     * Gets the available_Balance value for this BalanceWs.
     * 
     * @return available_Balance
     */
    public com.token.vl.service.MoneyWs getAvailable_Balance() {
        return available_Balance;
    }


    /**
     * Sets the available_Balance value for this BalanceWs.
     * 
     * @param available_Balance
     */
    public void setAvailable_Balance(com.token.vl.service.MoneyWs available_Balance) {
        this.available_Balance = available_Balance;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BalanceWs)) return false;
        BalanceWs other = (BalanceWs) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.account_Id==null && other.getAccount_Id()==null) || 
             (this.account_Id!=null &&
              this.account_Id.equals(other.getAccount_Id()))) &&
            ((this.upated_at_ms==null && other.getUpated_at_ms()==null) || 
             (this.upated_at_ms!=null &&
              this.upated_at_ms.equals(other.getUpated_at_ms()))) &&
            ((this.current_balance==null && other.getCurrent_balance()==null) || 
             (this.current_balance!=null &&
              this.current_balance.equals(other.getCurrent_balance()))) &&
            ((this.available_Balance==null && other.getAvailable_Balance()==null) || 
             (this.available_Balance!=null &&
              this.available_Balance.equals(other.getAvailable_Balance())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAccount_Id() != null) {
            _hashCode += getAccount_Id().hashCode();
        }
        if (getUpated_at_ms() != null) {
            _hashCode += getUpated_at_ms().hashCode();
        }
        if (getCurrent_balance() != null) {
            _hashCode += getCurrent_balance().hashCode();
        }
        if (getAvailable_Balance() != null) {
            _hashCode += getAvailable_Balance().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BalanceWs.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.vl.token.com/", "balanceWs"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account_Id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "account_Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("upated_at_ms");
        elemField.setXmlName(new javax.xml.namespace.QName("", "upated_at_ms"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("current_balance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "current_balance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.vl.token.com/", "moneyWs"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("available_Balance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "available_Balance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.vl.token.com/", "moneyWs"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
