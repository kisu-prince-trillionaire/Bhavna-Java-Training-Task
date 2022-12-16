package com.employee.service;

import java.util.List;

import com.employee.entity.Employee;

public interface EmployeeService {
	public void addEmployee(Employee employee);

	public void updateEmployee(Employee employee);

	public Employee getEmployeeById(int id);

	public void removeEmployee(int id);

	public List<Employee> listEmployees();
}
