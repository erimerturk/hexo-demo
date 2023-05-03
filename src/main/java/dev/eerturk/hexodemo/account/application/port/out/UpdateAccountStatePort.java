package dev.eerturk.hexodemo.account.application.port.out;

import dev.eerturk.hexodemo.account.domain.Account;

public interface UpdateAccountStatePort {

    void updateActivities(Account account);

}
