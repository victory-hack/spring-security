package com.javasampleapproach.springsecurity.authenticationhandler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringSecurityCustomizeAuthenticationSuccessHandlerApplication {

	public static final String USE_HAZELCAST = "true";
	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityCustomizeAuthenticationSuccessHandlerApplication.class, args);
	}
}
