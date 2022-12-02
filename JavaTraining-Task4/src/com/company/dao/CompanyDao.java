package com.company.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.company.bean.Department;
import com.company.bean.Employee;
import com.databse.connection.DatabaseConnection;

public class CompanyDao {
	public int insertEmployee(Employee employee) {
		int i = 0;
		PreparedStatement statement = null;
		Connection connection = null;
		try {
			connection = DatabaseConnection.getConnection();
			statement = connection.prepareStatement("INSERT INTO EMPLOYEE VALUES(?,?,?,?,?)");

			int eId = employee.getEmployeeId();
			String eName = employee.getName();
			long eSalary = employee.getSalary();
			String eDoj = employee.getDoj();
			int dId = employee.getDepartmentId();

			statement.setInt(1, eId);
			statement.setString(2, eName);
			statement.setLong(3, eSalary);
			statement.setString(4, eDoj);
			statement.setInt(5, dId);

			i = statement.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return i;
	}

	public int insertDepartment(Department department) {
		int i = 0;
		PreparedStatement statement = null;
		Connection connection = null;
		try {
			connection = DatabaseConnection.getConnection();
			statement = connection.prepareStatement("INSERT INTO DEPARTMENT VALUES(?,?)");

			int dId = department.getDepartmentId();
			String dName = department.getDeptName();

			statement.setInt(1, dId);
			statement.setString(2, dName);

			i = statement.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return i;
	}

	public int updateEmployee(Employee employee) {
		int i = 0;
		PreparedStatement statement = null;
		Connection connection = null;
		try {
			connection = DatabaseConnection.getConnection();

			int eId = employee.getEmployeeId();
			long eSalary = employee.getSalary();

			String query = "UPDATE EMPLOYEE SET SALARY = ? WHERE EMPLOYEE_ID = ?";
			statement = connection.prepareStatement(query);

			statement.setLong(1, eSalary);
			statement.setInt(2, eId);

			i = statement.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return i;
	}

	public int updateDepartment(Department department) {
		int i = 0;
		PreparedStatement statement = null;
		Connection connection = null;
		try {
			connection = DatabaseConnection.getConnection();

			int dId = department.getDepartmentId();
			String dName = department.getDeptName();

			String query = "UPDATE DEPARTMENT SET DEPARTMENT_ID = ? WHERE DEPARTMENT_NAME = ?";
			statement = connection.prepareStatement(query);

			statement.setInt(1, dId);
			statement.setString(2, dName);

			i = statement.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return i;
	}

	public int viewEmployee(Employee employee) {
		int i = 0;
		PreparedStatement statement = null;
		Connection connection = null;
		ResultSet res = null;
		try {
			connection = DatabaseConnection.getConnection();
			String query = "SELECT * FROM EMPLOYEE";
			statement = connection.prepareStatement(query);
			res = statement.executeQuery(query);

			while (res.next()) {
				System.out.println(res.getInt(1) + " " + res.getString(2) + " " + res.getLong(3) + " "
						+ res.getString(4) + " " + res.getInt(5));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return i;
	}

	public int countEmployee(Employee employee) {
		int i = 0;
		PreparedStatement statement = null;
		Connection connection = null;
		ResultSet res = null;
		try {
			connection = DatabaseConnection.getConnection();
			String query = "SELECT DISTINCT(D.DEPARTMENT_ID), D.DEPARTMENT_NAME, COUNT(EMPLOYEE_ID) AS NO_OF_EMPLOYEES\r\n"
					+ "FROM DEPARTMENT AS D\r\n" + "INNER JOIN EMPLOYEE AS E\r\n"
					+ "ON D.DEPARTMENT_ID = E.DEPARTMENT_ID\r\n" + "WHERE E.SALARY>30000\r\n"
					+ "GROUP BY DEPARTMENT_ID";
			statement = connection.prepareStatement(query);
			res = statement.executeQuery(query);

			while (res.next()) {
				System.out.println(res.getInt(1) + " " + res.getString(2) + " " + res.getInt(3));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return i;
	}
}
