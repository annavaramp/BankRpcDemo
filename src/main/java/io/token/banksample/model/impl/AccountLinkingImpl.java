package io.token.banksample.model.impl;

import io.token.banksample.model.AccessTokenAuthorization;
import io.token.banksample.model.AccountLinking;
import io.token.proto.banklink.Banklink.BankAuthorization;
import io.token.proto.common.account.AccountProtos.BankAccount;
import io.token.proto.common.account.AccountProtos.BankAccount.Swift;
import io.token.sdk.BankAccountAuthorizer;
import io.token.sdk.NamedAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.token.vl.service.AutherizationServiceWs;
import com.token.vl.service.BankAccountListWs;
import com.token.vl.service.impl.AutherizationServiceImplWsService;
import com.token.vl.service.impl.AutherizationServiceImplWsServiceLocator;

public class AccountLinkingImpl implements AccountLinking {
	private final BankAccountAuthorizer authorizer;
	private final Map<String, AccessTokenAuthorization> authorizations;

	public AccountLinkingImpl(BankAccountAuthorizer authorizer, Map<String, AccessTokenAuthorization> authorizations) {
		this.authorizer = authorizer;
		this.authorizations = authorizations;
	}

	@Override
	public BankAuthorization getBankAuthorization(String accessToken) {
		// AccessTokenAuthorization authorization = authorizations.get(accessToken);
		List<NamedAccount> namedAccountList = new ArrayList<NamedAccount>();

		try {
			BankAuthorization auth = null;
			BankAccountAuthorizer authorizer = null;
			AutherizationServiceImplWsService service = new AutherizationServiceImplWsServiceLocator();
			AutherizationServiceWs authService = service.getAutherizationServiceImplWsPort();
			com.token.vl.service.BankAccountWs accws = authService.getBankAuthorization("Token123");

			for (BankAccountListWs accountws : accws.getAccountList()) {

				NamedAccount namedAccount = new NamedAccount(
						BankAccount.newBuilder()
								.setSwift(Swift.newBuilder().setBic(accountws.getAccounts().getBic())
										.setAccount(accountws.getAccounts().getAccount()).build())
								.build(),
						accountws.getName());
				namedAccountList.add(namedAccount);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return authorizer.createAuthorization("Memeber12", namedAccountList);
	}
}
