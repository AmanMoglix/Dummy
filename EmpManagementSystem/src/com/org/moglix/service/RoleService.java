package com.org.moglix.service;

import java.util.List;

import com.org.moglix.domain.Role;

public interface RoleService {
	public String saveOrUpdate(Role Role);

	public Role getById(Long roleId);

	public Role[] getList();

	public String deleteById(Long roleId);
}
