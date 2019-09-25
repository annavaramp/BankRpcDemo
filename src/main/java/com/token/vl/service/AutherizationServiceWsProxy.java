package com.token.vl.service;

public class AutherizationServiceWsProxy implements com.token.vl.service.AutherizationServiceWs {
  private String _endpoint = null;
  private com.token.vl.service.AutherizationServiceWs autherizationServiceWs = null;
  
  public AutherizationServiceWsProxy() {
    _initAutherizationServiceWsProxy();
  }
  
  public AutherizationServiceWsProxy(String endpoint) {
    _endpoint = endpoint;
    _initAutherizationServiceWsProxy();
  }
  
  private void _initAutherizationServiceWsProxy() {
    try {
      autherizationServiceWs = (new com.token.vl.service.impl.AutherizationServiceImplWsServiceLocator()).getAutherizationServiceImplWsPort();
      if (autherizationServiceWs != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)autherizationServiceWs)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)autherizationServiceWs)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (autherizationServiceWs != null)
      ((javax.xml.rpc.Stub)autherizationServiceWs)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.token.vl.service.AutherizationServiceWs getAutherizationServiceWs() {
    if (autherizationServiceWs == null)
      _initAutherizationServiceWsProxy();
    return autherizationServiceWs;
  }
  
  public com.token.vl.service.BankAccountWs getBankAuthorization(java.lang.String arg0) throws java.rmi.RemoteException{
    if (autherizationServiceWs == null)
      _initAutherizationServiceWsProxy();
    return autherizationServiceWs.getBankAuthorization(arg0);
  }
  
  
}