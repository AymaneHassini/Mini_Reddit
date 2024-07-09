package com.MiniReddit.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.MiniReddit.domain.Product;
import com.MiniReddit.domain.Users;

public interface ProductRepository extends JpaRepository<Product, Long> {
	// select * from product where user= :user
	List<Product> findByUser(Users user);

	@Query("select p from Product p" + " join fetch p.user" + " where p.id = :id")
	Optional<Product> findByIdWithUser(Long id);
}
