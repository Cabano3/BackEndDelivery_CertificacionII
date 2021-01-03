package com.bano.backend.services.interfaces;

import java.util.List;

import com.bano.backend.models.entities.OrderDetail;

public interface IOrderDetailService {

	
	public void save(OrderDetail d);//create-update
	
	public OrderDetail findById(Long id);//retrieve
	
	public void delete(Long id);//delete
	
	public List<OrderDetail> findAll();//list

}
