package com.example.DTO;

import lombok.Data;

@Data
public class StudentDTO {

	
	public long id;
	public String fname;
	public String mname;
	public String lname;
	public String email;
	public String phone;
	public String qualifiacation;
	public String resumeUrl;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getQualifiacation() {
		return qualifiacation;
	}
	public void setQualifiacation(String qualifiacation) {
		this.qualifiacation = qualifiacation;
	}
	public String getResumeUrl() {
		return resumeUrl;
	}
	public void setResumeUrl(String resumeUrl) {
		this.resumeUrl = resumeUrl;
	}
	public StudentDTO(long id, String fname, String mname, String lname, String email, String phone,
			String qualifiacation, String resumeUrl) {
		super();
		this.id = id;
		this.fname = fname;
		this.mname = mname;
		this.lname = lname;
		this.email = email;
		this.phone = phone;
		this.qualifiacation = qualifiacation;
		this.resumeUrl = resumeUrl;
	}
	public StudentDTO() {
		
	}
	
	
	
	
}
