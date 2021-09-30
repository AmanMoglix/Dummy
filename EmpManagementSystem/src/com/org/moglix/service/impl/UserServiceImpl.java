package com.org.moglix.service.impl;

import com.org.moglix.dao.UserDao;
import com.org.moglix.dao.impl.UserDaoImpl;
import com.org.moglix.domain.User;
import com.org.moglix.service.UserService;

public class UserServiceImpl implements UserService {
UserDao userDao=new UserDaoImpl();
	@Override
	public String saveOrUpdate(User user) {
		return userDao.saveOrUpdate(user);
	}

	@Override
	public User getById(Long userId) {
		return userDao.getById(userId);
	}

	@Override
	public User[] getList() {
		return userDao.getList();
	}

	@Override
	public String deleteById(Long userId) {
		return userDao.deleteById(userId);		
	}

}
