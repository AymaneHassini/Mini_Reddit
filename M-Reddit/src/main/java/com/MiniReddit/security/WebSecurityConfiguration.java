package com.MiniReddit.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfiguration {
	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	public UserDetailsService userDetailsService() {
		PasswordEncoder encoder = getPasswordEncoder();
		UserDetails user = User.builder().username("a.hassini@gmail.com").password(encoder.encode("asdfasdf"))
				.roles("USER").build();

		return new InMemoryUserDetailsManager(user);
	}

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http
				
				// Authorize requests
				.authorizeHttpRequests(authz -> authz.requestMatchers("/").permitAll().anyRequest().authenticated())
				// Form login
				.formLogin(form -> form.loginPage("/login").defaultSuccessUrl("/Dashboard").permitAll())
				// Logout configuration
				.logout(logout -> logout.logoutUrl("/logout").permitAll());

		return http.build();
	}
}
