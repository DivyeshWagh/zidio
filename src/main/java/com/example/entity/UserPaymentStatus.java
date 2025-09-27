package com.example.entity;

import java.time.LocalDate;

import com.example.Enum.PaidStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_payment_status")
public class UserPaymentStatus {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long userId;
	private Long planId;
	private LocalDate subScriptionDate;
	private LocalDate subScriptionEndDate;
	private PaidStatus status;
	
	public UserPaymentStatus(Long id, Long userId, Long planId, LocalDate subScriptionDate,
			LocalDate subScriptionEndDate, PaidStatus status) {
		super();
		this.id = id;
		this.userId = userId;
		this.planId = planId;
		this.subScriptionDate = subScriptionDate;
		this.subScriptionEndDate = subScriptionEndDate;
		this.status = status;
	}

	public UserPaymentStatus() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getPlanId() {
		return planId;
	}

	public void setPlanId(Long planId) {
		this.planId = planId;
	}

	public LocalDate getSubScriptionDate() {
		return subScriptionDate;
	}

	public void setSubScriptionDate(LocalDate subScriptionDate) {
		this.subScriptionDate = subScriptionDate;
	}

	public LocalDate getSubScriptionEndDate() {
		return subScriptionEndDate;
	}

	public void setSubScriptionEndDate(LocalDate subScriptionEndDate) {
		this.subScriptionEndDate = subScriptionEndDate;
	}

	public PaidStatus getStatus() {
		return status;
	}

	public void setStatus(PaidStatus status) {
		this.status = status;
	}
	
	
}
