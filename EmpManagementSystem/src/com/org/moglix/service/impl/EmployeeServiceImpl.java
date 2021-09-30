package com.org.moglix.service.impl;

import com.org.moglix.dao.EmployeeDao;
import com.org.moglix.dao.impl.EmployeeDaoImpl;
import com.org.moglix.domain.Employee;
import com.org.moglix.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
	
	EmployeeDao empDao=EmployeeDaoImpl.getInstance();
	private static EmployeeService empService;
    private EmployeeServiceImpl() {
	}
    public static EmployeeService getInstance() {
		if(empService==null) {
			return new EmployeeServiceImpl();
		}
		return empService;
	}
	@Override
	public String addEmployee(Employee employee) {
		return this.empDao.addEmployee(employee);
	}

	@Override
	public Employee getById(String empId) {
		return empDao.getEmployeeById(empId);
	}

	@Override
	public String updateEmployeeById(Employee employee, String empId) {
		return this.empDao.updateEployee(employee, empId);
	}

	@Override
	public Employee[] getEmployeeList() {
		return empDao.getList();
	}

	@Override
	public String deleteEmployeeById(String empId) {
		return this.empDao.deleteEmployeById(empId);
	}

}
