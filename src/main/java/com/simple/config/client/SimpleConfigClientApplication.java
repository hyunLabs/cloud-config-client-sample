package com.simple.config.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableConfigurationProperties(MyConfig.class)
@EnableScheduling
public class SimpleConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleConfigClientApplication.class, args);
	}

}
