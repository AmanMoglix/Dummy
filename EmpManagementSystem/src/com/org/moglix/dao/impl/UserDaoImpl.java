package com.org.moglix.dao.impl;

import java.util.List;

import com.org.moglix.dao.UserDao;
import com.org.moglix.domain.User;

public class UserDaoImpl implements UserDao {
	private static int counter = 0;
	User users[] = new User[10];

	@Override
	public String saveOrUpdate(User user) {
		if (this.getById(user.getUserId()) != null) {
			for (User it : users) {
				if (it != null && it.getUserId() == user.getUserId()) {
					it.setEmail(user.getEmail());
					it.setRoleId(user.getRoleId());
					it.setUserName(user.getUserName());
					it.setUserPassword(user.getUserPassword());
				}
			}
			return "Updated successfully by userId " + user.getUserId() + "";
		} else {
			users[counter] = user;
		}
		return "Inserted successfully ";
	}

	@Override
	public User getById(Long userId) {
		for (User user : users) {
			if (user != null && user.getUserId() == userId) {
				return user;
			}
		}
		return null;
	}

	@Override
	public User[] getList() {
		return users;
	}

	@Override
	public String deleteById(Long userId) {
		this.counter = 0;
		for (User user : users) {
			if (user != null && user.getUserId() == userId) {
				users[counter] = null;
				return "Deleted Successfully by userId : " + userId + "";
			} else {
				counter++;
			}
		}
		return "Deletion not performed";
	}

}
