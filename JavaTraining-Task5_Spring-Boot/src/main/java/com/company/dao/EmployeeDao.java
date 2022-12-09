package com.company.dao;

import org.springframework.data.repository.CrudRepository;

import com.company.bean.Employee;

public interface EmployeeDao extends CrudRepository<Employee, Integer> {

}
