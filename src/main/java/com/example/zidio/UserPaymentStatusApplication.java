package com.example.zidio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient 
public class UserPaymentStatusApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserPaymentStatusApplication.class, args);
	}
}
