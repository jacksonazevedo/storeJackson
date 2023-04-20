package com.jackson.loja.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.jackson.loja.controller.dto.ProductDto;
import com.jackson.loja.controller.form.ProductForm;
import com.jackson.loja.model.Product;
import com.jackson.loja.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	ProductService productService;

	@GetMapping
	private List<ProductDto> getAll() {
		return ProductDto.converter(productService.listAll());
	}
	@PostMapping
	private ResponseEntity<ProductDto> add(@RequestBody ProductForm form, UriComponentsBuilder uribuilder) {
		Product product = form.converter();
		productService.saveOrUpdate(product);
		URI uri = uribuilder.path("/product/{id}").buildAndExpand(product.getId()).toUri();
		return ResponseEntity.created(uri).body(new ProductDto(product));
	}
	@PutMapping
	private ResponseEntity<Product> update(@RequestBody Product product) {
		productService.saveOrUpdate(product);
		return ResponseEntity.ok(product);
		
	}
	@DeleteMapping("/{id}")
	private ResponseEntity<?> delete(@PathVariable Long id){
		productService.deleteById(id);
		return ResponseEntity.ok().build();
	}
	
	@GetMapping("/{id}")
	private ResponseEntity<ProductDto> findById(@PathVariable Long id) {
		ProductDto product = new ProductDto(productService.findById(id));
		return ResponseEntity.ok(product);
	}
}
