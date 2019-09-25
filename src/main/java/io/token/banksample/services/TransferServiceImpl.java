package io.token.banksample.services;

import static io.token.proto.bankapi.Bankapi.StatusCode.FAILURE_GENERIC;
import static io.token.proto.bankapi.Bankapi.StatusCode.FAILURE_INSUFFICIENT_FUNDS;
import static io.token.proto.bankapi.Bankapi.StatusCode.FAILURE_INVALID_CURRENCY;
import static io.token.proto.common.transaction.TransactionProtos.TransactionType.DEBIT;
import static java.lang.String.join;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import com.token.vl.service.BankAccountWs;
import com.token.vl.service.TransferServiceWs;
import com.token.vl.service.TransferWs;
import com.token.vl.service.impl.TransferServiceImplWsService;
import com.token.vl.service.impl.TransferServiceImplWsServiceLocator;

import io.token.banksample.model.AccountTransaction;
import io.token.banksample.model.Accounting;
import io.token.sdk.api.Balance;
import io.token.sdk.api.Transfer;
import io.token.sdk.api.TransferException;
import io.token.sdk.api.service.TransferService;

/**
 * Sample implementation of the {@link TransferService}. Returns fake data.
 */
public class TransferServiceImpl implements TransferService {
	private final Accounting accounts;

	TransferServiceImplWsService transferService = new TransferServiceImplWsServiceLocator();

	public TransferServiceImpl(Accounting accounts) {
		this.accounts = accounts;
	}

	@Override
	public String transfer(Transfer transfer) throws TransferException {

		String transactionId = "";
		try {
			TransferServiceWs transferws = transferService.getTransferServiceImplWsPort();
			BankAccountWs bankDetails = new BankAccountWs();
			TransferWs transferWs = new TransferWs();
			transactionId = transferws.transfer("tras123", 2300.00, 2300.00, bankDetails, bankDetails);

		} catch (ServiceException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}

		/*
		 * Balance balance = accounts.lookupBalance(transfer.getAccount()).orElseThrow(
		 * () -> new TransferException(FAILURE_GENERIC, "Account not found: " +
		 * transfer.getAccount()));
		 * 
		 * if (!balance.getCurrency().equals(transfer.getRequestedAmountCurrency())) {
		 * throw new TransferException(FAILURE_INVALID_CURRENCY, "FX is not supported");
		 * }
		 * 
		 * if (balance.getAvailable().compareTo(transfer.getTransactionAmount()) < 0) {
		 * throw new TransferException(FAILURE_INSUFFICIENT_FUNDS, "Balance exceeded");
		 * }
		 * 
		 * AccountTransaction transaction = AccountTransaction.builder(DEBIT)
		 * .id(join(":", transfer.getTokenTransferId(), DEBIT.name().toLowerCase()))
		 * .referenceId(transfer.getTokenTransferId()).from(transfer.getAccount())
		 * .to(transfer.getDestinations().get(0).getAccount())
		 * .amount(transfer.getTransactionAmount().doubleValue(),
		 * transfer.getTransactionAmountCurrency())
		 * .transferAmount(transfer.getTransactionAmount().doubleValue(),
		 * transfer.getTransactionAmountCurrency())
		 * .description(transfer.getDescription()).build();
		 * accounts.createDebitTransaction(transaction);
		 */

		// A bank needs to initiate a transfer here. Leaving this part out
		// since it changes from scheme to scheme.

		// return transaction.getId();

		return transactionId;
	}
}
