/**
 * TransferServiceImplWsServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.token.vl.service.impl;

public class TransferServiceImplWsServiceLocator extends org.apache.axis.client.Service implements com.token.vl.service.impl.TransferServiceImplWsService {

    public TransferServiceImplWsServiceLocator() {
    }


    public TransferServiceImplWsServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public TransferServiceImplWsServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for TransferServiceImplWsPort
    private java.lang.String TransferServiceImplWsPort_address = "http://localhost:8080/BankAppSoapWebServices/TransferServiceImplWs";

    public java.lang.String getTransferServiceImplWsPortAddress() {
        return TransferServiceImplWsPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String TransferServiceImplWsPortWSDDServiceName = "TransferServiceImplWsPort";

    public java.lang.String getTransferServiceImplWsPortWSDDServiceName() {
        return TransferServiceImplWsPortWSDDServiceName;
    }

    public void setTransferServiceImplWsPortWSDDServiceName(java.lang.String name) {
        TransferServiceImplWsPortWSDDServiceName = name;
    }

    public com.token.vl.service.TransferServiceWs getTransferServiceImplWsPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(TransferServiceImplWsPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getTransferServiceImplWsPort(endpoint);
    }

    public com.token.vl.service.TransferServiceWs getTransferServiceImplWsPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.token.vl.service.impl.TransferServiceImplWsServiceSoapBindingStub _stub = new com.token.vl.service.impl.TransferServiceImplWsServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getTransferServiceImplWsPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setTransferServiceImplWsPortEndpointAddress(java.lang.String address) {
        TransferServiceImplWsPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.token.vl.service.TransferServiceWs.class.isAssignableFrom(serviceEndpointInterface)) {
                com.token.vl.service.impl.TransferServiceImplWsServiceSoapBindingStub _stub = new com.token.vl.service.impl.TransferServiceImplWsServiceSoapBindingStub(new java.net.URL(TransferServiceImplWsPort_address), this);
                _stub.setPortName(getTransferServiceImplWsPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("TransferServiceImplWsPort".equals(inputPortName)) {
            return getTransferServiceImplWsPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://impl.service.vl.token.com/", "TransferServiceImplWsService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://impl.service.vl.token.com/", "TransferServiceImplWsPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("TransferServiceImplWsPort".equals(portName)) {
            setTransferServiceImplWsPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
