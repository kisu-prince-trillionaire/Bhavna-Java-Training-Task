package com.candidate.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.candidate.entity.Candidate;
import com.candidate.entity.Company;
import com.candidate.service.CandidateService;

@RestController
@RequestMapping("/candidate")
public class CandidateController {
	@Autowired
	private CandidateService service;

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/home")
	public String home() {
		return "Hello";
	}

	@GetMapping("/candidates")
	public List<Candidate> getCandidate() {
		Candidate candidate = (Candidate) this.service.getCandidate();
		Company company = (Company) this.restTemplate
				.getForObject("http://company-service/company/user/" + company.getCandidateId(), List.class);
		return this.service.getCandidate();
	}

	@GetMapping("/candidates/{id}")
	public Optional<Candidate> getCandidateById(@PathVariable int id) {
		Optional<Candidate> candidate = this.service.getCandidateById(id);
		Company company = (Company) this.restTemplate
				.getForObject("http://company-service/company/user/" + company.getCandidateId(), List.class);
		candidate.setCompany(company);
		return;
	}

	@PostMapping("/candidates")
	public Candidate addCandidate(@RequestBody Candidate candidate) {
		return this.service.addCandidate(candidate);
	}

	@PutMapping("/candidates")
	public Candidate updateCandidate(@RequestBody Candidate candidate) {
		return this.service.updateCandidate(candidate);
	}

	@DeleteMapping("/candidates/{id}")
	public ResponseEntity<HttpStatus> deleteCandidate(@PathVariable int id) {
		try {
			this.service.deleteCandidate(id);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
