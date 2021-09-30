package com.org.moglix.dao;

import com.org.moglix.domain.Employee;

public interface EmployeeDao {
public String addEmployee(Employee employee);
public Employee getEmployeeById(String empId);
public String updateEployee(Employee employee,String empId);
public Employee[] getList();
public String deleteEmployeById(String empId);

}
