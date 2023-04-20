package com.jackson.loja.controller.form;

import com.jackson.loja.model.Product;

import lombok.Data;

@Data
public class ProductForm {
	private String name;
	private String description;
	private Double price;
	
	public Product converter() {
		return new Product(null, name, description, price);
	}

	
	
}
