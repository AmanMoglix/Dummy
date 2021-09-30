package com.org.moglix.controller;

import java.util.List;

import com.org.moglix.domain.User;
import com.org.moglix.service.UserService;
import com.org.moglix.service.impl.UserServiceImpl;

public class UserController {
	UserService userService = new UserServiceImpl();

	public String saveOrUpdate(User user) {
		return this.userService.saveOrUpdate(user);
	}

	public User getById(Long userId) {
		return this.userService.getById(userId);
	}

	public User[] list() {
		return this.userService.getList();
	}

	public void delete(Long userId) {
		this.userService.deleteById(userId);
		;
	}
}
