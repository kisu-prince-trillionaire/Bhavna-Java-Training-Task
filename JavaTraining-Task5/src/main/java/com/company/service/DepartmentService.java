package com.company.service;

import java.util.List;
import java.util.Optional;

import com.company.bean.Department;

public interface DepartmentService {

	public List<Department> getDepartment();

	public Optional<Department> getDepartment(int id);

	public Department addDepartment(Department department);

	public Department updateDepartment(Department department);

	public void deleteDepartment(int id);
}
