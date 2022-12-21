package com.employer.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Company {
	@Id
	private int companyId;
	private String companyName;
	private String location;
	private int candidateId;

	public Company() {

	}

	public Company(int companyId, String companyName, String location) {

		this.companyId = companyId;
		this.companyName = companyName;
		this.location = location;
	}

	public Company(int companyId, String companyName, String location, int candidateId) {
		super();
		this.companyId = companyId;
		this.companyName = companyName;
		this.location = location;
		this.candidateId = candidateId;
	}

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getCandidateId() {
		return candidateId;
	}

	public void setCandidateId(int candidateId) {
		this.candidateId = candidateId;
	}

	@Override
	public String toString() {
		return "Company [companyId=" + companyId + ", companyName=" + companyName + ", location=" + location
				+ ", candidateId=" + candidateId + "]";
	}
}
