package com.candidate.service;

import java.util.List;
import java.util.Optional;

import com.candidate.entity.Candidate;

public interface CandidateService {

	public List<Candidate> getCandidate();

	public Optional<Candidate> getCandidateById(int id);

	public Candidate addCandidate(Candidate candidate);

	public Candidate updateCandidate(Candidate candidate);

	public void deleteCandidate(int id);
}
