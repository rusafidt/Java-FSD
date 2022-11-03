package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.model.product;

public class Productservice {

	@Autowired
	productRepo repo;
	
	public static List<product> saveProducts(List<product> product) {
		// TODO Auto-generated method stub
		return repo.saveAll(product);
	}

	@GetMapping ("/products")
	public List<product>getProduct() {
		return repo.findAll();
	}
}
