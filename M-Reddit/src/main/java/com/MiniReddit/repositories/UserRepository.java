package com.MiniReddit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MiniReddit.domain.Users;
// object doing the CRUD ops
public interface UserRepository extends JpaRepository<Users,Long> {

	Users findByUsername(String username);

}
