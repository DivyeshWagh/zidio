package com.example.DTO;

import java.util.Date;

import com.example.Enum.Status;

public class ApplicationDTO {

	public long id;
	public long studentId;
	public long jobId;
	public String resumeUrl;
	public Status status;
	public Date date;
	
	public ApplicationDTO(long id, long studentId, long jobId, String resumeUrl, Status status, Date date) {
		super();
		this.id = id;
		this.studentId = studentId;
		this.jobId = jobId;
		this.resumeUrl = resumeUrl;
		this.status = status;
		this.date = date;
	}

	public ApplicationDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
