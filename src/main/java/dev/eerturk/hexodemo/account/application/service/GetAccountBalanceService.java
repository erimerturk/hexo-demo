package dev.eerturk.hexodemo.account.application.service;

import dev.eerturk.hexodemo.account.application.port.in.GetAccountBalanceQuery;
import dev.eerturk.hexodemo.account.application.port.out.LoadAccountPort;
import dev.eerturk.hexodemo.account.domain.Account;
import dev.eerturk.hexodemo.account.domain.Money;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@RequiredArgsConstructor
class GetAccountBalanceService implements GetAccountBalanceQuery {

    private final LoadAccountPort loadAccountPort;

    @Override
    public Money getAccountBalance(Account.AccountId accountId) {
        return loadAccountPort.loadAccount(accountId, LocalDateTime.now())
                .calculateBalance();
    }
}
