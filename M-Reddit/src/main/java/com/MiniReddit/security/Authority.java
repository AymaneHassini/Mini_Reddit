package com.MiniReddit.security;

import org.springframework.security.core.GrantedAuthority;

import com.MiniReddit.domain.Users;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
@Entity
public class Authority implements GrantedAuthority {
private static final long serialVersionUID = 8221190033680655831L;
private Long id;
private String authority;
private Users user;
	@Override
	public String getAuthority() {
		// TODO Auto-generated method stub
		return this.authority; 
	}
	public void setAuthority(String authority) {
		// TODO Auto-generated method stub
		 this.authority= authority;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@ManyToOne
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
}
