package com.example.DTO;

import java.util.Date;

import com.example.Enum.JobType;

public class JobPostDTO {

	public long id;
	public String jobTitle;
	public String jobDescription;
	public String joblocation;
	public JobType jobTypes;
	public String companyLocation;
	public String postedbyemail;
	public String skill;
	public Date postedDate;
	public String companyName;
	
	
	public JobPostDTO(long id,String jobTitle, String jobDescription, String joblocation, JobType jobTypes,
			String companyLocation, String postedbyemail, String skill, Date postedDate) {
		super();
		this.id=id;
		this.jobTitle = jobTitle;
		this.jobDescription = jobDescription;
		this.joblocation = joblocation;
		this.jobTypes = jobTypes;
		this.companyLocation = companyLocation;
		this.postedbyemail = postedbyemail;
		this.skill = skill;
		this.postedDate = postedDate;
	}


	public JobPostDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
