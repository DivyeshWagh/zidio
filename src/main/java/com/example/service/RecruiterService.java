package com.example.service;


import org.springframework.beans.factory.annotation.Autowired;

import com.example.DTO.RecruiterDTO;
import com.example.entity.Recruiter;
import com.example.repository.RecruiterRepository;

public class RecruiterService {

	
	@Autowired
	private RecruiterRepository recruiterRepository;
	
	public RecruiterDTO createRecruiter(RecruiterDTO dto) {
		
		Recruiter recruiter = new Recruiter(dto.id,dto.name,dto.email,dto.phone,dto.companyName,dto.companyDescription,dto.companyWebsite);

		Recruiter save = recruiterRepository.save(recruiter);
		return new RecruiterDTO(
				save.getId(),
				save.getName(),
				save.getEmail(),
				save.getPhone(),
				save.getCompanyName(),
				save.getCompanyDescription(),
				save.getCompanyWebsite());
	}
	
	public RecruiterDTO getRecruiterByEmail(String email) {
		Recruiter recruiter = recruiterRepository.getRecruiterByEmail(email);
		if(recruiter == null) return null;
		return new RecruiterDTO(
				recruiter.getId(),
				recruiter.getName(),
				recruiter.getEmail(),
				recruiter.getPhone(),
				recruiter.getCompanyName(),
				recruiter.getCompanyDescription(),
				recruiter.getCompanyWebsite()
				);
	}
	
	public RecruiterDTO getRecruiterById(Long id) {
		Recruiter recruiter = recruiterRepository.getReferenceById(id);
		if(recruiter == null) return null;
		return new RecruiterDTO(
				recruiter.getId(),
				recruiter.getName(),
				recruiter.getEmail(),
				recruiter.getPhone(),
				recruiter.getCompanyName(),
				recruiter.getCompanyDescription(),
				recruiter.getCompanyWebsite()
				);
	}
}
