package com.org.moglix.service;

import com.org.moglix.domain.Employee;

public interface EmployeeService {
public String addEmployee(Employee employee);
public Employee getById(String empId);
public String updateEmployeeById(Employee employe,String empId);
public Employee[] getEmployeeList();
public String deleteEmployeeById(String empId);
}
