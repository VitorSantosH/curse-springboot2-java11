package com.curse.teste.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curse.teste.entities.Category;
import com.curse.teste.repositories.CategoryRepository;

@Service
public class CategoryService {

		@Autowired
		private CategoryRepository repository;
		
		
		public List<Category> findAll(){
			return repository.findAll();
		}
		
		public Category findCategory(Long id) {
			
			Optional<Category> obj = repository.findById(id);
			
			return obj.get();
		}
	
}
