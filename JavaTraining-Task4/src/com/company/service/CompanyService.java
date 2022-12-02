package com.company.service;

import com.company.bean.Department;
import com.company.bean.Employee;
import com.company.dao.CompanyDao;

public class CompanyService {
	CompanyDao dao;

	public void insertEmployee(Employee employee) {
		dao.insertEmployee(employee);
	}

	public void insertDepartment(Department department) {
		dao.insertDepartment(department);
	}

	public void updateEmployee(Employee employee) {
		dao.updateEmployee(employee);
	}

	public void updateDepartment(Department department) {
		dao.updateDepartment(department);
	}

	public void viewEmployee(Employee employee) {
		dao.viewEmployee(employee);
	}
}
