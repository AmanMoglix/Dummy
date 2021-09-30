package com.org.moglix.service;

import java.util.List;

import com.org.moglix.domain.Inventory;

public interface InventoryService {
	public String saveOrUpdate(Inventory inventory);

	public Inventory getById(Long inventoryId);

	public Inventory[] getList();

	public String deleteById(Long inventoryId);
}
