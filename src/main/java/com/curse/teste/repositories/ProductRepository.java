package com.curse.teste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curse.teste.entities.Product;

public interface ProductRepository  extends JpaRepository<Product, Long>{

	
	
}
