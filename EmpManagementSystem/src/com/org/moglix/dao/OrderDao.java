package com.org.moglix.dao;

import com.org.moglix.domain.Orders;

public interface OrderDao {
	public String saveOrUpdate(Orders order);

	public Orders getById(Long orderId);

	public Orders[] getList();

	public String deleteById(Long orderId);
}
