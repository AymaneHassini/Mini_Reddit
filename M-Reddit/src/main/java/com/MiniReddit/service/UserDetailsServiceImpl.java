package com.MiniReddit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.MiniReddit.domain.Users;
import com.MiniReddit.repositories.UserRepository;
import com.MiniReddit.security.CustomSecurityUser;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	@Autowired
	private UserRepository userRepo;

	

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Users user = userRepo.findByUsername(username);
		if (user == null) {

			throw new UsernameNotFoundException("Invalid Username and Password!");
		}
		
		return new CustomSecurityUser(user);
	}

}
