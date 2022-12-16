package com.hotel.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hotel.entity.Order;

@Repository
public interface OrderDao extends CrudRepository<Order, Integer> {

}
