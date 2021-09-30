package com.org.moglix.service;

import java.util.List;

import com.org.moglix.domain.Catalog;

public interface CatalogService {
	public String saveOrUpdate(Catalog catelog);

	public Catalog getById(Long catelogId);

	public List<Catalog> getList();

	public String deleteById(Long catelogId);
}
