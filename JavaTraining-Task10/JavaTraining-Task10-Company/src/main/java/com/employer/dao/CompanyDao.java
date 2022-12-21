package com.employer.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.employer.entity.Company;

@Repository
public interface CompanyDao extends CrudRepository<Company, Integer> {

}
