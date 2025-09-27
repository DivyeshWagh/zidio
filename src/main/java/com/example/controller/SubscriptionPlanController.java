package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.DTO.SubscriptionPlanDTO;
import com.example.service.SubscriptionPlanService;

@RestController
@RequestMapping("/api/subscription")
public class SubscriptionPlanController {

	@Autowired
	private SubscriptionPlanService planService;
	
	@GetMapping("/getAllPlans")
	public ResponseEntity<List<SubscriptionPlanDTO>> getAllPlans(){
		return ResponseEntity.ok(planService.getAllSubscriptionPlans());
	}
	
	@PostMapping("/createSubscription")
	public ResponseEntity<SubscriptionPlanDTO> createSubscription(@RequestBody SubscriptionPlanDTO dto){
		return ResponseEntity.ok(planService.createSubscription(dto));
	}
}
