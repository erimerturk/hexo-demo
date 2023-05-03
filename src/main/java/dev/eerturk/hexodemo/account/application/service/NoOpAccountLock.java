package dev.eerturk.hexodemo.account.application.service;

import dev.eerturk.hexodemo.account.application.port.out.AccountLock;
import dev.eerturk.hexodemo.account.domain.Account;
import org.springframework.stereotype.Component;

@Component
class NoOpAccountLock implements AccountLock {

    @Override
    public void lockAccount(Account.AccountId accountId) {
        // do nothing
    }

    @Override
    public void releaseAccount(Account.AccountId accountId) {
        // do nothing
    }

}
