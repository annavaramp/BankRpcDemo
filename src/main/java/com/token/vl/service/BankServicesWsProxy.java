package com.token.vl.service;

public class BankServicesWsProxy implements com.token.vl.service.BankServicesWs {
  private String _endpoint = null;
  private com.token.vl.service.BankServicesWs bankServicesWs = null;
  
  public BankServicesWsProxy() {
    _initBankServicesWsProxy();
  }
  
  public BankServicesWsProxy(String endpoint) {
    _endpoint = endpoint;
    _initBankServicesWsProxy();
  }
  
  private void _initBankServicesWsProxy() {
    try {
      bankServicesWs = (new com.token.vl.service.impl.BankDeatilsServicesImplWsServiceLocator()).getBankDeatilsServicesImplWsPort();
      if (bankServicesWs != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)bankServicesWs)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)bankServicesWs)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (bankServicesWs != null)
      ((javax.xml.rpc.Stub)bankServicesWs)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.token.vl.service.BankServicesWs getBankServicesWs() {
    if (bankServicesWs == null)
      _initBankServicesWsProxy();
    return bankServicesWs;
  }
  
  public com.token.vl.service.AccountDetailsWs getAccountDetails(java.lang.String arg0, java.lang.String arg1, com.token.vl.service.AccountTypeWs arg2) throws java.rmi.RemoteException{
    if (bankServicesWs == null)
      _initBankServicesWsProxy();
    return bankServicesWs.getAccountDetails(arg0, arg1, arg2);
  }
  
  
}