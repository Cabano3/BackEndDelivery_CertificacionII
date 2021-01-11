package com.bano.backend.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.bano.backend.models.entities.Product;


public interface IProduct extends CrudRepository<Product, Long>{
	@Query("SELECT st FROM Product st WHERE st.name = :criteria")
	public Product buscarPorNombre(String criteria);
	
	public Product findByName(String name);
	

	@Query("SELECT st FROM Product st WHERE st.state = :status ORDER BY st.name") //JPQL 
	public List<Product> findByState(String status);
	
	public List<Product> findByNameStartingWith(String criteria);
	
	public List<Product> findByNameContaining(String param);
			
	@Query("SELECT st FROM Product st WHERE st.name LIKE %?1")
	public List<Product> findByNameContains(String name);	

}
