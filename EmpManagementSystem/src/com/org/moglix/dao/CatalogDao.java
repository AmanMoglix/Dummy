package com.org.moglix.dao;

import java.util.List;

import com.org.moglix.domain.Catalog;

public interface CatalogDao {
	public String saveOrUpdate(Catalog catelog);

	public Catalog getById(Long catelogId);

	public List<Catalog> getList();

	public String  deleteById(Long catelogId);

}
