package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DTO.UserpaymentStatusDTO;
import com.example.entity.UserPaymentStatus;
import com.example.repository.UserpaymentStatusRepository;

@Service
public class UserpaymentStatusService {

	@Autowired
	public UserpaymentStatusRepository repository;
	
	public UserpaymentStatusDTO asignSubscriptionPlan(UserpaymentStatusDTO dto) {
		UserPaymentStatus paymentStatus = new UserPaymentStatus(
				dto.id,dto.userId, dto.planId, dto.subscriptioDate, dto.subscriptionEndDate, dto.status);
		UserPaymentStatus save = repository.save(paymentStatus);
		return new UserpaymentStatusDTO(save.getId(),save.getUserId(), save.getPlanId(), save.getSubScriptionDate(), save.getSubScriptionEndDate(), save.getStatus());
	}
	
	public Optional<UserpaymentStatusDTO> getStatusByUser(Long id){
		return repository.findByUserId(id).map(status ->{
			UserpaymentStatusDTO dto = new UserpaymentStatusDTO();
			dto.id = status.getId();
			dto.planId = status.getPlanId();
			dto.status = status.getStatus();
			dto.subscriptioDate =status.getSubScriptionDate();
			dto.subscriptionEndDate =status.getSubScriptionEndDate();
			dto.userId =status.getUserId();
			return dto;
		});
	}
	
}
