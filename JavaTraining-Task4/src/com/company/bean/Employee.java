package com.company.bean;

public class Employee extends Department {
	private int employeeId;
	private String name;
	private long salary;
	private String doj;

	public Employee() {
		super();
	}

	public Employee(int employeeId) {
		super();
		this.employeeId = employeeId;
	}

	public Employee(int employeeId, String name, long salary, String doj, int departmentId) {
		super(departmentId);
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
		this.doj = doj;
	}
	
	

	public Employee(int employeeId, String name, long salary, String doj, int departmentId, String deptName) {
		super(departmentId, deptName);
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
		this.doj = doj;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
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

	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", salary=" + salary + ", doj=" + doj
				+ ", DepartmentId=" + getDepartmentId() + "]";
	}

}
