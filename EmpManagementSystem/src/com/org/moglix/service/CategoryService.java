package com.org.moglix.service;

import java.util.List;

import com.org.moglix.domain.Category;

public interface CategoryService {
	public String saveOrUpdate(Category category);

	public Category getById(Long categoryId);

	public Category[] getList();

	public String deleteById(Long categoryId);
}
