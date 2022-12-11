package com.company.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.bean.Department;
import com.company.dao.DepartmentDao;

@Service
public class DepartmentServiceImplementation implements DepartmentService {

	@Autowired
	DepartmentDao deptDao;

	@Override
	public List<Department> getDepartment() {

		return (List<Department>) deptDao.findAll();
	}

	@Override
	public Optional<Department> getDepartment(int id) {

		return deptDao.findById(id);
	}

	@Override
	public Department addDepartment(Department department) {

		return deptDao.save(department);
	}

	@Override
	public Department updateDepartment(Department department) {

		return deptDao.save(department);
	}

	@Override
	public void deleteDepartment(int id) {

		deptDao.deleteById(id);
	}

}
