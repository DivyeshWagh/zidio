package com.example.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Student;

import jakarta.persistence.Id;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

	Optional<Student> findbyemail(String email);
	Optional<Student> findById(Long id);
	
}
