package com.bano.backend.services.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.bano.backend.models.dao.IProduct;
import com.bano.backend.models.entities.Product;
import com.bano.backend.services.interfaces.IProductService;

public class ProductService implements IProductService {
	
	@Autowired
	private IProduct dao;

	@Override
	public void save(Product p) {
		try {
			dao.save(p);
		}
		catch(Exception ex) {
			throw ex; 
		}
	}

	@Override
	public Product findById(Long id) {
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
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return (List<Product>) dao.findAll();
	}

}
