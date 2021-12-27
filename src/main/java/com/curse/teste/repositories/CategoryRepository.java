package com.curse.teste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curse.teste.entities.Category;

public interface CategoryRepository  extends JpaRepository<Category, Long>{

	
	
}
