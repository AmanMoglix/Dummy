package com.org.moglix.dao;

import com.org.moglix.domain.Category;

public interface CategoryDao {
	public String saveOrUpdate(Category category);

	public Category getById(Long categyId);

	public Category[] getList();

	public String deleteById(Long categoryId);
}
