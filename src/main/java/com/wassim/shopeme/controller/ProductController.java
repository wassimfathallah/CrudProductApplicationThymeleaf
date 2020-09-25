package com.wassim.shopeme.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.wassim.shopeme.controller.service.ProductService;
import com.wassim.shopeme.model.Product;

@Controller
public class ProductController {

	@Autowired
	ProductService productService;

	@GetMapping("/")
	public String home(Model model) {
		// show all product
		model.addAttribute("listProduct", productService.getAllProduct());
		return "homepage";
	}

	@GetMapping("/showCreateForm")
	public String createProduct(Model model) {
		Product product = new Product();
		model.addAttribute("product", product);
		return "createProduct";
	}

	@PostMapping("/saveProduct")
	public String saveProduct(@ModelAttribute("product") Product product) {
		productService.createProduct(product);
		return "redirect:/";
	}

	@GetMapping("/deleteProduct/{id}")
	public String deleteProductById(@PathVariable(value = "id") Long id) {

		productService.deleteProduct(id);
		return "redirect:/";
	}

	@GetMapping("/showUpdateForm/{id}")
	public String updateProduct(@PathVariable(value = "id") Long id, Model model) {
		Product product = productService.getProductById(id);
		model.addAttribute("product", product);

		return "updateProduct";
	}

}
