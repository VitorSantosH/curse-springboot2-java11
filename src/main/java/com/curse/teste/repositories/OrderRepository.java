package com.curse.teste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curse.teste.entities.Order;

public interface OrderRepository  extends JpaRepository<Order, Long>{

	
	
}
