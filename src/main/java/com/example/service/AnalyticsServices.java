package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import com.example.DTO.AnalyticsResponse;

@Service
public class AnalyticsServices {
	
	@Autowired
	private RestTemplate restTemplate;

	
	public AnalyticsResponse  collectData() {
		Long students =restTemplate.getForObject("https://student-service/internal/count", Long.class);
		Long admins =restTemplate.getForObject("https://admins-service/internal/count", Long.class);
		Long recruiters =restTemplate.getForObject("https://recruiters-service/internal/count", Long.class);
		Long jobPosts =restTemplate.getForObject("https://jobPosts-service/internal/count", Long.class);
		Long applications =restTemplate.getForObject("https://applications-service/internal/count", Long.class);
		Long auth =restTemplate.getForObject("https://auth-service/internal/count", Long.class);
		Long email =restTemplate.getForObject("https://email-service/internal/count", Long.class);
		Long fileUpload =restTemplate.getForObject("https://fileUpload-service/internal/count", Long.class);
		

		return new AnalyticsResponse(students, jobPosts, recruiters, applications, admins, fileUpload, email);
	}
}
