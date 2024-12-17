package com.techarch.accountsmicser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@ComponentScan(basePackages = {"com.techarch.accountsmicser"})

public class AccountsmicserApplication {


	public static void main(String[] args) {
		SpringApplication.run(AccountsmicserApplication.class, args);
	}

}

