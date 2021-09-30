package com.org.moglix.service;

import com.org.moglix.domain.User;

public interface UserService {
	public String saveOrUpdate(User user);

	public User getById(Long userId);

	public User[] getList();

	public String deleteById(Long userId);
}
