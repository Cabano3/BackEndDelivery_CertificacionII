package com.bano.backend.services.interfaces;

import java.util.List;

import com.bano.backend.models.entities.Product;

public interface IProductService {
	
	public void save(Product p);//create-update
	public Product findById(Long id);//retrieve	
	public void delete(Long id);//delete	
	public List<Product> findAll();//list
	
	/**** Custom methods ***/
	public List<Product> findByState(String status);
	public Product findByName(String criteria); //Find By Attribute Name	
	public List<Product> searchByName(String p);	
	
	
	
}
