package com.employee.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.employee.bean.Employee;

@Repository
public interface EmployeeDao extends CrudRepository<Employee, Integer> {
	
}
