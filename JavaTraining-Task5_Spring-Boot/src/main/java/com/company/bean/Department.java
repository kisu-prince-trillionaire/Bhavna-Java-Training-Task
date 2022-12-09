package com.company.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Department {
	@Id
	private int deptid;
	private String deptName;

	public Department() {
		super();
	}

	public Department(int deptid, String deptName) {
		super();
		this.deptid = deptid;
		this.deptName = deptName;
	}

	public int getDeptid() {
		return deptid;
	}

	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "Department [deptid=" + deptid + ", deptName=" + deptName + "]";
	}

}
