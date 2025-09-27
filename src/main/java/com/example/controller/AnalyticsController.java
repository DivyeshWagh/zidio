package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.DTO.AnalyticsResponse;
import com.example.service.AnalyticsServices;

@RestController
@RequestMapping("/api/analystics")
public class AnalyticsController {

	@Autowired
	private AnalyticsServices analyticsServices;
	
	@GetMapping("/summery")
	public ResponseEntity<AnalyticsResponse> getSummery(){
		return ResponseEntity.ok(analyticsServices.collectData());
	}
}
