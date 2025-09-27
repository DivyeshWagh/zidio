package com.example.DTO;

public class SubscriptionPlanDTO {

	public Long id;
	public String name;
	public String description;
	public Double price;
	public Integer durationInDays;
	public SubscriptionPlanDTO(Long id, String name, String description, Double price, Integer durationInDays) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.durationInDays = durationInDays;
	}
	public SubscriptionPlanDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
