package com.pack.springswagger.controller;

import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.*;


import com.pack.springswagger.model.Product;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.http.MediaType.APPLICATION_XML_VALUE;

@RestController
@RequestMapping("/api/v1/products")
public class ProductsController {

	@GetMapping(value="/", produces = {APPLICATION_JSON_VALUE, APPLICATION_XML_VALUE})
	public List<Product> listAllProducts() {
		List<Product> productList = Arrays.asList(new Product(), new Product(), new Product());
		return productList;
	}

	@GetMapping(value="/{id}", produces = {APPLICATION_JSON_VALUE, APPLICATION_XML_VALUE})
	public Product findById(@PathVariable int id) {
		System.out.println("PRODUCT ID : " + id);
		return new Product();
	}

	@PostMapping(value="/save", consumes = {APPLICATION_JSON_VALUE, APPLICATION_XML_VALUE})
	public Product saveProduct(@Valid @RequestBody Product product) {
		System.out.println("REQUEST BODY PRODUCT : "+ product);
		return new Product();
	}

	@PutMapping(value="/{id}", consumes = {APPLICATION_JSON_VALUE, APPLICATION_XML_VALUE})
	public void updateProduct(@PathVariable int id, @RequestBody Product product) {
		System.out.println("Update Product method");
	}
	
	@DeleteMapping(value="/{id}")
	public void deleteProduct(@PathVariable int id) {
		System.out.println("Delete Product method");
	}

}
