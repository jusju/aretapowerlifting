package com.example.PowerliftingResults.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "usertable")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, updatable = false)
	
	 private Long id;
	
	 @Column(name = "username", nullable = false, unique = true)
	 private String username;
	 
	 @Column(name = "password", nullable = false)
	 private String passwordHash;
	 
	 @Column(name = "role", nullable = false)
	 private String role;
	 
	 @Column(name = "email", nullable = false, unique = true)
	 private String email;
	 
	 @Column (name = "reset_password_token")
	 private String resetPasswordToken;
	 
	 @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
	 private List<Result> results;
	 
	 
	 public User() {
	    }

		public User(String username, String passwordHash, String role, String email) {
			super();
			this.username = username;
			this.passwordHash = passwordHash;
			this.role = role;
			this.email = email;
			
		}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPasswordHash() {
		return passwordHash;
	}

	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}
	

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getResetPasswordToken() {
		return resetPasswordToken;
	}

	public void setResetPasswordToken(String resetPasswordToken) {
		this.resetPasswordToken = resetPasswordToken;
	}

	public List<Result> getResults() {
		return results;
	}

	public void setResults(List<Result> results) {
		this.results = results;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username ;
	}
	
	 
}
