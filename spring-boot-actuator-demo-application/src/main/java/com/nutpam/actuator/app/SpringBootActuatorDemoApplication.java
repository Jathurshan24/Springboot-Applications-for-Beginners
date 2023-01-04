package com.nutpam.actuator.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootActuatorDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootActuatorDemoApplication.class, args);
		System.out.println("Actuator Demo Application has been Started..!");
	}

}
