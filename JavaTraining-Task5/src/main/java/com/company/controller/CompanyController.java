package com.company.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.bean.Department;
import com.company.bean.Employee;
import com.company.service.DepartmentService;
import com.company.service.EmployeeService;

@RestController
@RequestMapping(path = "/output", produces = "application/xml")
public class CompanyController {
	@Autowired
	private EmployeeService empService;
	
	@Autowired
	private DepartmentService deptService;
	
	@GetMapping("/home")
	public String home() {
		return "Hello";
	}
	
	@GetMapping("/employees")
	public List<Employee> getEmployee() {
		return this.empService.getEmployee();
	}
	
	@GetMapping("/employees/{id}")
	public Optional<Employee> getEmployee(@PathVariable int id) {
		return this.empService.getEmployee(id);
	}
	
	@PostMapping("/employees")
	public Employee addEmployee(@RequestBody Employee employee) {
		return this.empService.addEmployee(employee);
	}
	
	@PutMapping("/employees")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return this.empService.updateEmployee(employee);
	}
	
	@DeleteMapping("/employees/{id}")
	public ResponseEntity<HttpStatus> deleteEmployee (@PathVariable int id) {
		try {
			this.empService.deleteEmployee(id);
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/departments")
	public List<Department> getDepartment() {
		return this.deptService.getDepartment();
	}
	
	@GetMapping("/departments/{id}")
	public Optional<Department> getDepartment(@PathVariable int id) {
		return this.deptService.getDepartment(id);
	}
	
	@PostMapping("/departments")
	public Department addDepartment(@RequestBody Department department) {
		return this.deptService.addDepartment(department);
	}
	
	@PutMapping("/departments")
	public Department updateDepartment(@RequestBody Department department) {
		return this.deptService.updateDepartment(department);
	}
	
	@DeleteMapping("/departments/{id}")
	public ResponseEntity<HttpStatus> deleteDepartment (@PathVariable int id) {
		try {
			this.deptService.deleteDepartment(id);
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
