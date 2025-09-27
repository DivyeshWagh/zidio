package com.example.entity;

import java.util.Date;

import com.example.Enum.Status;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Application")
public class Application {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private long studentId;
	private long jobId;
	private String resumeUrl;
	private Status status;
	private Date applicationDate;
	
	public Application(long id, long studentId, long jobId, String resumeUrl, Status status, Date applicationDate) {
		super();
		this.id = id;
		this.studentId = studentId;
		this.jobId = jobId;
		this.resumeUrl = resumeUrl;
		this.status = status;
		this.applicationDate = applicationDate;
	}

	public Application() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public long getJobId() {
		return jobId;
	}

	public void setJobId(long jobId) {
		this.jobId = jobId;
	}

	public String getResumeUrl() {
		return resumeUrl;
	}

	public void setResumeUrl(String resumeUrl) {
		this.resumeUrl = resumeUrl;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Date getApplicationDate() {
		return applicationDate;
	}

	public void setApplicationDate(Date applicationDate) {
		this.applicationDate = applicationDate;
	}
	
	
	
}
