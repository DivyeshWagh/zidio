package com.example.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.DTO.AdminUserDTO;
import com.example.Enum.Role;
import com.example.repository.AdminUserRepository;
import com.example.service.AdminUserService;



@RestController
@RequestMapping("/api/admins")
public class AdminUserController {

	@Autowired
	private AdminUserService adminUserService;
	
	@Autowired
	private AdminUserRepository adminUserRepository;
	
	@GetMapping("/users")
	public ResponseEntity<List<AdminUserDTO>> getAllUsers(@RequestBody AdminUserDTO adminUserDTO){
		return ResponseEntity.ok(adminUserService.getAllUsers());
	}
	
	@GetMapping("/role/{role}")
	public ResponseEntity<List<AdminUserDTO>> getUserByRole(@PathVariable Role role){
		return ResponseEntity.ok(adminUserService.getUserByRole(role));
	}
	
	@PutMapping("/{id}/status")
	public ResponseEntity<AdminUserDTO> updateUserStatus(@PathVariable long id, @RequestParam boolean active ){
		return ResponseEntity.ok(adminUserService.updateStatus(id, active));
	}
	
	@PutMapping("/{id}/block")
	public ResponseEntity<AdminUserDTO> blockUser(@PathVariable long id  ){
		return ResponseEntity.ok(adminUserService.blockUser(id));
	}
	
	@PutMapping("/{id}/unblock")
	public ResponseEntity<AdminUserDTO> unblockUser(@PathVariable long id){
		return ResponseEntity.ok(adminUserService.unBlockUser(id));
		
	}
	
	@GetMapping("/internal/count")
	public ResponseEntity<Long> getAdminUserCount(){
		return ResponseEntity.ok(adminUserRepository.count());
		}
	
	
}
