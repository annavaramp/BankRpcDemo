/**
 * AccountServiceImplWsServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.token.vl.service.impl;

public class AccountServiceImplWsServiceLocator extends org.apache.axis.client.Service implements com.token.vl.service.impl.AccountServiceImplWsService {

    public AccountServiceImplWsServiceLocator() {
    }


    public AccountServiceImplWsServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AccountServiceImplWsServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AccountServiceImplWsPort
    private java.lang.String AccountServiceImplWsPort_address = "http://localhost:8080/BankAppSoapWebServices/AccountServiceImplWs";

    public java.lang.String getAccountServiceImplWsPortAddress() {
        return AccountServiceImplWsPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AccountServiceImplWsPortWSDDServiceName = "AccountServiceImplWsPort";

    public java.lang.String getAccountServiceImplWsPortWSDDServiceName() {
        return AccountServiceImplWsPortWSDDServiceName;
    }

    public void setAccountServiceImplWsPortWSDDServiceName(java.lang.String name) {
        AccountServiceImplWsPortWSDDServiceName = name;
    }

    public com.token.vl.service.AccountServiceWs getAccountServiceImplWsPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AccountServiceImplWsPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAccountServiceImplWsPort(endpoint);
    }

    public com.token.vl.service.AccountServiceWs getAccountServiceImplWsPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.token.vl.service.impl.AccountServiceImplWsServiceSoapBindingStub _stub = new com.token.vl.service.impl.AccountServiceImplWsServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getAccountServiceImplWsPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAccountServiceImplWsPortEndpointAddress(java.lang.String address) {
        AccountServiceImplWsPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.token.vl.service.AccountServiceWs.class.isAssignableFrom(serviceEndpointInterface)) {
                com.token.vl.service.impl.AccountServiceImplWsServiceSoapBindingStub _stub = new com.token.vl.service.impl.AccountServiceImplWsServiceSoapBindingStub(new java.net.URL(AccountServiceImplWsPort_address), this);
                _stub.setPortName(getAccountServiceImplWsPortWSDDServiceName());
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
        if ("AccountServiceImplWsPort".equals(inputPortName)) {
            return getAccountServiceImplWsPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://impl.service.vl.token.com/", "AccountServiceImplWsService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://impl.service.vl.token.com/", "AccountServiceImplWsPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AccountServiceImplWsPort".equals(portName)) {
            setAccountServiceImplWsPortEndpointAddress(address);
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
