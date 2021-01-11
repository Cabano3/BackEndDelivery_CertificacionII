package com.bano.backend.services.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bano.backend.models.dao.IProduct;
import com.bano.backend.models.entities.Product;
import com.bano.backend.services.interfaces.IProductService;

@Service
public class ProductService implements IProductService {
	
	@Autowired
	private IProduct dao;

	@Override
	@Transactional
	public void save(Product p) {
		try {
			dao.save(p);
		}
		catch(Exception ex) {
			throw ex; 
		}
	}

	@Override
	@Transactional(readOnly=true)
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
	@Transactional(readOnly=true)
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return (List<Product>) dao.findAll();
	}
	
	@Override
	@Transactional(readOnly=true)
	public List<Product> findByState(String status) {		
		return (List<Product>) dao.findByState(status);
	}
	@Override
	@Transactional(readOnly=true)
	public Product findByName(String criteria) {		
		return dao.buscarPorNombre(criteria);
	}
	
	@Override
	@Transactional(readOnly=true)
	public List<Product> searchByName(String a) {		
		return dao.findByNameStartingWith(a);
	}


}
