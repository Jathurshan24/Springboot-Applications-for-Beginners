package com.nutpam.localconfig.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class RentApplicationLocalConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(RentApplicationLocalConfigApplication.class, args);
		System.out.println("Config server has been started..!");
	}

}
