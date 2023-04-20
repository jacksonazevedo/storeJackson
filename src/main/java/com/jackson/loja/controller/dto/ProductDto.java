package com.jackson.loja.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.jackson.loja.model.Product;

import lombok.Getter;

@Getter
public class ProductDto {
	private String name;
	private String description;
	private Double price;
	
	public ProductDto(Product product) {
		name = product.getName();
		description = product.getDescription();
		price = product.getPrice();
	}
	
	public static List<ProductDto> converter(List<Product> list) {
		return list.stream().map(ProductDto::new).collect(Collectors.toList());
	}
}
