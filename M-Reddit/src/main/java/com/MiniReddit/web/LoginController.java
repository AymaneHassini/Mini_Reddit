package com.MiniReddit.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.MiniReddit.domain.Users;

@Controller
public class LoginController {
	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@GetMapping("/register")
	public String register(ModelMap model) {
		model.put("users", new Users());
		return "register";
	}

	@PostMapping("/register")
	public String registerPost(Users user) {
		return "redirect:/login";
	}

}
