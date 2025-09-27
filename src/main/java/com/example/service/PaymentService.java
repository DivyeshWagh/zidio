package com.example.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DTO.PaymentDTO;
import com.example.entity.Payment;
import com.example.repository.PaymentRepository;

@Service
public class PaymentService {

	@Autowired
	private PaymentRepository paymentRepository;
	
	public PaymentDTO makePayment(PaymentDTO dto) {
	
		Payment payment = new Payment();
		payment.setId(dto.id);
		payment.setAmount(dto.amount);
		payment.setCurrency(dto.currency);
		payment.setPaymentType(dto.paymentTypes);
		payment.setUserId(dto.userId);
		payment.setTransactionId(dto.transactionId);
		payment.setPaymentDate(dto.paymentDate);
		
		Payment save = paymentRepository.save(payment);
		return new PaymentDTO(save.getId(), save.getUserId(), save.getTransactionId(), save.getAmount(), save.getCurrency(), save.getPaymentType(), save.getPaymentDate());
	}
	
	public List<PaymentDTO> getAllPayments(){
		return paymentRepository.findAll().stream().map(p -> new PaymentDTO(p.getId(), p.getUserId(), p.getTransactionId(), p.getAmount(), p.getCurrency(),p.getPaymentType(), p.getPaymentDate()))
				.collect(Collectors.toList());
	}
	
}
