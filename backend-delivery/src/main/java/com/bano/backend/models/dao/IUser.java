package com.bano.backend.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.bano.backend.models.entities.User;

public interface IUser extends CrudRepository<User, Long>{

}
