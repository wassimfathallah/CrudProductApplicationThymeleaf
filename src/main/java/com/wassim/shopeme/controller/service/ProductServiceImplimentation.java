package com.wassim.shopeme.controller.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wassim.shopeme.controller.repository.ProductRepository;
import com.wassim.shopeme.model.Product;

@Service
public class ProductServiceImplimentation implements ProductService {

	@Autowired
	ProductRepository repo;
	
	@Override
	public void createProduct(Product product) {
		 this.repo.save(product);
	}

	@Override
	public List<Product> getAllProduct() {
		
		return repo.findAll();
	}

	@Override
	public Product getProductById(Long id) {
		Optional<Product> optional= repo.findById(id);
		Product product = null;
		if(optional.isPresent()) {
			
			product=optional.get();
		}else {
			throw new RuntimeException("Product not found");
		}
		return product;
	}

	

	@Override
	public void deleteProduct(Long id) {
		this.repo.deleteById(id);
	}

}
