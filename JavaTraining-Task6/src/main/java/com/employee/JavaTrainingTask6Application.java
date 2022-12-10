package com.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaTrainingTask6Application {

	public static void main(String[] args) {
		SpringApplication.run(JavaTrainingTask6Application.class, args);
		System.out.println("Project Running Sucessfully at ");
		System.out.println("http://localhost:8080/employeeService/employees.wsdl");
	}

}
