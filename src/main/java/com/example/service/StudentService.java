package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DTO.StudentDTO;
import com.example.entity.Student;
import com.example.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	public StudentDTO createOrUpdateStudent(StudentDTO dto) {
		
		Student student = new Student(
				dto.id,dto.fname,
				dto.mname,dto.lname,
				dto.email,
				dto.qualifiacation,
				dto.resumeUrl,
				dto.phone);
		Student saved = (Student) studentRepository.save(student);
		return mapToDTO(saved);
	}
	
	public StudentDTO getStudentByEmail(String email) {
		Student student = studentRepository.findbyemail(email)
				.orElseThrow(()-> new RuntimeException("Student not found"));
		Student saved = studentRepository.save(student);
		
		return mapToDTO(saved);
	}
	
	public StudentDTO getStudentById(Long id) {
		Student student = studentRepository.findById(id).orElseThrow(()->new RuntimeException("Student not found"));
		return mapToDTO(student);	
	}
	
	private StudentDTO mapToDTO(Student student) {
		return new StudentDTO(
				student.getId(),
				student.getFname(),
				student.getMname(),
				student.getLname(),
				student.getEmail(),
				student.getPhone(),
				student.getQualification(),
				student.getResumeUrl()
				);
	}
	
	
}
