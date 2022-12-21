package com.employer.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employer.dao.CompanyDao;
import com.employer.entity.Company;

@Service
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	CompanyDao dao;

	@Override
	public List<Company> getCompany() {

		return (List<Company>) dao.findAll();
	}

	@Override
	public Optional<Company> getCompanyById(int id) {

		return dao.findById(id);
	}

	@Override
	public Company addCompany(Company company) {

		return dao.save(company);
	}

	@Override
	public Company updateCompany(Company company) {

		return dao.save(company);
	}

	@Override
	public void deleteCompany(int id) {

		dao.deleteById(id);
	}

}
