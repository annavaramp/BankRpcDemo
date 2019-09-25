package io.token.banksample.services;

import static io.token.proto.bankapi.Bankapi.StatusCode.FAILURE_ACCOUNT_NOT_FOUND;
import static java.util.stream.Collectors.toList;

import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.time.Instant;

import io.token.banksample.config.AccountConfig;
import io.token.banksample.model.AccountTransaction;
import io.token.banksample.model.Accounting;
import io.token.proto.PagedList;
import io.token.proto.common.account.AccountProtos.AccountDetails;
import io.token.proto.common.account.AccountProtos.AccountDetails.AccountType;
import io.token.proto.common.account.AccountProtos.BankAccount;
import io.token.proto.common.account.AccountProtos.BankAccount.Swift;
import io.token.proto.common.address.AddressProtos.Address;
import io.token.proto.common.money.MoneyProtos;
import io.token.proto.common.money.MoneyProtos.Money;
import io.token.proto.common.providerspecific.ProviderSpecific.Cma9AccountDetails;
import io.token.proto.common.providerspecific.ProviderSpecific.Cma9AccountDetails.PartyType;
import io.token.proto.common.providerspecific.ProviderSpecific.ProviderAccountDetails;
import io.token.proto.common.transaction.TransactionProtos.Balance.TypedBalance;
import io.token.proto.common.transaction.TransactionProtos.Transaction;
import io.token.proto.common.transaction.TransactionProtos.TransactionStatus;
import io.token.proto.common.transaction.TransactionProtos.TransactionType;
import io.token.proto.common.transferinstructions.TransferInstructionsProtos.CustomerData;
import io.token.proto.common.transferinstructions.TransferInstructionsProtos.TransferEndpoint;
import io.token.sdk.api.Balance;
import io.token.sdk.api.BankException;
import io.token.sdk.api.service.AccountService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.xml.namespace.QName;
import javax.xml.rpc.Service;
import javax.xml.rpc.ServiceException;
import javax.xml.rpc.ServiceFactory;

import org.apache.axis.AxisFault;

import com.token.vl.service.AccountDetailsWs;
import com.token.vl.service.AccountServiceWs;
import com.token.vl.service.BalanceWs;
import com.token.vl.service.BankAccountWs;
import com.token.vl.service.BankServicesWs;
import com.token.vl.service.TransactionWs;
import com.token.vl.service.impl.AccountServiceImplWsService;
import com.token.vl.service.impl.AccountServiceImplWsServiceLocator;
import com.token.vl.service.impl.AccountServiceImplWsServiceSoapBindingStub;
import com.token.vl.service.impl.BankDeatilsServicesImplWsService;
import com.token.vl.service.impl.BankDeatilsServicesImplWsServiceLocator;
import com.token.vl.type.AccountTypeWs;
import com.token.vl.vo.CustomerWs;

/**
 * Sample implementation of the {@link AccountService}. Returns fake data.
 */
public class AccountServiceImpl implements AccountService {
	private final Accounting accounts;
	AccountServiceImplWsService accsountService = new AccountServiceImplWsServiceLocator();

	public AccountServiceImpl(Accounting accounts) {
		this.accounts = accounts;
	}

	@Override
	public Balance getBalance(BankAccount account) {

		Balance balance = null;

		try {
			AccountServiceWs accountServiceWs = accsountService.getAccountServiceImplWsPort();
			BankAccountWs bankAccountWs = new BankAccountWs();
			bankAccountWs.setBank_id(account.getBank().getBankId());
			BalanceWs balanceWs = accountServiceWs.getBalance(com.token.vl.service.AccountTypeWs.SAVINGS, "ACCiD123",
					"BANKID1234");

			balance = Balance.create(balanceWs.getCurrent_balance().getCurrency(),
					BigDecimal.valueOf(balanceWs.getCurrent_balance().getValue()),
					BigDecimal.valueOf(balanceWs.getCurrent_balance().getValue()), Instant.now().toEpochMilli(),
					new ArrayList<TypedBalance>());

		} catch (ServiceException | RemoteException e) {
			e.printStackTrace();
		}

		return balance;

	}

