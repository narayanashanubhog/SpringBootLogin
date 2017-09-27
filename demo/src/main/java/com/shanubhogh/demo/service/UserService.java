package com.shanubhogh.demo.service;

import com.shanubhogh.demo.model.User;

public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
	
}
