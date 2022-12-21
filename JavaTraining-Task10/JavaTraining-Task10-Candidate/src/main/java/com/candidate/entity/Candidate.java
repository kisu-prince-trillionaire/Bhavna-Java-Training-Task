package com.candidate.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Candidate {
	@Id
	private int candidateId;
	private String candidateName;
	private String email;
	private long mobileNo;
	private Company company;

	public Candidate(int candidateId, String candidateName, String email, long mobileNo) {

		this.candidateId = candidateId;
		this.candidateName = candidateName;
		this.email = email;
		this.mobileNo = mobileNo;
	}

	public Candidate(int candidateId, String candidateName, String email, long mobileNo, Company company) {

		this.candidateId = candidateId;
		this.candidateName = candidateName;
		this.email = email;
		this.mobileNo = mobileNo;
		this.company = company;
	}

	public Candidate() {

	}

	public int getCandidateId() {
		return candidateId;
	}

	public void setCandidateId(int candidateId) {
		this.candidateId = candidateId;
	}

	public String getCandidateName() {
		return candidateName;
	}

	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Candidate [candidateId=" + candidateId + ", candidateName=" + candidateName + ", email=" + email
				+ ", mobileNo=" + mobileNo + ", company=" + company + "]";
	}

}
