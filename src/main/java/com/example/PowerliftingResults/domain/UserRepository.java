package com.example.PowerliftingResults.domain;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
	
	public User findByUsername(String username);
		
	public User findByEmail(String email); 
	     
	public User findByResetPasswordToken(String token);
	     
	
	 
	}
