package com.example.DTO;

import java.time.LocalDate;

import com.example.Enum.PaidStatus;

public class UserpaymentStatusDTO {

	public Long id;
	public Long planId;
	public Long userId;
	public LocalDate subscriptioDate;
	public LocalDate subscriptionEndDate;
	public PaidStatus status;
	
	public UserpaymentStatusDTO(Long id, Long planId, Long userId, LocalDate subscriptioDate,
			LocalDate subscriptionEndDate, PaidStatus status) {
		super();
		this.id = id;
		this.planId = planId;
		this.userId = userId;
		this.subscriptioDate = subscriptioDate;
		this.subscriptionEndDate = subscriptionEndDate;
		this.status = status;
	}

	public UserpaymentStatusDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
