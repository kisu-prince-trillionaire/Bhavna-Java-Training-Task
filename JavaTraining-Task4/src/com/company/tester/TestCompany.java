package com.company.tester;

import com.company.bean.Department;
import com.company.bean.Employee;
import com.company.dao.CompanyDao;

public class TestCompany {

	public static void main(String[] args) {
		//insertEmployee();
		//updateEmployee();
		//insertDepartment();
		//updateDepartment();
		//viewEmployee();
		countEmployee();
	}

	public static void insertEmployee() {
		try {
			Employee employee = new Employee(115, "Sujeet Kumar", 500000, "01/08/2022", 1002);
			CompanyDao companyDao = new CompanyDao();
			int i = companyDao.insertEmployee(employee);
			if (i > 0) {
				System.out.println("Employee Inserted sucessfully");
			} else {
				System.out.println("Employee not inserted");
			}
		} catch (Exception e) {
			System.out.println();
		}
	}

	public static void insertDepartment() {
		try {
			Department department = new Department(1002, "Developer");
			CompanyDao companyDao = new CompanyDao();
			int i = companyDao.insertDepartment(department);
			if (i > 0) {
				System.out.println("Department Inserted sucessfully");
			} else {
				System.out.println("Department not inserted");
			}
		} catch (Exception e) {
			System.out.println();
		}
	}

	public static void updateEmployee() {
		try {
			Employee employee = new Employee(103, "Rahul Kumar", 5000000, "01/08/2022", 1002);
			CompanyDao companyDao = new CompanyDao();
			int i = companyDao.updateEmployee(employee);
			if (i > 0) {
				System.out.println("Employee Updated sucessfully");
			} else {
				System.out.println("Employee not Updated");
			}
		} catch (Exception e) {
			System.out.println();
		}
	}

	public static void updateDepartment() {
		try {
			Department department = new Department(1002, "Developer");
			CompanyDao companyDao = new CompanyDao();
			int i = companyDao.insertDepartment(department);
			if (i > 0) {
				System.out.println("Department Updated sucessfully");
			} else {
				System.out.println("Department not Updated");
			}
		} catch (Exception e) {
			System.out.println();
		}
	}

	public static void viewEmployee() {
		try {
			Employee employee = new Employee();
			CompanyDao companyDao = new CompanyDao();
			int i = companyDao.viewEmployee(employee);
			if (i > 0) {
				System.out.println("Employee View Available");
			} else {
				System.out.println("Employee not Available");
			}
		} catch (Exception e) {
			System.out.println();
		}
	}
	
	public static void countEmployee() {
		try {
			Employee employee = new Employee();
			CompanyDao companyDao = new CompanyDao();
			int i = companyDao.countEmployee(employee);
			if (i > 0) {
				System.out.println("Query Running ");
			} else {
				System.out.println("Query not running");
			}
		} catch (Exception e) {
			System.out.println();
		}
	}
}
