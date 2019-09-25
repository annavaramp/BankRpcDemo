package com.token.vl.service;

public class TransferServiceWsProxy implements com.token.vl.service.TransferServiceWs {
  private String _endpoint = null;
  private com.token.vl.service.TransferServiceWs transferServiceWs = null;
  
  public TransferServiceWsProxy() {
    _initTransferServiceWsProxy();
  }
  
  public TransferServiceWsProxy(String endpoint) {
    _endpoint = endpoint;
    _initTransferServiceWsProxy();
  }
  
  private void _initTransferServiceWsProxy() {
    try {
      transferServiceWs = (new com.token.vl.service.impl.TransferServiceImplWsServiceLocator()).getTransferServiceImplWsPort();
      if (transferServiceWs != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)transferServiceWs)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)transferServiceWs)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (transferServiceWs != null)
      ((javax.xml.rpc.Stub)transferServiceWs)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.token.vl.service.TransferServiceWs getTransferServiceWs() {
    if (transferServiceWs == null)
      _initTransferServiceWsProxy();
    return transferServiceWs;
  }
  
  public java.lang.String transfer(java.lang.String arg0, double arg1, double arg2, com.token.vl.service.BankAccountWs arg3, com.token.vl.service.BankAccountWs arg4) throws java.rmi.RemoteException{
    if (transferServiceWs == null)
      _initTransferServiceWsProxy();
    return transferServiceWs.transfer(arg0, arg1, arg2, arg3, arg4);
  }
  
  
}