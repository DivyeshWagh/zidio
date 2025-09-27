package com.example.DTO;

public class RecruiterDTO {

	public long id;
	public String name;
	public String companyName;
	public String companyDescription;
	public String companyWebsite;
	public String phone;
	public String email;
	
	
	public RecruiterDTO(long id, String name, String companyName, String companyDescription, String companyWebsite,
			String phone, String email) {
		super();
		this.id = id;
		this.name = name;
		this.companyName = companyName;
		this.companyDescription = companyDescription;
		this.companyWebsite = companyWebsite;
		this.phone = phone;
		this.email = email;
	}
	
	 
}
