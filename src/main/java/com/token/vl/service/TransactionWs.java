/**
 * TransactionWs.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.token.vl.service;

public class TransactionWs  implements java.io.Serializable {
    private java.lang.String id;

    private com.token.vl.service.TransactionTypeWs transactionType;

    private com.token.vl.service.TransactionStatusWs taransactionStatus;

    private java.lang.String description;

    private java.lang.String tokenId;

    private java.lang.String tokenTransferId;

    private java.util.Calendar createdAtMs;

    private com.token.vl.service.MoneyWs amount;

    public TransactionWs() {
    }

    public TransactionWs(
           java.lang.String id,
           com.token.vl.service.TransactionTypeWs transactionType,
           com.token.vl.service.TransactionStatusWs taransactionStatus,
           java.lang.String description,
           java.lang.String tokenId,
           java.lang.String tokenTransferId,
           java.util.Calendar createdAtMs,
           com.token.vl.service.MoneyWs amount) {
           this.id = id;
           this.transactionType = transactionType;
           this.taransactionStatus = taransactionStatus;
           this.description = description;
           this.tokenId = tokenId;
           this.tokenTransferId = tokenTransferId;
           this.createdAtMs = createdAtMs;
           this.amount = amount;
    }


    /**
     * Gets the id value for this TransactionWs.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this TransactionWs.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the transactionType value for this TransactionWs.
     * 
     * @return transactionType
     */
    public com.token.vl.service.TransactionTypeWs getTransactionType() {
        return transactionType;
    }


    /**
     * Sets the transactionType value for this TransactionWs.
     * 
     * @param transactionType
     */
    public void setTransactionType(com.token.vl.service.TransactionTypeWs transactionType) {
        this.transactionType = transactionType;
    }


    /**
     * Gets the taransactionStatus value for this TransactionWs.
     * 
     * @return taransactionStatus
     */
    public com.token.vl.service.TransactionStatusWs getTaransactionStatus() {
        return taransactionStatus;
    }


    /**
     * Sets the taransactionStatus value for this TransactionWs.
     * 
     * @param taransactionStatus
     */
    public void setTaransactionStatus(com.token.vl.service.TransactionStatusWs taransactionStatus) {
        this.taransactionStatus = taransactionStatus;
    }


    /**
     * Gets the description value for this TransactionWs.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this TransactionWs.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the tokenId value for this TransactionWs.
     * 
     * @return tokenId
     */
    public java.lang.String getTokenId() {
        return tokenId;
    }


    /**
     * Sets the tokenId value for this TransactionWs.
     * 
     * @param tokenId
     */
    public void setTokenId(java.lang.String tokenId) {
        this.tokenId = tokenId;
    }


    /**
     * Gets the tokenTransferId value for this TransactionWs.
     * 
     * @return tokenTransferId
     */
    public java.lang.String getTokenTransferId() {
        return tokenTransferId;
    }


    /**
     * Sets the tokenTransferId value for this TransactionWs.
     * 
     * @param tokenTransferId
     */
    public void setTokenTransferId(java.lang.String tokenTransferId) {
        this.tokenTransferId = tokenTransferId;
    }


    /**
     * Gets the createdAtMs value for this TransactionWs.
     * 
     * @return createdAtMs
     */
    public java.util.Calendar getCreatedAtMs() {
        return createdAtMs;
    }


    /**
     * Sets the createdAtMs value for this TransactionWs.
     * 
     * @param createdAtMs
     */
    public void setCreatedAtMs(java.util.Calendar createdAtMs) {
        this.createdAtMs = createdAtMs;
    }


    /**
     * Gets the amount value for this TransactionWs.
     * 
     * @return amount
     */
    public com.token.vl.service.MoneyWs getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this TransactionWs.
     * 
     * @param amount
     */
    public void setAmount(com.token.vl.service.MoneyWs amount) {
        this.amount = amount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransactionWs)) return false;
        TransactionWs other = (TransactionWs) obj;
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
            ((this.transactionType==null && other.getTransactionType()==null) || 
             (this.transactionType!=null &&
              this.transactionType.equals(other.getTransactionType()))) &&
            ((this.taransactionStatus==null && other.getTaransactionStatus()==null) || 
             (this.taransactionStatus!=null &&
              this.taransactionStatus.equals(other.getTaransactionStatus()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.tokenId==null && other.getTokenId()==null) || 
             (this.tokenId!=null &&
              this.tokenId.equals(other.getTokenId()))) &&
            ((this.tokenTransferId==null && other.getTokenTransferId()==null) || 
             (this.tokenTransferId!=null &&
              this.tokenTransferId.equals(other.getTokenTransferId()))) &&
            ((this.createdAtMs==null && other.getCreatedAtMs()==null) || 
             (this.createdAtMs!=null &&
              this.createdAtMs.equals(other.getCreatedAtMs()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount())));
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
        if (getTransactionType() != null) {
            _hashCode += getTransactionType().hashCode();
        }
        if (getTaransactionStatus() != null) {
            _hashCode += getTaransactionStatus().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getTokenId() != null) {
            _hashCode += getTokenId().hashCode();
        }
        if (getTokenTransferId() != null) {
            _hashCode += getTokenTransferId().hashCode();
        }
        if (getCreatedAtMs() != null) {
            _hashCode += getCreatedAtMs().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransactionWs.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.vl.token.com/", "transactionWs"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.vl.token.com/", "transactionTypeWs"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taransactionStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taransactionStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.vl.token.com/", "transactionStatusWs"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tokenId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tokenId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tokenTransferId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tokenTransferId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdAtMs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "createdAtMs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
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
