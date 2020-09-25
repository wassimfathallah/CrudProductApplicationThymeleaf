package com.wassim.shopeme.controller.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wassim.shopeme.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
