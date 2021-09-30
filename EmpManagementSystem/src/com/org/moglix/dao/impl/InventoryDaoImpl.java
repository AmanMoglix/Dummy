package com.org.moglix.dao.impl;

import com.org.moglix.dao.InventoryDao;
import com.org.moglix.domain.Inventory;

public class InventoryDaoImpl implements InventoryDao {
	private static int counter = 0;
	Inventory inventories[] = new Inventory[10];

	@Override
	public String saveOrUpdate(Inventory inventory) {
		if (this.getById(inventory.getInventroyId()) != null) {
			for (Inventory it : inventories) {
				if (it != null && it.getInventroyId() == inventory.getInventroyId()) {
					it.setUserId(inventory.getUserId());
					it.setProductId(inventory.getProductId());
					it.setProductPrice(inventory.getProductPrice());
					it.setProductQuantity(inventory.getProductQuantity());
					return "Update successfully with inventoryId " + inventory.getInventroyId() + "";
				}
			}
		} else {
			if (counter < inventories.length) {
				inventories[counter] = inventory;
			}
		}
		return "Inserted successfully ";
	}

	@Override
	public Inventory getById(Long inventoryId) {
		for (Inventory inventory : inventories) {
			if (inventory != null && inventory.getInventroyId() == inventoryId) {
				return inventory;
			}
		}
		return null;
	}

	@Override
	public Inventory[] getList() {
		return inventories;
	}

	@Override
	public String deleteById(Long inventoryId) {
		this.counter = 0;
		for (Inventory inventory : inventories) {
			if (inventory != null && inventory.getInventroyId() == inventoryId) {
				inventories[counter] = null;
				return "Deleted Successfully by inventoryId :" + inventoryId + "";
			} else {
				counter++;
			}
		}
		return "Internal Server error OR catalogId may not exist";

	}

}
