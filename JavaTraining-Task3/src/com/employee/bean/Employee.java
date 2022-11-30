package com.employee.bean;

public class Employee {
	private String name;
	private long salary;
	private String location;

	public Employee() {
	}

	public Employee(String name, long salary, String location) {
		this.name = name;
		this.salary = salary;
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", location=" + location + "]";
	}

}
