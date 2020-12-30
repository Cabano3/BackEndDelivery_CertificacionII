package com.bano.backend.services.implementation;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bano.backend.models.dao.IOrder;
import com.bano.backend.models.entities.Order;
import com.bano.backend.services.interfaces.IOrderService;


@Service
public class OrderService implements IOrderService {
	
	

	@Autowired
	private IOrder dao;

	@Override
	public void save(Order o) {
		try {
			dao.save(o);
		}
		catch(Exception ex) {
			throw ex; 
		}
	}

	@Override
	public Order findById(Long id) {
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
	public List<Order> findAll() {
		// TODO Auto-generated method stub
		return (List<Order>) dao.findAll();
	}

}

