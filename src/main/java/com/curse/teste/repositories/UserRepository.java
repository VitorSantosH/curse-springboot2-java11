package com.curse.teste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curse.teste.entities.User;

public interface UserRepository  extends JpaRepository<User, Long>{

	
	
}
