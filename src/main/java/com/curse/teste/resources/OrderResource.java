package com.curse.teste.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curse.teste.entities.Order;
import com.curse.teste.services.OrderService;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {

	@Autowired
	private OrderService  service;
	
	@GetMapping
	public ResponseEntity<List<Order>> findAll() {
		
		List <Order> list = service.findAll(); 
		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findOrder(@PathVariable Long id){
		Order obj = service.findOrder(id);
		return ResponseEntity.ok().body(obj);
	}
	
	
}
