package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCloudConfigConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigConsumerApplication.class, args);
		System.out.println("Config client has been started..!");
	}

}
