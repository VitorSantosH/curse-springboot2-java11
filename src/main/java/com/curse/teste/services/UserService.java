package com.curse.teste.services;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.curse.teste.entities.User;
import com.curse.teste.repositories.UserRepository;
import com.curse.teste.services.exceptions.DatabaseException;
import com.curse.teste.services.exceptions.ResourceNotFoundException;

@Service
public class UserService {

		@Autowired
		private UserRepository repository;
		
		
		public List<User> findAll(){
			return repository.findAll();
		}
		
		public User findUser(Long id) {
			
			Optional<User> obj = repository.findById(id);
			
			return obj.orElseThrow(() -> new ResourceNotFoundException(id));
		}
	
		public User insert(User obj) {
			return repository.save(obj);
		}
		
		public void delete(Long id) {
		
			try {
				repository.deleteById(id);
			} catch ( EmptyResultDataAccessException E ) {
				throw new ResourceNotFoundException(E);
			} catch (DataIntegrityViolationException E) {
				throw new DatabaseException(E.getMessage());
			} 
			
			
		}
		
		public User update(Long id, User obj) {
			
			try {
				@SuppressWarnings("deprecation")
				User entity = repository.getOne(id);
				updateData(entity, obj);
				return repository.save(entity);
			} catch (EntityNotFoundException E) {
				throw new ResourceNotFoundException(E);
			}
			
		}

		private void updateData(User entity, User obj) {
			// TODO Auto-generated method stub
			entity.setName(obj.getName());
			entity.setEmail(obj.getEmail());
			entity.setPhone(obj.getPhone());
		}
}
