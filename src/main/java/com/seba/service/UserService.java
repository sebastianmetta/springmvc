package com.seba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.seba.dao.UserDao;
import com.seba.model.User;

public class UserService {

	@Autowired
	private UserDao userDao;

	public UserService() {
		
	}
	
	public List<User> listUsers(){
		return userDao.list();
	}
	
	public void saveUser(User user) {
		userDao.save(user);
	}

	public User getUser(String username) {
		userDao.getByName(username);
		return null;
	}
}
