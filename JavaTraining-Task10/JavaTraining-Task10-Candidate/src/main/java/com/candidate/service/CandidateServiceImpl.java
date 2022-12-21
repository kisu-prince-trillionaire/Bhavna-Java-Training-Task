package com.candidate.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.candidate.dao.CandidateDao;
import com.candidate.entity.Candidate;

@Service
public class CandidateServiceImpl implements CandidateService {

	@Autowired
	CandidateDao dao;

	@Override
	public List<Candidate> getCandidate() {

		return (List<Candidate>) dao.findAll();
	}

	@Override
	public Optional<Candidate> getCandidateById(int id) {

		return dao.findById(id);
	}

	@Override
	public Candidate addCandidate(Candidate candidate) {

		return dao.save(candidate);
	}

	@Override
	public Candidate updateCandidate(Candidate candidate) {

		return dao.save(candidate);
	}

	@Override
	public void deleteCandidate(int id) {

		dao.deleteById(id);
	}

}
