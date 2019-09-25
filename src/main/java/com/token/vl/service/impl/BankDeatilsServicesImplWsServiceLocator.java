/**
 * BankDeatilsServicesImplWsServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.token.vl.service.impl;

public class BankDeatilsServicesImplWsServiceLocator extends org.apache.axis.client.Service implements com.token.vl.service.impl.BankDeatilsServicesImplWsService {

    public BankDeatilsServicesImplWsServiceLocator() {
    }


    public BankDeatilsServicesImplWsServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public BankDeatilsServicesImplWsServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BankDeatilsServicesImplWsPort
    private java.lang.String BankDeatilsServicesImplWsPort_address = "http://localhost:8080/BankAppSoapWebServices/BankDeatilsServicesImplWs";

    public java.lang.String getBankDeatilsServicesImplWsPortAddress() {
        return BankDeatilsServicesImplWsPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BankDeatilsServicesImplWsPortWSDDServiceName = "BankDeatilsServicesImplWsPort";

    public java.lang.String getBankDeatilsServicesImplWsPortWSDDServiceName() {
        return BankDeatilsServicesImplWsPortWSDDServiceName;
    }

    public void setBankDeatilsServicesImplWsPortWSDDServiceName(java.lang.String name) {
        BankDeatilsServicesImplWsPortWSDDServiceName = name;
    }

    public com.token.vl.service.BankServicesWs getBankDeatilsServicesImplWsPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BankDeatilsServicesImplWsPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBankDeatilsServicesImplWsPort(endpoint);
    }

    public com.token.vl.service.BankServicesWs getBankDeatilsServicesImplWsPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.token.vl.service.impl.BankDeatilsServicesImplWsServiceSoapBindingStub _stub = new com.token.vl.service.impl.BankDeatilsServicesImplWsServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getBankDeatilsServicesImplWsPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBankDeatilsServicesImplWsPortEndpointAddress(java.lang.String address) {
        BankDeatilsServicesImplWsPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.token.vl.service.BankServicesWs.class.isAssignableFrom(serviceEndpointInterface)) {
                com.token.vl.service.impl.BankDeatilsServicesImplWsServiceSoapBindingStub _stub = new com.token.vl.service.impl.BankDeatilsServicesImplWsServiceSoapBindingStub(new java.net.URL(BankDeatilsServicesImplWsPort_address), this);
                _stub.setPortName(getBankDeatilsServicesImplWsPortWSDDServiceName());
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
        if ("BankDeatilsServicesImplWsPort".equals(inputPortName)) {
            return getBankDeatilsServicesImplWsPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://impl.service.vl.token.com/", "BankDeatilsServicesImplWsService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://impl.service.vl.token.com/", "BankDeatilsServicesImplWsPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BankDeatilsServicesImplWsPort".equals(portName)) {
            setBankDeatilsServicesImplWsPortEndpointAddress(address);
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
