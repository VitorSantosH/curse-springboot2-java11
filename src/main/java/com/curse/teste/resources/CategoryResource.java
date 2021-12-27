package com.curse.teste.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curse.teste.entities.Category;
import com.curse.teste.services.CategoryService;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

	@Autowired
	private CategoryService  service;
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll() {
		
		List <Category> list = service.findAll(); 
		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findCategory(@PathVariable Long id){
		Category obj = service.findCategory(id);
		return ResponseEntity.ok().body(obj);
	}
	
	
}