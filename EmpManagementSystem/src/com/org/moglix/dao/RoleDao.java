package com.org.moglix.dao;

import com.org.moglix.domain.Role;

public interface RoleDao {
	public String saveOrUpdate(Role Role);

	public Role getById(Long roleId);

	public Role[] getList();

	public String deleteById(Long roleId);
}
