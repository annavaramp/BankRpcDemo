/**
 * AccountServiceWs.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.token.vl.service;

public interface AccountServiceWs extends java.rmi.Remote {
    public com.token.vl.service.BalanceWs getBalance(com.token.vl.service.AccountTypeWs arg0, java.lang.String arg1, java.lang.String arg2) throws java.rmi.RemoteException;
    public com.token.vl.service.TransactionWs getTransaction(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) throws java.rmi.RemoteException;
    public com.token.vl.service.TransactionWs[] getTransactions(com.token.vl.service.AccountTypeWs arg0, java.lang.String arg1, java.lang.String arg2, int arg3, int arg4) throws java.rmi.RemoteException;
    public com.token.vl.service.BankAccountWs[] resolveTransferDestinations(java.lang.String arg0, java.lang.String arg1, com.token.vl.service.AccountTypeWs arg2) throws java.rmi.RemoteException;
}
