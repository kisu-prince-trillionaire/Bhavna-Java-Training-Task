package com.company.bean;

public class Department {
	private int departmentId;
	private String deptName;

	public Department() {
		super();
	}

	public Department(int departmentId) {
		super();
		this.departmentId = departmentId;
	}

	public Department(int departmentId, String deptName) {
		super();
		this.departmentId = departmentId;
		this.deptName = deptName;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", deptName=" + deptName + "]";
	}

}
