package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import java.util.stream.Collectors;

import com.example.DTO.JobPostDTO;
import com.example.Enum.JobType;
import com.example.entity.JobPost;
import com.example.repository.JobPostRepository;


@Service
public class JobPostServices {
	
	@Autowired
	private JobPostRepository jobPostRepository;

	
	public JobPostDTO postJob(JobPostDTO dto) {
		
		JobPost jobPost = new JobPost(dto.id,
				dto.jobTitle,
				dto.jobDescription,
				dto.joblocation,
				dto.jobTypes,
				dto.companyLocation,
				dto.companyName,
				dto.postedbyemail, 
				dto.skill, 
				dto.postedDate);
		JobPost saved = jobPostRepository.save(jobPost);
		return mapToDto(saved);
	}
	
	public List<JobPostDTO> getByPostedByEmail(String email){
		return jobPostRepository.findByJobPostedByemail(email).
				stream().
				map(this::mapToDto).
				collect(Collectors.toList());
	}
	
	public List<JobPostDTO> getByTitle(String title){
		return jobPostRepository.findByTitle(title)
				.stream()
				.map(this::mapToDto)
				.collect(Collectors.toList());
	}
	
	public List<JobPostDTO> getByCompanyName(String companyName){
		return jobPostRepository.findByCompanyName(companyName)
				.stream()
				.map(this::mapToDto)
				.collect(Collectors.toList());
	}
	
	public List<JobPostDTO> getByJobType(JobType jobType){
		return jobPostRepository.findByJobType(jobType)
				.stream()
				.map(this::mapToDto)
				.collect(Collectors.toList());
	}
	
	private JobPostDTO mapToDto(JobPost jobPost) {
		return new JobPostDTO(
				jobPost.getId(),
				jobPost.getJobTitle(),
				jobPost.getJoblocation(),
				jobPost.getJobDescription(),
				jobPost.getJobTypes(),
				jobPost.getCompanyName(),
				jobPost.getCompanyLocation(),
				jobPost.getPostedbyemail(),
				jobPost.getPostedDate());
	}
}
