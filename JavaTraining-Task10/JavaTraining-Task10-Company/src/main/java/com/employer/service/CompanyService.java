package com.employer.service;

import java.util.List;
import java.util.Optional;

import com.employer.entity.Company;

public interface CompanyService {

	public List<Company> getCompany();

	public Optional<Company> getCompanyById(int id);

	public Company addCompany(Company company);

	public Company updateCompany(Company company);

	public void deleteCompany(int id);
}
