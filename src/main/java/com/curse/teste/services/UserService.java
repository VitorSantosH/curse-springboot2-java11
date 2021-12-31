package com.curse.teste.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curse.teste.entities.User;
import com.curse.teste.repositories.UserRepository;

@Service
public class UserService {

		@Autowired
		private UserRepository repository;
		
		
		public List<User> findAll(){
			return repository.findAll();
		}
		
		public User findUser(Long id) {
			
			Optional<User> obj = repository.findById(id);
			
			return obj.get();
		}
	
		public User insert(User obj) {
			return repository.save(obj);
		}
		
		public void delete(Long id) {
		
			repository.deleteById(id);
			
			
		}
}
