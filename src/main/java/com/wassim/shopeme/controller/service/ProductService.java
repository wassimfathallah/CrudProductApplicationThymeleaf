package com.wassim.shopeme.controller.service;

import java.util.List;


import com.wassim.shopeme.model.Product;


public interface ProductService {

	void createProduct(Product product);
	List<Product> getAllProduct();
	Product getProductById(Long id);
	void deleteProduct(Long id);
}
