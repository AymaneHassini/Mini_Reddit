package com.MiniReddit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.MiniReddit.domain.Users;
import com.MiniReddit.repositories.UserRepository;
import com.MiniReddit.security.Authority;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepo;

	@Autowired
	private PasswordEncoder passwordEncoder;

	public Users save(Users user) {
		String encodedPassword = passwordEncoder.encode(user.getPassword());
		user.setPassword(encodedPassword);
		Authority authority = new Authority();
		authority.setAuthority("ROLE USER");
		authority.setUser(user);
		user.getAuthorities().add(authority);
		return userRepo.save(user);

	}
}
