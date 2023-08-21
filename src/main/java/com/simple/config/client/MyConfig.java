package com.simple.config.client;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@Getter
@Setter
@ConfigurationProperties(prefix = "com.simple")
@RefreshScope
@ToString
public class MyConfig {
    private String profile;
    private String region;
}
