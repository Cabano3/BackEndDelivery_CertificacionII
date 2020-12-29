package com.bano.backend.services.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bano.backend.models.dao.IUser;
import com.bano.backend.models.entities.User;
import com.bano.backend.services.interfaces.IUserService;

@Service
public class UserService implements IUserService{
	
	@Autowired
	private IUser dao;

	@Override
	public void save(User u) {
		// TODO Auto-generated method stub
		try {
			dao.save(u);
		}
		catch(Exception ex) {
			throw ex; 
		}
	}

	@Override
	public User findById(Long id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		try {
			dao.deleteById(id);
		}
		catch(Exception e) {
			throw e;
		}
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return (List<User>) dao.findAll();
	}

}
