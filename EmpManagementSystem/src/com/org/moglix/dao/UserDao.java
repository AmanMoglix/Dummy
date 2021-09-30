package com.org.moglix.dao;

import com.org.moglix.domain.User;

public interface UserDao {
	public String saveOrUpdate(User user);

	public User getById(Long userId);

	public User[] getList();

	public String deleteById(Long userId);
}
