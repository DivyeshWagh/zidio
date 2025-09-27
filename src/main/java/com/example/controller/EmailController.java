package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.DTO.EmailRequest;
import com.example.service.EmailService;

@RestController
@RequestMapping("/api/notify")
public class EmailController {

	@Autowired
	private EmailService emailService;
	
	@PostMapping("/send")
	public ResponseEntity<String> sendEmail(@RequestBody EmailRequest emailRequest){
		emailService.sendEmail(emailRequest);
		return ResponseEntity.ok("Email send succsessflly");
	}
	
}
