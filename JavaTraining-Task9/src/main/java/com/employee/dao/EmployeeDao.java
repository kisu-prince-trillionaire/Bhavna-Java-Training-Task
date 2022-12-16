package com.employee.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import com.employee.bean.Employee;

public interface EmployeeDao extends CrudRepository<Employee, Integer> {

	Page<List<Employee>> findAll(Pageable pageable);

}
