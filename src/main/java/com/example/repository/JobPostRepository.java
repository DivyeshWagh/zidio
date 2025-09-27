package com.example.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Enum.JobType;
import com.example.entity.JobPost;



@Repository
public interface JobPostRepository extends JpaRepository<JobPost , Long>{

	List<JobPost>   findByTitle(String jobTitle); 
	List<JobPost>   findByCompanyName(String companyName); 
	List<JobPost>   findByJobType(JobType jobtype); 
	List<JobPost>   findByJobPostedByemail(String jobPostedByEmail); 
	
}
