package com.org.moglix.service.impl;

import java.util.List;

import com.org.moglix.dao.CategoryDao;
import com.org.moglix.dao.impl.CategoryDaoImpl;
import com.org.moglix.domain.Category;
import com.org.moglix.service.CategoryService;

public class CategoryServiceImpl implements CategoryService {
CategoryDao categoryDao=new CategoryDaoImpl();
	@Override
	public String saveOrUpdate(Category category) {
		return categoryDao.saveOrUpdate(category);
	}

	@Override
	public Category getById(Long categoryId) {
		return categoryDao.getById(categoryId);
	}

	@Override
	public Category[] getList() {
		return categoryDao.getList();
	}

	@Override
	public String deleteById(Long categoryId) {
		return categoryDao.deleteById(categoryId);		
	}

}
