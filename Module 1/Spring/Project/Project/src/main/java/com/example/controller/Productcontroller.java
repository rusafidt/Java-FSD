package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.product;
import com.example.service.Productservice;

@RestController

public class Productcontroller {
	
	@Autowired
	Productservice productservice;
	@PostMapping ("/addproduct")
	public List<product>addproduct(@RequestBody List<product> product) {
		return productservice.saveProducts(product);
	}
	
	@GetMapping("/products")
	public List<product> findAllProducts() {
		return productservice.getProduct();
	}
	
}
