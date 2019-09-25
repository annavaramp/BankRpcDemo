/**
 * BankAccountWs.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.token.vl.service;

public class BankAccountWs  implements java.io.Serializable {
    private java.lang.String id;

    private java.lang.String account_Name;

    private java.lang.String bank_id;

    private long memberId;

    private long accoutnId;

    private boolean is_Locked;

    private com.token.vl.service.Swift swift;

    private com.token.vl.service.Sepa sepa;

    private com.token.vl.service.Ach ach;

    private com.token.vl.service.Iban iban;

    private com.token.vl.service.CustomerWs customer;

    private com.token.vl.service.BankAccountListWs[] accountList;

    public BankAccountWs() {
    }

    public BankAccountWs(
           java.lang.String id,
           java.lang.String account_Name,
           java.lang.String bank_id,
           long memberId,
           long accoutnId,
           boolean is_Locked,
           com.token.vl.service.Swift swift,
           com.token.vl.service.Sepa sepa,
           com.token.vl.service.Ach ach,
           com.token.vl.service.Iban iban,
           com.token.vl.service.CustomerWs customer,
           com.token.vl.service.BankAccountListWs[] accountList) {
           this.id = id;
           this.account_Name = account_Name;
           this.bank_id = bank_id;
           this.memberId = memberId;
           this.accoutnId = accoutnId;
           this.is_Locked = is_Locked;
           this.swift = swift;
           this.sepa = sepa;
           this.ach = ach;
           this.iban = iban;
           this.customer = customer;
           this.accountList = accountList;
    }


    /**
     * Gets the id value for this BankAccountWs.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this BankAccountWs.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the account_Name value for this BankAccountWs.
     * 
     * @return account_Name
     */
    public java.lang.String getAccount_Name() {
        return account_Name;
    }


    /**
     * Sets the account_Name value for this BankAccountWs.
     * 
     * @param account_Name
     */
    public void setAccount_Name(java.lang.String account_Name) {
        this.account_Name = account_Name;
    }


    /**
     * Gets the bank_id value for this BankAccountWs.
     * 
     * @return bank_id
     */
    public java.lang.String getBank_id() {
        return bank_id;
    }


    /**
     * Sets the bank_id value for this BankAccountWs.
     * 
     * @param bank_id
     */
    public void setBank_id(java.lang.String bank_id) {
        this.bank_id = bank_id;
    }


    /**
     * Gets the memberId value for this BankAccountWs.
     * 
     * @return memberId
     */
    public long getMemberId() {
        return memberId;
    }


    /**
     * Sets the memberId value for this BankAccountWs.
     * 
     * @param memberId
     */
    public void setMemberId(long memberId) {
        this.memberId = memberId;
    }


    /**
     * Gets the accoutnId value for this BankAccountWs.
     * 
     * @return accoutnId
     */
    public long getAccoutnId() {
        return accoutnId;
    }


    /**
     * Sets the accoutnId value for this BankAccountWs.
     * 
     * @param accoutnId
     */
    public void setAccoutnId(long accoutnId) {
        this.accoutnId = accoutnId;
    }


    /**
     * Gets the is_Locked value for this BankAccountWs.
     * 
     * @return is_Locked
     */
    public boolean isIs_Locked() {
        return is_Locked;
    }


    /**
     * Sets the is_Locked value for this BankAccountWs.
     * 
     * @param is_Locked
     */
    public void setIs_Locked(boolean is_Locked) {
        this.is_Locked = is_Locked;
    }


    /**
     * Gets the swift value for this BankAccountWs.
     * 
     * @return swift
     */
    public com.token.vl.service.Swift getSwift() {
        return swift;
    }


    /**
     * Sets the swift value for this BankAccountWs.
     * 
     * @param swift
     */
    public void setSwift(com.token.vl.service.Swift swift) {
        this.swift = swift;
    }


    /**
     * Gets the sepa value for this BankAccountWs.
     * 
     * @return sepa
     */
    public com.token.vl.service.Sepa getSepa() {
        return sepa;
    }


    /**
     * Sets the sepa value for this BankAccountWs.
     * 
     * @param sepa
     */
    public void setSepa(com.token.vl.service.Sepa sepa) {
        this.sepa = sepa;
    }


    /**
     * Gets the ach value for this BankAccountWs.
     * 
     * @return ach
     */
    public com.token.vl.service.Ach getAch() {
        return ach;
    }


    /**
     * Sets the ach value for this BankAccountWs.
     * 
     * @param ach
     */
    public void setAch(com.token.vl.service.Ach ach) {
        this.ach = ach;
    }


    /**
     * Gets the iban value for this BankAccountWs.
     * 
     * @return iban
     */
    public com.token.vl.service.Iban getIban() {
        return iban;
    }


    /**
     * Sets the iban value for this BankAccountWs.
     * 
     * @param iban
     */
    public void setIban(com.token.vl.service.Iban iban) {
        this.iban = iban;
    }


    /**
     * Gets the customer value for this BankAccountWs.
     * 
     * @return customer
     */
    public com.token.vl.service.CustomerWs getCustomer() {
        return customer;
    }


    /**
     * Sets the customer value for this BankAccountWs.
     * 
     * @param customer
     */
    public void setCustomer(com.token.vl.service.CustomerWs customer) {
        this.customer = customer;
    }


    /**
     * Gets the accountList value for this BankAccountWs.
     * 
     * @return accountList
     */
    public com.token.vl.service.BankAccountListWs[] getAccountList() {
        return accountList;
    }


    /**
     * Sets the accountList value for this BankAccountWs.
     * 
     * @param accountList
     */
    public void setAccountList(com.token.vl.service.BankAccountListWs[] accountList) {
        this.accountList = accountList;
    }

    public com.token.vl.service.BankAccountListWs getAccountList(int i) {
        return this.accountList[i];
    }

    public void setAccountList(int i, com.token.vl.service.BankAccountListWs _value) {
        this.accountList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BankAccountWs)) return false;
        BankAccountWs other = (BankAccountWs) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.account_Name==null && other.getAccount_Name()==null) || 
             (this.account_Name!=null &&
              this.account_Name.equals(other.getAccount_Name()))) &&
            ((this.bank_id==null && other.getBank_id()==null) || 
             (this.bank_id!=null &&
              this.bank_id.equals(other.getBank_id()))) &&
            this.memberId == other.getMemberId() &&
            this.accoutnId == other.getAccoutnId() &&
            this.is_Locked == other.isIs_Locked() &&
            ((this.swift==null && other.getSwift()==null) || 
             (this.swift!=null &&
              this.swift.equals(other.getSwift()))) &&
            ((this.sepa==null && other.getSepa()==null) || 
             (this.sepa!=null &&
              this.sepa.equals(other.getSepa()))) &&
            ((this.ach==null && other.getAch()==null) || 
             (this.ach!=null &&
              this.ach.equals(other.getAch()))) &&
            ((this.iban==null && other.getIban()==null) || 
             (this.iban!=null &&
              this.iban.equals(other.getIban()))) &&
            ((this.customer==null && other.getCustomer()==null) || 
             (this.customer!=null &&
              this.customer.equals(other.getCustomer()))) &&
            ((this.accountList==null && other.getAccountList()==null) || 
             (this.accountList!=null &&
              java.util.Arrays.equals(this.accountList, other.getAccountList())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getAccount_Name() != null) {
            _hashCode += getAccount_Name().hashCode();
        }
        if (getBank_id() != null) {
            _hashCode += getBank_id().hashCode();
        }
        _hashCode += new Long(getMemberId()).hashCode();
        _hashCode += new Long(getAccoutnId()).hashCode();
        _hashCode += (isIs_Locked() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getSwift() != null) {
            _hashCode += getSwift().hashCode();
        }
        if (getSepa() != null) {
            _hashCode += getSepa().hashCode();
        }
        if (getAch() != null) {
            _hashCode += getAch().hashCode();
        }
        if (getIban() != null) {
            _hashCode += getIban().hashCode();
        }
        if (getCustomer() != null) {
            _hashCode += getCustomer().hashCode();
        }
        if (getAccountList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccountList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccountList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BankAccountWs.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.vl.token.com/", "bankAccountWs"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account_Name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "account_Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bank_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bank_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memberId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "memberId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accoutnId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accoutnId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("is_Locked");
        elemField.setXmlName(new javax.xml.namespace.QName("", "is_Locked"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("swift");
        elemField.setXmlName(new javax.xml.namespace.QName("", "swift"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.vl.token.com/", "swift"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sepa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sepa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.vl.token.com/", "sepa"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ach");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ach"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.vl.token.com/", "ach"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iban");
        elemField.setXmlName(new javax.xml.namespace.QName("", "iban"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.vl.token.com/", "iban"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.vl.token.com/", "customerWs"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accountList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.vl.token.com/", "bankAccountListWs"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
