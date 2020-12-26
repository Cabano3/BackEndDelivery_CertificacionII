package com.bano.backend.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.bano.backend.models.entities.Product;

public interface IProduct extends CrudRepository<Product, Long>{

}
