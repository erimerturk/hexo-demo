package dev.eerturk.hexodemo.account.application.port.out;

import dev.eerturk.hexodemo.account.domain.Account;

import java.time.LocalDateTime;

public interface LoadAccountPort {

    Account loadAccount(Account.AccountId accountId, LocalDateTime baselineDate);
}
