package com.employee.tester;

import com.employee.service.EmployeeFunction;

public class TestEmployee {

	public static void main(String[] args) {
		EmployeeFunction employee = new EmployeeFunction();
		employee.addEmployee();
		//employee.countEmployee();
		//employee.filterLocation();
		employee.locateEmployee();
		//employee.checkSalary();
		//employee.sortName();
		//employee.sortLocation();
		employee.printAllEmployee();
	}

}
