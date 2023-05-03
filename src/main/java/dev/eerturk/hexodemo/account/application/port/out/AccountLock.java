package dev.eerturk.hexodemo.account.application.port.out;

import dev.eerturk.hexodemo.account.domain.Account;

public interface AccountLock {

    void lockAccount(Account.AccountId accountId);

    void releaseAccount(Account.AccountId accountId);

}
