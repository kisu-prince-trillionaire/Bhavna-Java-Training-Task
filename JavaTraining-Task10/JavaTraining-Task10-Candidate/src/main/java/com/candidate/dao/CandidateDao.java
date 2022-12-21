package com.candidate.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.candidate.entity.Candidate;

@Repository
public interface CandidateDao extends CrudRepository<Candidate, Integer> {

}
