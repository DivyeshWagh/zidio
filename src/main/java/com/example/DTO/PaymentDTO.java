package com.example.DTO;

import java.math.BigDecimal;
import java.sql.Date;

import com.example.Enum.PaymentTypes;

public class PaymentDTO {
	
	public long id;
	public long userId;
	public String transactionId;
	public BigDecimal amount;
	public String currency;
	public PaymentTypes paymentTypes;
	public Date paymentDate;
	
	
	public PaymentDTO(long id, long userId, String transactionId, BigDecimal amount, String currency,
			PaymentTypes paymentTypes, Date paymentDate) {
		super();
		this.id = id;
		this.userId = userId;
		this.transactionId = transactionId;
		this.amount = amount;
		this.currency = currency;
		this.paymentTypes = paymentTypes;
		this.paymentDate = paymentDate;
	}
	
	

}
