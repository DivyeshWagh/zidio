package com.example.DTO;


public class AnalyticsResponse {

	public Long totalStudents;
	public Long totalJobPosts;
	public Long totalRecruiters;
	public Long totalApplications;
	public Long totalAdmins;
	public Long totalFileUpload;
	public Long totalEmails;
	
	
	
	public AnalyticsResponse() {
		super();
		// TODO Auto-generated constructor stub
	}



	public AnalyticsResponse(Long totalStudents, Long totalJobPosts, Long totalRecruiters, Long totalApplications,
			Long totalAdmins, Long totalFileUpload, Long totalEmails) {
		super();
		this.totalStudents = totalStudents;
		this.totalJobPosts = totalJobPosts;
		this.totalRecruiters = totalRecruiters;
		this.totalApplications = totalApplications;
		this.totalAdmins = totalAdmins;
		this.totalFileUpload = totalFileUpload;
		this.totalEmails = totalEmails;
	}
	
	
}
