package com.org.moglix.controller;

import com.org.moglix.domain.Role;
import com.org.moglix.service.RoleService;
import com.org.moglix.service.impl.RoleServiceImpl;

public class RoleController {
	RoleService roleService = new RoleServiceImpl();

	public String saveOrUpdate(Role role) {
		return this.roleService.saveOrUpdate(role);
	}

	public Role getById(Long roleId) {
		return this.roleService.getById(roleId);
	}
	public Role[] list(){
		return this.roleService.getList();
	}
	public String delete (Long roleId) {
		return this.roleService.deleteById(roleId);
	}
}
