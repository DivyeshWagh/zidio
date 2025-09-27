package com.example.entity;

import java.math.BigDecimal;
import java.sql.Date;

import org.aspectj.lang.annotation.control.CodeGenerationHint;

import com.example.Enum.PaymentTypes;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="payment")
public class Payment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private long userId;
	private long planId;
	private String transactionId;
	private BigDecimal amount;
	private String currency;
	private Date paymentDate;
	
	@Enumerated(EnumType.STRING)
	private PaymentTypes paymentType;

	public Payment(long id, long userId, long planId, String transactionId, BigDecimal amount, String currency,
			PaymentTypes paymentType, Date paymentDate) {
		super();
		this.id = id;
		this.userId = userId;
		this.planId = planId;
		this.transactionId = transactionId;
		this.amount = amount;
		this.currency = currency;
		this.paymentType = paymentType;
		this.paymentDate = paymentDate;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public long getPlanId() {
		return planId;
	}

	public void setPlanId(long planId) {
		this.planId = planId;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public PaymentTypes getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(PaymentTypes paymentType) {
		this.paymentType = paymentType;
	}
	
	
	
	
}
