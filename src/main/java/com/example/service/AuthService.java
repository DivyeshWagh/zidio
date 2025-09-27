package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.DTO.AuthResponse;
import com.example.DTO.LoginRequest;
import com.example.DTO.RegisterRequest;
import com.example.entity.User;
import com.example.repository.UserRepository;
import com.example.security.JWTUtil;
@Service
public class AuthService {

	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private JWTUtil jwtUtil;
	
	
	
	// In AuthService.java

	public AuthResponse register(RegisterRequest registerRequest) {

	    User user = new User();
	    user.setEmail(registerRequest.email);
	
	    user.setPassword(passwordEncoder.encode(registerRequest.password)); 
	    user.setRole(registerRequest.role);
	    user.setMname(registerRequest.mname);
	    user.setFname(registerRequest.fnmae);
	    user.setLname(registerRequest.lname);

	 
	    userRepo.save(user);

	    String token = jwtUtil.generateToken(user.getEmail(), user.getRole().name());
	    return new AuthResponse(token, "User Registered Successfully");
	}
	
	 public AuthResponse login(LoginRequest request) {
		 
		 User user = userRepo.findByEmail(request.email).orElseThrow(() -> new RuntimeException("User not found"));
		 
		 
		 if(!passwordEncoder.matches(request.password, user.getPassword()))
			 throw new RuntimeException("Invalid credentials");
		 
		 String token = jwtUtil.generateToken(user.getEmail(), user.getRole().name());
		 return new AuthResponse(token,"Login Successful");
		 
		 
	 }
	
	
	
}
