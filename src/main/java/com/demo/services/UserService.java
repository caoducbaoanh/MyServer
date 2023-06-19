package com.demo.services;

import com.demo.etities.User;

public interface UserService {
	public Iterable<User> findAll();
	
	public User find(String id);
	
	public void create(User user);
	
	public void update(User user);
	
	public void delete(String id);
}
