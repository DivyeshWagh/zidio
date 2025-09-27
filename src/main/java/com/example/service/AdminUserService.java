package com.example.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DTO.AdminUserDTO;
import com.example.Enum.Role;
import com.example.entity.AdminUser;
import com.example.repository.AdminUserRepository;

@Service
public class AdminUserService {

	
	@Autowired
	private AdminUserRepository adminUserRepository;
	
	
	public AdminUserDTO getAdminUsersByEmail(String email) {
		
		AdminUser adminUser =  adminUserRepository.findByEmail(email);
		return new AdminUserDTO(adminUser.getId(),
				adminUser.getEmail(), adminUser.getName(),
				adminUser.getRole(), 
				adminUser.isActive(),adminUser.isBlocked());
	}
	
	public List<AdminUserDTO> getAllUsers(){
		return adminUserRepository.findAll().stream().map(users -> new AdminUserDTO(users.getId(),users.getEmail(),
				users.getName(),users.getRole(),users.isActive(),users.isBlocked())).collect(Collectors.toList());
		
	}
	
	public AdminUserDTO blockUser(long userid ) {
		AdminUser adminUser = adminUserRepository.findById(userid).orElse(null);
		if(adminUser != null) {
		adminUser.setBlocked(true);
		adminUserRepository.save(adminUser);
		return new AdminUserDTO(adminUser.getId(),
				adminUser.getEmail(), adminUser.getName(),
				adminUser.getRole(), 
				adminUser.isActive(),adminUser.isBlocked());
		}
		return null;
	}
	
	public AdminUserDTO unBlockUser(long userid) {
		AdminUser adminUser =  adminUserRepository.findById(userid).orElse(null);
		if(adminUser != null) {
			adminUser.setBlocked(false);
			adminUserRepository.save(adminUser);
			return new AdminUserDTO(adminUser.getId(),
					adminUser.getEmail(), adminUser.getName(),
					adminUser.getRole(), 
					adminUser.isActive(),adminUser.isBlocked());
		}
		return null;
	}
	
	public List<AdminUserDTO> getUserByRole(Role role){
		return adminUserRepository.findByRole(role).stream().map(users -> new AdminUserDTO(users.getId(),users.getEmail(),
				users.getName(),users.getRole(),users.isActive(),users.isBlocked())).collect(Collectors.toList());
	}
	
	public AdminUserDTO updateStatus(long id, boolean isActive) {
		AdminUser adminUser = adminUserRepository.findById(id).orElse(null);
		if(adminUser==null)throw new RuntimeException("User not found");
		adminUser.setActive(isActive);
		adminUserRepository.save(adminUser);
		return new AdminUserDTO(adminUser.getId(),
				adminUser.getEmail(), adminUser.getName(),
				adminUser.getRole(), 
				adminUser.isActive(),adminUser.isBlocked()); 
	}
	
	
	
}
