package com.seba.dao;

import java.util.List;

import com.seba.model.User;


public interface UserDao {
	
	public User getById(int id);
	
	public User getByName(String username);
	
	public void save(User user);
	
	public List<User> list();

}
