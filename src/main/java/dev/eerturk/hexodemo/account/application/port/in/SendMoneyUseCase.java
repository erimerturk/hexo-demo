package dev.eerturk.hexodemo.account.application.port.in;


public interface SendMoneyUseCase {

    boolean sendMoney(SendMoneyCommand command);

}