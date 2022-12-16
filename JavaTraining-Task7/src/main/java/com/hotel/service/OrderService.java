package com.hotel.service;

import java.util.List;
import java.util.Optional;

import com.hotel.entity.Order;

public interface OrderService {
	public List<Order> getOrder();

	public Optional<Order> getOrderById(int id);

	public Order addOrder(Order order);

	public Order updateOrder(Order order);

	public void deleteOrder(int id);
}
