package com.example.wambugugrocery.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.wambugugrocery.model.Product;
import com.example.wambugugrocery.repos.ProductRepo;

@RestController
@RequestMapping("productapi")
public class ProductController {
	
	@Autowired
	ProductRepo repo;
	
	@RequestMapping(value="/addproduct",method=RequestMethod.POST)
	public Product create(@RequestBody Product product) {
		
		return repo.save(product);
		
		
	}

	@RequestMapping(value="/product/{id}",method=RequestMethod.GET)
	public Product getProduct(@PathVariable Long  id) {
		return repo.findById(id).get();
		
	}
	@RequestMapping(value="/products",method=RequestMethod.GET)
	public List<Product> getProducts() {
		return repo.findAll();
		
	}

}
