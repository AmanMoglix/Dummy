package com.org.moglix.controller;

import java.util.List;

import com.org.moglix.domain.Orders;
import com.org.moglix.service.impl.OrderServiceImpl;

public class OrderController {
	OrderServiceImpl orderService = new OrderServiceImpl();

	public String saveOrUpdate(Orders order) {
		return this.orderService.saveOrUpdate(order);
	}

	public Orders getById(Long orderId) {
		return this.orderService.getById(orderId);
	}

	public Orders[] list() {
		return this.orderService.getList();
	}

	public String delete(Long orderId) {
		return this.orderService.deleteById(orderId);
	}
}
