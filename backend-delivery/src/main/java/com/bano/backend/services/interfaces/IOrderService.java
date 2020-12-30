package com.bano.backend.services.interfaces;

import java.util.List;
import com.bano.backend.models.entities.Order;

public interface IOrderService {

	
	public void save(Order o);//create-update
	
	public Order findById(Long id);//retrieve
	
	public void delete(Long id);//delete
	
	public List<Order> findAll();//list
	
}
