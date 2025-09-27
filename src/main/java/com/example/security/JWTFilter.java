package com.example.security;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import io.jsonwebtoken.io.IOException;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import com.example.entity.User;
import com.example.repository.UserRepository;
import com.example.security.JWTUtil;

public class JWTFilter extends OncePerRequestFilter{

	@Autowired
	private JWTUtil jwtUtil;
	
	@Autowired
	private UserRepository userRepository;
	
	public void doFilterInternal1(HttpServletRequest request ,HttpServletResponse response,FilterChain filtercahin) throws ServletException ,IOException {
	String authHeader = request.getHeader("Autherization");	
	
	}

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, java.io.IOException {
		
		String authHeader = request.getHeader("Authorization");
		if (authHeader != null && authHeader.startsWith("Bearer ")) {
			String token = authHeader.substring(7);
			String email = jwtUtil.extractUsername(token);
			
			if(email != null && SecurityContextHolder.getContext().getAuthentication() == null) {
				User user = userRepository.findByEmail(email).orElseGet(null);
				
				if(user != null) {
					UsernamePasswordAuthenticationToken authentication = 
							new UsernamePasswordAuthenticationToken(user.getEmail(), null, Arrays.asList(new SimpleGrantedAuthority("ROLE_" + user.getRole().name())));
					SecurityContextHolder.getContext().setAuthentication(authentication);
				}
			}
		}
		filterChain.doFilter(request, response);
		
	}
}
