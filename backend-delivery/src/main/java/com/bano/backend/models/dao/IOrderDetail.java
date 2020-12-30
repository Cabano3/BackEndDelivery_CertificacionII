package com.bano.backend.models.dao;

import org.springframework.data.repository.CrudRepository;
import com.bano.backend.models.entities.OrderDetail;

public interface IOrderDetail extends CrudRepository<OrderDetail, Long>{

}


