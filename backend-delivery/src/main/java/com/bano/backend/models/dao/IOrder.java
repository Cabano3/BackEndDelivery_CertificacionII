package com.bano.backend.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.bano.backend.models.entities.Order;



public interface IOrder extends CrudRepository<Order, Long>{



}
