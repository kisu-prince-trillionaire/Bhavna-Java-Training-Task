package com.employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;

import com.employee.bean.Employee;

public interface EmployeeService {
	public List<Employee> getEmployee();
	
	public Page<List<Employee>> getEmployeeByPage(int pageNumber, int pageSize);

	public Optional<Employee> getEmployee(int id);

	public Employee addEmployee(Employee employee);

	public Employee updateEmployee(Employee employee);

	public void deleteEmployee(int id);
}
