package dev.eerturk.hexodemo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;


@Data
@ConfigurationProperties(prefix = "app")
public class AppConfigurationProperties {

    private long transferThreshold = Long.MAX_VALUE;

}
