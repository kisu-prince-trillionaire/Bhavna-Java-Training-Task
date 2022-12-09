package com.company.service;

import java.util.List;
import java.util.Optional;

import com.company.bean.Employee;

public interface EmployeeService {
	
	public List<Employee> getEmployee();

	public Optional<Employee> getEmployee(int id);

	public Employee addEmployee(Employee employee);

	public Employee updateEmployee(Employee employee);

	public void deleteEmployee(int id);
}
