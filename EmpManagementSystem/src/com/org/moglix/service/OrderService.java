package com.org.moglix.service;

import java.util.List;

import com.org.moglix.domain.Orders;

public interface OrderService {
	public String saveOrUpdate(Orders order);

	public Orders getById(Long orderId);

	public Orders[] getList();

	public String deleteById(Long orderId);
}
