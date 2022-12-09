package com.employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.bean.Employee;
import com.employee.dao.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao empDao;

	@Override
	public List<Employee> getEmployee() {

		return (List<Employee>) empDao.findAll();
	}

	@Override
	public Optional<Employee> getEmployeeById(int id) {

		return empDao.findById(id);
	}

	@Override
	public Employee addEmployee(Employee employee) {

		return empDao.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {

		return empDao.save(employee);
	}

	@Override
	public void deleteEmployee(int id) {

		empDao.deleteById(id);
	}

}
