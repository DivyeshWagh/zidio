package com.example.entity;

import java.util.Date;

import com.example.Enum.JobType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="jobpost")
public class JobPost {
	
	@Id
	@GeneratedValue(strategy  = GenerationType.IDENTITY)
	private long id;
	private String jobTitle;
	private String jobDescription;
	private String joblocation;
	private JobType jobTypes;
	private String companyName;
	private String companyLocation;
	private String postedbyemail;
	private String skill;
	private Date postedDate;
	
	
	public JobPost(long id,String jobTitle, String jobDescription, String joblocation, JobType jobTypes,String companyName, String companyLocation,
			String postedbyemail, String skill, Date postedDate) {
		super();
		this.id=id;
		this.jobTitle = jobTitle;
		this.jobDescription = jobDescription;
		this.joblocation = joblocation;
		this.jobTypes = jobTypes;
		this.companyName=companyName;
		this.companyLocation = companyLocation;
		this.postedbyemail = postedbyemail;
		this.skill = skill;
		this.postedDate = postedDate;
	}


	public String getCompanyName() {
		return companyName;
	}


	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}


	public JobPost() {
		super();
		// TODO Auto-generated constructor stub
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getJobTitle() {
		return jobTitle;
	}


	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}


	public String getJobDescription() {
		return jobDescription;
	}


	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}


	public String getJoblocation() {
		return joblocation;
	}


	public void setJoblocation(String joblocation) {
		this.joblocation = joblocation;
	}


	public JobType getJobTypes() {
		return jobTypes;
	}


	public void setJobTypes(JobType jobTypes) {
		this.jobTypes = jobTypes;
	}


	public String getCompanyLocation() {
		return companyLocation;
	}


	public void setCompanyLocation(String companyLocation) {
		this.companyLocation = companyLocation;
	}


	public String getPostedbyemail() {
		return postedbyemail;
	}


	public void setPostedbyemail(String postedbyemail) {
		this.postedbyemail = postedbyemail;
	}


	public String getSkill() {
		return skill;
	}


	public void setSkill(String skill) {
		this.skill = skill;
	}


	public Date getPostedDate() {
		return postedDate;
	}


	public void setPostedDate(Date postedDate) {
		this.postedDate = postedDate;
	}
	
	
	
}