	@Override
	public Optional<Transaction> getTransaction(BankAccount account, String transactionId) {

		// Optional<Transaction> option =Optional.ofNullable(Transaction);
		TransactionWs transactionws = new TransactionWs();
		try {

			AccountServiceWs accountServiceWs = accsountService.getAccountServiceImplWsPort();
			BankAccountWs bankAccountWs = new BankAccountWs();

			transactionws = accountServiceWs.getTransaction("ACCID123", "BANKID123", "transactionId23");
		} catch (Exception e) {
			e.printStackTrace();
		}
		Transaction transaction = Transaction.newBuilder().setId(String.valueOf(transactionws.getId()))
				.setTokenId(transactionws.getTokenId()).setTokenTransferId(transactionws.getTokenTransferId())
				.setCreatedAtMs(Instant.now().getEpochSecond()).setDescription(transactionws.getDescription())
				.setType(TransactionType.valueOf(transactionws.getTransactionType().toString()))
				.setStatus(TransactionStatus.valueOf(transactionws.getTaransactionStatus().toString()))
				.setAmount(MoneyProtos.Money.newBuilder().setCurrency(transactionws.getAmount().getCurrency())
						.setValue(String.valueOf(transactionws.getAmount().getValue())).build())
				.build();
		Optional<Transaction> transaction2 = Optional.of(transaction);

		return transaction2;

	}

