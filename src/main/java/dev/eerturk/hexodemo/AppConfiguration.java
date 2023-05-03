package dev.eerturk.hexodemo;

import dev.eerturk.hexodemo.account.application.service.MoneyTransferProperties;
import dev.eerturk.hexodemo.account.domain.Money;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(AppConfigurationProperties.class)
public class AppConfiguration {

    @Bean
    public MoneyTransferProperties moneyTransferProperties(AppConfigurationProperties properties){
        return new MoneyTransferProperties(Money.of(properties.getTransferThreshold()));
    }

}
