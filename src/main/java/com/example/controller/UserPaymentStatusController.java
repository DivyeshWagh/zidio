package com.example.controller;

import java.lang.StackWalker.Option;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.DTO.UserpaymentStatusDTO;
import com.example.service.UserpaymentStatusService;

@RestController
@RequestMapping("/api/user_subscriptions_status")
public class UserPaymentStatusController {

	@Autowired
	private UserpaymentStatusService service;
	
	@PostMapping("/assign")
	public ResponseEntity<UserpaymentStatusDTO> assign(@RequestBody UserpaymentStatusDTO dto){
		return ResponseEntity.ok(service.asignSubscriptionPlan(dto));
	}
	
	@GetMapping("/{userId}")
	public ResponseEntity<Optional<UserpaymentStatusDTO>> getByUserId(@PathVariable long userId){
		return ResponseEntity.ok(service.getStatusByUser(userId));
	}
}
