package com.org.moglix.dao;

import com.org.moglix.domain.Cart;

public interface CartDao {
	public String saveOrUpdate(Cart cart);

	public Cart getById(Long cartId);

	public Cart[] getList();

	public String deleteById(Long cartId);
}
