package com.example.DTO;

import com.example.Enum.Role;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegisterRequest {
	public String  email;
	public String fnmae;
	public String mname;
	public String lname;
	public String password;
	public Role role;
}
