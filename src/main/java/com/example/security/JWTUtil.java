package com.example.security;

import java.util.Date;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Component;

@Component
public class JWTUtil {

	private  static final String SECRET_KEY ="zidio_secret_key";
	
	public String generateToken(String email,String role) {
		
		return Jwts.builder().
				setSubject(email).
				claim("role",role).
				
				setIssuedAt(new Date()).
				setExpiration(new Date(System.currentTimeMillis()+36000)).
				signWith(SignatureAlgorithm.HS256,SECRET_KEY).
				compact();
	}
		public String extractEmail(String token) {
	        return getClaims(token).getSubject();
	    }
		
		
		public Claims getClaims(String token) {
			return Jwts.parser().setSigningKey(SECRET_KEY).parseClaimsJws(token).getBody();
			
		}
		
		public String extractUsername(String token) {
			return Jwts.parser().setSigningKey(SECRET_KEY).parseClaimsJws(token).getBody().getSubject();
		}

	
}
