package com.org.moglix.controller;

import com.org.moglix.domain.Cart;
import com.org.moglix.service.CartService;
import com.org.moglix.service.impl.CartServiceImpl;

public class CartController {
	CartService cartSevice = new CartServiceImpl();

	public String saveOrUpdate(Cart cart) {
		return this.cartSevice.saveOrUpdate(cart);
	}

	public Cart getById(Long cartId) {
		return this.cartSevice.getById(cartId);
	}

	public Cart[] list() {
		return this.cartSevice.getList();
	}

	public String delete(Long cartId) {
		return this.cartSevice.deleteById(cartId);
	}
}
