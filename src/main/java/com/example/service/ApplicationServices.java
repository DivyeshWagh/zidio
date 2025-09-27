package com.example.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DTO.ApplicationDTO;
import com.example.Enum.Status;
import com.example.entity.Application;
import com.example.repository.ApplicationRepository;

@Service
public class ApplicationServices {

	@Autowired
	private ApplicationRepository applicationRepository;
	
	
	public ApplicationDTO apply(ApplicationDTO dto) {
		
		Application app = new Application(dto.id,
				dto.studentId,
				dto.jobId,
				dto.resumeUrl,
				dto.status,
				dto.date);
		Application saved = applicationRepository.save(app);
		return new  ApplicationDTO(saved.getId(),
				saved.getStudentId(),
				saved.getJobId(),
				saved.getResumeUrl(), 
				saved.getStatus(),
				saved.getApplicationDate()) ;
	}
	
	public List<ApplicationDTO> getApplicationByStudentId(long studentId){
		return applicationRepository.findByStudentId(studentId).stream()
				.map(app -> new ApplicationDTO(app.getId(),app.getStudentId(),app.getJobId(), app.getResumeUrl(), app.getStatus(), app.getApplicationDate()))
				.collect(Collectors.toList());
	}
	
	public List<ApplicationDTO> getApplicationByJobId(long jobId){
		return applicationRepository.findByJobId(jobId).stream()
				.map(app -> new ApplicationDTO(app.getId(),app.getStudentId(),app.getJobId(), app.getResumeUrl(), app.getStatus(), app.getApplicationDate()))
				.collect(Collectors.toList());
	}
	
	public void updateStatus(long id , Status status) throws RuntimeException{
		Application app = applicationRepository.findById(id).orElseThrow(()-> new RuntimeException("Application not found"));
		app.setStatus(status);
		applicationRepository.save(app);
	}
}
