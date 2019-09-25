package com.token.vl.service;

public class AccountServiceWsProxy implements com.token.vl.service.AccountServiceWs {
  private String _endpoint = null;
  private com.token.vl.service.AccountServiceWs accountServiceWs = null;
  
  public AccountServiceWsProxy() {
    _initAccountServiceWsProxy();
  }
  
  public AccountServiceWsProxy(String endpoint) {
    _endpoint = endpoint;
    _initAccountServiceWsProxy();
  }
  
  private void _initAccountServiceWsProxy() {
    try {
      accountServiceWs = (new com.token.vl.service.impl.AccountServiceImplWsServiceLocator()).getAccountServiceImplWsPort();
      if (accountServiceWs != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)accountServiceWs)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)accountServiceWs)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (accountServiceWs != null)
      ((javax.xml.rpc.Stub)accountServiceWs)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.token.vl.service.AccountServiceWs getAccountServiceWs() {
    if (accountServiceWs == null)
      _initAccountServiceWsProxy();
    return accountServiceWs;
  }
  
  public com.token.vl.service.BalanceWs getBalance(com.token.vl.service.AccountTypeWs arg0, java.lang.String arg1, java.lang.String arg2) throws java.rmi.RemoteException{
    if (accountServiceWs == null)
      _initAccountServiceWsProxy();
    return accountServiceWs.getBalance(arg0, arg1, arg2);
  }
  
  public com.token.vl.service.TransactionWs getTransaction(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) throws java.rmi.RemoteException{
    if (accountServiceWs == null)
      _initAccountServiceWsProxy();
    return accountServiceWs.getTransaction(arg0, arg1, arg2);
  }
  
  public com.token.vl.service.TransactionWs[] getTransactions(com.token.vl.service.AccountTypeWs arg0, java.lang.String arg1, java.lang.String arg2, int arg3, int arg4) throws java.rmi.RemoteException{
    if (accountServiceWs == null)
      _initAccountServiceWsProxy();
    return accountServiceWs.getTransactions(arg0, arg1, arg2, arg3, arg4);
  }
  
  public com.token.vl.service.BankAccountWs[] resolveTransferDestinations(java.lang.String arg0, java.lang.String arg1, com.token.vl.service.AccountTypeWs arg2) throws java.rmi.RemoteException{
    if (accountServiceWs == null)
      _initAccountServiceWsProxy();
    return accountServiceWs.resolveTransferDestinations(arg0, arg1, arg2);
  }
  
  
}