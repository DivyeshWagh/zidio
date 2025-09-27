package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.example.DTO.EmailRequest;

@Service
public class EmailService {

	@Autowired
	private JavaMailSender mailsender;
	
	public void sendEmail(EmailRequest emailRequest) {

		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(emailRequest.to);
		message.setSubject(emailRequest.subject);
		message.setText(emailRequest.body);
		
		mailsender.send(message);
	}
}