	@Override
	public PagedList<Transaction, String> getTransactions(BankAccount account, String cursor, int limit) {

		List<Transaction> transactions = new ArrayList<Transaction>();
		Transaction transaction = null;

		int offset = decodeCursor(cursor);
		try {

			AccountServiceWs accountServiceWs = accsountService.getAccountServiceImplWsPort();
			BankAccountWs bankAccountWs = new BankAccountWs();
			TransactionWs transactionws = new TransactionWs();
			TransactionWs[] transactionsws = accountServiceWs
					.getTransactions(com.token.vl.service.AccountTypeWs.SAVINGS, "ACCiD123", "BANKID1234", 2, 23);

			for (TransactionWs tr : transactionsws) {
				transaction = Transaction.newBuilder().setId(String.valueOf(tr.getId())).setTokenId(tr.getTokenId())
						.setTokenTransferId(tr.getTokenTransferId()).setCreatedAtMs(Instant.now().getEpochSecond())
						.setDescription(tr.getDescription())
						.setType(TransactionType.valueOf(tr.getTransactionType().toString()))
						.setStatus(TransactionStatus.valueOf(tr.getTaransactionStatus().toString()))
						.setAmount(MoneyProtos.Money.newBuilder().setCurrency(tr.getAmount().getCurrency())
								.setValue(String.valueOf(tr.getAmount().getValue())).build())
						.build();

				transactions.add(transaction);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return PagedList.create(transactions, encodeCursor(offset + transactions.size()));
	}

	@Override
	public List<TransferEndpoint> resolveTransferDestination(BankAccount bankAccount) {

		List<TransferEndpoint> destinations = new ArrayList<>();

		try {

			AccountServiceWs accountServiceWs = accsountService.getAccountServiceImplWsPort();
			BankAccountWs bankAccountWs = new BankAccountWs();

			bankAccountWs.setBank_id(bankAccount.getSwift().getBic());
			bankAccountWs.setAccoutnId(Long.parseLong(bankAccount.getSwift().getAccount()));
			BankAccountWs[] accountsws = accountServiceWs.resolveTransferDestinations("ACCID123", "BANKID123",
					com.token.vl.service.AccountTypeWs.SAVINGS);

			for (BankAccountWs accws : accountsws) {

				BankAccount acnt = BankAccount.getDefaultInstance();
				destinations.add(TransferEndpoint.newBuilder()
						.setAccount(BankAccount.newBuilder()
								.setSwift(Swift.newBuilder().setBic(accws.getBank_id())
										.setAccount(String.valueOf(accws.getAccoutnId())).build()))
						.setCustomerData(CustomerData.newBuilder().addLegalNames(accws.getCustomer().getName())
								.setAddress(Address.newBuilder().setCity(accws.getCustomer().getAddress().getCity())
										.setCountry(accws.getCustomer().getAddress().getCountry())))
						.build());
			}

			/*
			 * AccountConfig account = accounts.lookupAccount(bankAccount) .orElseThrow(()
			 * -> new BankException(FAILURE_ACCOUNT_NOT_FOUND, "Account not found"));
			 * CustomerData customerData = CustomerData.newBuilder() // Append to list of
			 * account holder names. // It's a list because there might be more than // one,
			 * e.g., for a joint account. // (Config test data doesn't have any joint
			 * accounts.)
			 * .addLegalNames(account.getName()).setAddress(account.getAddress()).build();
			 * 
			 * 
			 * destinations.add(TransferEndpoint.newBuilder().setAccount(bankAccount) //
			 * Customer data should be provided if the transfer method requires additional
			 * // information about the beneficiary, e.g., legal name).
			 * .setCustomerData(customerData).build());
			 */
		} catch (Exception e) {
			e.printStackTrace();
		}

		// For a bank that supports more than one way to transfer,
		// this list would have more than one item.
		// This simple sample only does Swift. But a bank
		// that supports other transfer-methods can return more:
		// switch (bankAccount.getAccountCase()) {
		// case SWIFT: {
		// BankAccount otherAccount = BankAccount
		// .newBuilder().
		// .setSepa(Sepa.newBuilder() ...)
		// .build();
		// destinations.add(otherAccount);
		// }
		// case SEPA: {
		// BankAccount otherAccount = BankAccount
		// .newBuilder()
		// .setSwift(Swift.newBuilder() ...)
		// .build();
		// destinations.add(otherAccount);
		// }
		// }

		return destinations;
	}

	private int decodeCursor(String encoded) {
		if (encoded.isEmpty()) {
			// An empty cursor indicates paging should begin at the start.
			return 0;
		} else {
			// Parse the cursor. The format of the string is up to the bank and is opaque to
			// Token.
			return Integer.parseInt(encoded);
		}
	}

	private String encodeCursor(int offset) {
		// Encode the cursor to return in the PagedList. This value will be passed into
		// getTransactions in subsequent requests.
		//
		// The format of the string is up to the bank and is opaque to Token; in this
		// case we are
		// just using the string value of the cursor's position in the transaction list.
		return String.valueOf(offset);
	}

	@Override
	public AccountDetails getAccountDetails(BankAccount account) {

		AccountDetails accdetails = null;
		BankDeatilsServicesImplWsService bankServiceImpl = new BankDeatilsServicesImplWsServiceLocator();
		try {
			BankServicesWs bankSerivcePort = bankServiceImpl.getBankDeatilsServicesImplWsPort();
			AccountDetailsWs acdetailsws = bankSerivcePort.getAccountDetails("", "",
					com.token.vl.service.AccountTypeWs.SAVINGS);
			accdetails = AccountDetails.newBuilder().setIdentifier(acdetailsws.getIdentifier())
					.setType(AccountType.valueOf(acdetailsws.getAccountType().toString()))
					.setStatus(acdetailsws.getStatus())
					.setProviderSpecific(ProviderAccountDetails.newBuilder()
							.setCma9AccountDetails(Cma9AccountDetails.newBuilder().setPartyId("PartyId123")
									.setPartyNumber("PartyNumber12").setPartyType(PartyType.INVALID_PARTY_TYPE)
									.setName("Annavaram").setEmailAddress("Annavaram.p@").build())
							.build())
					.build();
			System.out.println("Account Deatils fetched Succesfully");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return accdetails;
	}
}
