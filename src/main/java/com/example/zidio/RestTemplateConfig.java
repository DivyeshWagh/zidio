package com.example.zidio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {

	 @Bean
	    public RestTemplate restTemplate() { // Method should return RestTemplate
	        return new RestTemplate(); // Create and return a new RestTemplate instance
	    }
	}