package com.org.moglix.service;

import java.util.List;

import com.org.moglix.domain.Cart;

public interface CartService {
	public String saveOrUpdate(Cart cart);

	public Cart getById(Long cartId);

	public Cart[] getList();

	public String deleteById(Long cartId);
}
