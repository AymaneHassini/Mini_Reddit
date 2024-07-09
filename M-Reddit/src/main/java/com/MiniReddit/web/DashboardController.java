package com.MiniReddit.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.MiniReddit.domain.Product;
import com.MiniReddit.domain.Users;
import com.MiniReddit.repositories.ProductRepository;

@Controller
public class DashboardController {
	@Autowired
	private ProductRepository productRepo;

	@GetMapping("/")
	public String rootView() {
		return "index";
	}

	@GetMapping("/Dashboard")
	public String dashboard(@AuthenticationPrincipal Users user, ModelMap model) {
		List<Product> products = productRepo.findByUser(user);
		model.put("products", products);

		return "Dashboard";
	}
}
