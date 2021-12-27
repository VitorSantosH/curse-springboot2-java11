package com.curse.teste.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curse.teste.entities.Order;
import com.curse.teste.repositories.OrderRepository;

@Service
public class OrderService {

		@Autowired
		private OrderRepository repository;
		
		
		public List<Order> findAll(){
			return repository.findAll();
		}
		
		public Order findOrder(Long id) {
			
			Optional<Order> obj = repository.findById(id);
			
			return obj.get();
		}
	
}
