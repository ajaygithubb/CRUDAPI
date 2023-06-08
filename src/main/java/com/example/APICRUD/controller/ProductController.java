package com.example.APICRUD.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.APICRUD.entity.Product;
import com.example.APICRUD.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	private ProductService service;

	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product product) {
		return service.saveProduct(product);
	}

	@PostMapping("/addProducts")
	public List<Product> adProducts(@RequestBody List<Product> products) {
		return service.saveProducts(products);
	}

	@GetMapping("/productById/{id}")
	public Product findProductById(@PathVariable int id) {
		return service.getProductById(id);
	}
	@GetMapping("/AllProducts")
	public List<Product> findAllProducts(){
		return service.getProducts();
	}

	@GetMapping("/product/{name}")
	public Product findProductByName(@PathVariable String name) {
		return service.getProductByName(name);
	}

}
