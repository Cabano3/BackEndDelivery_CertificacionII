package com.bano.backend.services.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bano.backend.models.dao.IOrderDetail;
import com.bano.backend.models.entities.OrderDetail;
import com.bano.backend.services.interfaces.IOrderDetailService;



@Service
public class OrderDetailService implements IOrderDetailService {
	
	@Autowired
	private IOrderDetail dao;

	@Override
	public void save(OrderDetail d) {
		try {
			dao.save(d);
		}
		catch(Exception ex) {
			throw ex; 
		}
	}

	@Override
	public OrderDetail findById(Long id) {
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
	public List<OrderDetail> findAll() {
		// TODO Auto-generated method stub
		return (List<OrderDetail>) dao.findAll();
	}

}




