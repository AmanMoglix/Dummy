package com.org.moglix.dao;

import com.org.moglix.domain.Inventory;

public interface InventoryDao {
	public String saveOrUpdate(Inventory inventory);

	public Inventory getById(Long inventoryId);

	public Inventory[] getList();

	public String deleteById(Long inventoryId);
}
