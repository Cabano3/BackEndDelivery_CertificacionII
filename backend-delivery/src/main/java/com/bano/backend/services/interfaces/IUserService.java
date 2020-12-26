package com.bano.backend.services.interfaces;

import java.util.List;

import com.bano.backend.models.entities.User;

public interface IUserService {

	public void save(User u);//create-update
	
	public User findById(Long id);//retrieve
	
	public void delete(Long id);//delete
	
	public List<User> findAll();//list
	
}
