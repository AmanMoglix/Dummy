package com.org.moglix.service.impl;

import java.util.List;

import com.org.moglix.dao.CatalogDao;
import com.org.moglix.dao.impl.CatalogDaoImpl;
import com.org.moglix.domain.Catalog;
import com.org.moglix.service.CatalogService;

public class CatalogServiceImpl implements CatalogService {
	CatalogDao catalogDao = CatalogDaoImpl.getInstance();
	private static CatalogService catalogService;

	private CatalogServiceImpl() {
	}

	public static CatalogService getInstance() {
		if (catalogService == null) {
			catalogService = new CatalogServiceImpl();
			return catalogService;
		} else {
			return catalogService;
		}
	}

	@Override
	public String saveOrUpdate(Catalog catelog) {
		return catalogDao.saveOrUpdate(catelog);
	}

	@Override
	public Catalog getById(Long catelogId) {
		return catalogDao.getById(catelogId);
	}

	@Override
	public List<Catalog> getList() {
		return catalogDao.getList();
	}

	@Override
	public String deleteById(Long catelogId) {
		return catalogDao.deleteById(catelogId);
	}
}