package com.company.dao;

import org.springframework.data.repository.CrudRepository;

import com.company.bean.Department;

public interface DepartmentDao extends CrudRepository<Department, Integer> {

}
