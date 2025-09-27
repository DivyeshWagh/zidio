package com.example.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.DTO.JobPostDTO;
import com.example.Enum.JobType;
import com.example.repository.JobPostRepository;
import com.example.service.JobPostServices;

@RestController
@RequestMapping("/api/jobPosts")
public class JobPostController {

    @Autowired
    private JobPostServices jobPostServices;
    @Autowired
    private JobPostRepository jobPostRepository;

    @PostMapping("/postJob")
    public ResponseEntity<JobPostDTO> postJob(@RequestBody JobPostDTO dto){
        return ResponseEntity.ok(jobPostServices.postJob(dto));
    }


    @GetMapping("/recruiter/{email}")
    public ResponseEntity<List<JobPostDTO>> getByPostedByEmail(@PathVariable String email){
        return ResponseEntity.ok(jobPostServices.getByPostedByEmail(email));
    }

   
    @GetMapping("/title/{title}")
    public ResponseEntity<List<JobPostDTO>> getByJobTitle(@PathVariable String title){
        return ResponseEntity.ok(jobPostServices.getByTitle(title));
    }

    
    @GetMapping("/type/{type}")
    public ResponseEntity<List<JobPostDTO>> getByJobType(@PathVariable JobType type){
        return ResponseEntity.ok(jobPostServices.getByJobType(type));
    }

    
    @GetMapping("/company/{companyName}")
    public ResponseEntity<List<JobPostDTO>> getByCompanyName(@PathVariable String companyName){
        return ResponseEntity.ok(jobPostServices.getByCompanyName(companyName));
    }

    @GetMapping("/internal/count")
    public ResponseEntity<Long> getJobPostCount(){
        return ResponseEntity.ok(jobPostRepository.count());
    }
}