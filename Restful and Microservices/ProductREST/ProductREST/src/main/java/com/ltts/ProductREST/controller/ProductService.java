package com.ltts.ProductREST.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltts.ProductREST.model.Product;
import com.ltts.ProductREST.model.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repo;
	
	public List<Product> listAll() {
		return repo.findAll();
	}
	
	public void save(Product product) {
		repo.save(product);
	}
	
	public Product get(int id) {
		return repo.findById(id).get();
	}
	
	public void delete(int id) {
		repo.deleteById(id);
	}
}
