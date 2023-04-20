package com.jackson.loja.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jackson.loja.model.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{

}
