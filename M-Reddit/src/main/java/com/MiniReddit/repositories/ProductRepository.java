package com.MiniReddit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MiniReddit.domain.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
