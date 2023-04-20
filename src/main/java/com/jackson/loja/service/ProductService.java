package com.jackson.loja.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jackson.loja.model.Product;
import com.jackson.loja.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository productRepository;
	
	public List<Product> listAll(){
		return productRepository.findAll();
	}
	
	public void saveOrUpdate(Product product) {
		productRepository.save(product);
	}
	
	public void delete(Product product) {
		productRepository.delete(product);
	}
	
	public void deleteById(Long product) {
		productRepository.deleteById(product);
	}
	
	public Product findById(Long id) {
		return productRepository.findById(id).get();
	}
	
	

}
