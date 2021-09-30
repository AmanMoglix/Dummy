package com.org.moglix.controller;

import com.org.moglix.domain.Employee;
import com.org.moglix.service.EmployeeService;
import com.org.moglix.service.impl.EmployeeServiceImpl;

public class EmployeeController {
	EmployeeService empService =  EmployeeServiceImpl.getInstance();

	public String addEmployee(Employee employee) {
		return this.empService.addEmployee(employee);
	}

	public Employee getById(String empId) {
		return this.empService.getById(empId);
	}

	public String updateEmployeeById(Employee employee, String empId) {
		return this.empService.updateEmployeeById(employee, empId);
	}

	public Employee[] getList() {
	return this.empService.getEmployeeList();
	}
	public String deleteEmployeeById(String empId) {
		return this.empService.deleteEmployeeById(empId);
	}
}
