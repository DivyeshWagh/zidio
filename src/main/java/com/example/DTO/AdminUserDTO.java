package com.example.DTO;

import com.example.Enum.Role;

public class AdminUserDTO {

	public long id;
	public String name ;
	public String email;
	public Role role;
	public boolean active;
	public boolean blocked;
	
	
	public AdminUserDTO() {
		super();
	
	}



	public AdminUserDTO(long id, String name, String email, Role role , boolean active , boolean blocked) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.role = role;
		this.active = active;
		this.blocked = blocked;
	}
	
	
}
