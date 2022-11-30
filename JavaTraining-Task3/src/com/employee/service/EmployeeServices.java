package com.employee.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.employee.bean.Employee;

public class EmployeeServices {
	static List<Employee> employeeList = new ArrayList<Employee>();

	public void addEmployee() {
		employeeList.add(new Employee("Vishal Kumar", 500000, "Chennai"));
		employeeList.add(new Employee("Rajiv Kumar", 300000, "Hyderabad"));
		employeeList.add(new Employee("Piyush Kumar", 400000, "Pune"));
		employeeList.add(new Employee("Rakesh Kumar", 200000, "Kolkata"));
		employeeList.add(new Employee("Sanjay Kumar", 50000, "Bengaluru"));
		employeeList.add(new Employee("Kailash Kumar", 800000, "Chennai"));
		employeeList.add(new Employee("Akhilesh Kumar", 500000, "Konchi"));
		employeeList.add(new Employee("Prince Kumar", 550000, "Gurgao"));
		employeeList.add(new Employee("Uttam Kumar", 500000, "Noida"));
		employeeList.add(new Employee("Rahul Kumar", 650000, "Delhi"));
		employeeList.add(new Employee("Saurav Kumar", 6500, "Hyderabad"));
	}

	public void printAllEmployee() {
		System.out.println("\nXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		System.out.println("Details of All Employees");
		Iterator<Employee> employeeItr = employeeList.iterator();
		while (employeeItr.hasNext()) {
			System.out.println(employeeItr.next());
		}
	}
}
