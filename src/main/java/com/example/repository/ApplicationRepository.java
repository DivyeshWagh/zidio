package com.example.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Application;

@Repository
public interface ApplicationRepository extends JpaRepository<Application ,Long>{

	public  List<Application> findByStudentId(long studentId);
	public List<Application> findByJobId(long jobId);
	public Optional<Application> findById(long id);
	
	
}
