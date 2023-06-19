package com.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.etities.User;
import com.demo.repositories.UserRepository;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public Iterable<User> findAll() {
		return userRepository.findAll();
	}

	@Override
	public User find(String id) {
		return userRepository.findById(id).get();
	}

	@Override
	public void create(User user) {
		userRepository.save(user);
		
	}

	@Override
	public void update(User user) {
		userRepository.save(user);
		
	}

	@Override
	public void delete(String id) {
		userRepository.deleteById(id);
		
	}
	
}
