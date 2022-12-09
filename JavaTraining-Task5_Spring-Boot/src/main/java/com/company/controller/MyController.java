//package com.company.controller;
//
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.company.bean.Employee;
//
//@RestController
//@RequestMapping(path = "/company", produces = "application/xml")
//public class MyController {
//
//	@GetMapping("/getEmployee")
//	public ResponseEntity<Employee> getEmployee() {
//		Employee model = new Employee();
//		model.setEmpId(103);
//		model.setEmpName("Rahul");
//		model.setSalary(60000);
//		model.setStatus("active");
//		model.setDepartment(1001,"Developerr");;
//		
//		HttpHeaders hearders = new HttpHeaders();
//		ResponseEntity<Employee> entityModel = new ResponseEntity<>(model, hearders, HttpStatus.CREATED);
//
//		return entityModel;
//	}
//}
