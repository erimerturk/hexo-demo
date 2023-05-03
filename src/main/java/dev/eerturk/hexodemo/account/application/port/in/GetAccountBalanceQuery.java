package dev.eerturk.hexodemo.account.application.port.in;

import dev.eerturk.hexodemo.account.domain.Account;
import dev.eerturk.hexodemo.account.domain.Money;

public interface GetAccountBalanceQuery {

    Money getAccountBalance(Account.AccountId accountId);

}
