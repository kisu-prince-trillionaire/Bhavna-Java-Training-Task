package com.databse.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
	public static Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String connectionString = "jdbc:mysql://localhost:3306/TASK4";
			connection = DriverManager.getConnection(connectionString, "root", "bhavna@123");
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return connection;
	}
}
