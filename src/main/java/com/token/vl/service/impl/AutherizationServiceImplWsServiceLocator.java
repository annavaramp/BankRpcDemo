/**
 * AutherizationServiceImplWsServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.token.vl.service.impl;

public class AutherizationServiceImplWsServiceLocator extends org.apache.axis.client.Service implements com.token.vl.service.impl.AutherizationServiceImplWsService {

    public AutherizationServiceImplWsServiceLocator() {
    }


    public AutherizationServiceImplWsServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AutherizationServiceImplWsServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AutherizationServiceImplWsPort
    private java.lang.String AutherizationServiceImplWsPort_address = "http://localhost:8080/BankAppSoapWebServices/AutherizationServiceImplWs";

    public java.lang.String getAutherizationServiceImplWsPortAddress() {
        return AutherizationServiceImplWsPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AutherizationServiceImplWsPortWSDDServiceName = "AutherizationServiceImplWsPort";

    public java.lang.String getAutherizationServiceImplWsPortWSDDServiceName() {
        return AutherizationServiceImplWsPortWSDDServiceName;
    }

    public void setAutherizationServiceImplWsPortWSDDServiceName(java.lang.String name) {
        AutherizationServiceImplWsPortWSDDServiceName = name;
    }

    public com.token.vl.service.AutherizationServiceWs getAutherizationServiceImplWsPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AutherizationServiceImplWsPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAutherizationServiceImplWsPort(endpoint);
    }

    public com.token.vl.service.AutherizationServiceWs getAutherizationServiceImplWsPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.token.vl.service.impl.AutherizationServiceImplWsServiceSoapBindingStub _stub = new com.token.vl.service.impl.AutherizationServiceImplWsServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getAutherizationServiceImplWsPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAutherizationServiceImplWsPortEndpointAddress(java.lang.String address) {
        AutherizationServiceImplWsPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.token.vl.service.AutherizationServiceWs.class.isAssignableFrom(serviceEndpointInterface)) {
                com.token.vl.service.impl.AutherizationServiceImplWsServiceSoapBindingStub _stub = new com.token.vl.service.impl.AutherizationServiceImplWsServiceSoapBindingStub(new java.net.URL(AutherizationServiceImplWsPort_address), this);
                _stub.setPortName(getAutherizationServiceImplWsPortWSDDServiceName());
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
        if ("AutherizationServiceImplWsPort".equals(inputPortName)) {
            return getAutherizationServiceImplWsPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://impl.service.vl.token.com/", "AutherizationServiceImplWsService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://impl.service.vl.token.com/", "AutherizationServiceImplWsPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AutherizationServiceImplWsPort".equals(portName)) {
            setAutherizationServiceImplWsPortEndpointAddress(address);
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
