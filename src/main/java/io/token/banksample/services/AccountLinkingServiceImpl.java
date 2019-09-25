package io.token.banksample.services;

import io.token.banksample.model.AccessTokenAuthorization;
import io.token.banksample.model.AccountLinking;
import io.token.proto.ProtoJson;
import io.token.proto.banklink.Banklink.BankAuthorization;
import io.token.proto.common.account.AccountProtos.BankAccount;
import io.token.proto.common.account.AccountProtos.PlaintextBankAuthorization;
import io.token.proto.common.account.AccountProtos.BankAccount.Swift;
import io.token.proto.common.security.SecurityProtos.SealedMessage;
import io.token.sdk.BankAccountAuthorizer;
import io.token.sdk.NamedAccount;
import io.token.sdk.api.service.AccountLinkingService;
import io.token.security.SecretKeyStore;
import io.token.security.TrustedKeyStore;
import io.token.security.keystore.KeyStoreFactory;

import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.token.vl.service.AutherizationServiceWs;
import com.token.vl.service.BankAccountListWs;
import com.token.vl.service.impl.AutherizationServiceImplWsService;
import com.token.vl.service.impl.AutherizationServiceImplWsServiceLocator;
import com.token.vl.vo.BankAccountWs;

public class AccountLinkingServiceImpl implements AccountLinkingService {
	private final AccountLinking accountLinking;

	public AccountLinkingServiceImpl(AccountLinking accountLinking) {
		this.accountLinking = accountLinking;
	}

	@Override
	public BankAuthorization getBankAuthorization(String accessToken) {

		/*
		 * BankAuthorization auth = null; BankAccountAuthorizer authorizer = null;
		 * AutherizationServiceImplWsService service = new
		 * AutherizationServiceImplWsServiceLocator();
		 * 
		 * try {
		 * 
		 * 
		 * 
		 * List<SealedMessage> authorizations = (List<SealedMessage>)
		 * namedAccountList.stream() .map(account ->
		 * PlaintextBankAuthorization.newBuilder().setMemberId("Memeber123")
		 * .setAccount(account.getBankAccount()).setAccountName(account.getDisplayName()
		 * ).build());
		 * 
		 * // accountLinking.getBankAuthorization("token2"); auth =
		 * BankAuthorization.newBuilder().setBankId("UNIOON12").addAllAccounts(
		 * authorizations).build();
		 * 
		 * 
		 * 
		 * } catch (Exception e) {
		 * 
		 * e.printStackTrace(); }
		 * 
		 * return auth;
		 */

		return accountLinking.getBankAuthorization("Token123");
	}
}
