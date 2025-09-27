package com.example.entity;



import com.example.Enum.Role;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="AdminUser")
public class AdminUser {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String name;
	
	@Column(unique = true,nullable = false)
	private String email;
	
	private Role role;
	private boolean active =true;
	private boolean blocked = false;
	
	
	

	public AdminUser() {
		super();
		// TODO Auto-generated constructor stub
	}



	public AdminUser(long id, String name, String email, Role role , boolean active , boolean blocked) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.role = role;
		this.active = active;
		this.blocked = blocked;
	}



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public Role getRole() {
		return role;
	}



	public void setRole(Role role) {
		this.role = role;
	}



	public boolean isActive() {
		return active;
	}



	public void setActive(boolean active) {
		this.active = active;
	}



	public boolean isBlocked() {
		return blocked;
	}



	public void setBlocked(boolean blocked) {
		this.blocked = blocked;
	}
	
	
	
	
	
}
