package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.DTO.ApplicationDTO;
import com.example.Enum.Status;
import com.example.repository.ApplicationRepository;
import com.example.service.ApplicationServices;
import com.netflix.discovery.converters.Auto;

import jakarta.ws.rs.GET;

@RestController
@RequestMapping("/api/applications")
public class ApplicationController {

	@Autowired
	private ApplicationServices applicationServices;
	
	@Autowired
	private ApplicationRepository applicationRepository;
	
	
	@GetMapping("/student/{studentId}")
	public ResponseEntity<List<ApplicationDTO>> getApplicationByStudentId(@PathVariable long studentId){
		return ResponseEntity.ok(applicationServices.getApplicationByStudentId(studentId));
	}
	
	@PostMapping("/apply")
	public ResponseEntity<ApplicationDTO> apply(@RequestBody ApplicationDTO dto){
		return ResponseEntity.ok(applicationServices.apply(dto));
	}
	
	@GetMapping("/job/{jobId}")
	public ResponseEntity<List<ApplicationDTO>> getApplicaitonByJobId(@PathVariable long jobId){
		return ResponseEntity.ok(applicationServices.getApplicationByJobId(jobId));
	}
	@PutMapping("/{id}/status")
	public void updateStatus(@PathVariable long id , @RequestParam Status status) {
		applicationServices.updateStatus(id, status);
	}
	
	@GetMapping("internal/count")
	public ResponseEntity<Long> getApplicationCount(){
		return ResponseEntity.ok(applicationRepository.count());
	}
 }
