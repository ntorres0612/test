package com.example.test.service.impl;

import com.example.test.dto.CandidateDto;
import com.example.test.entity.Candidate;
//import com.example.test.mapper.CandidateMapper;
import com.example.test.mapper.CandidateMapper;
import com.example.test.repository.CandidateRepository;
import com.example.test.service.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateServiceImpl implements CandidateService {

	@Autowired
	private CandidateRepository candidateRepository;

	 @Autowired
	 private CandidateMapper candidateMapper;

	@Override
	public List<CandidateDto> getAllCandidates() {
		return candidateMapper.mapToCandidatesDto( candidateRepository.findAll());
	}

	@Override
	public CandidateDto getCandidateById(Long id) {
		return candidateMapper.toDto(candidateRepository.findById(id).orElse(null));

	}
	@Override
	public CandidateDto createCandidate(CandidateDto candidate) {
		Candidate candidateEntity = candidateMapper.toEntity(candidate);
		return candidateMapper.toDto(candidateRepository.save(candidateEntity));
	}

	@Override
	public CandidateDto updateCandidate( Long id, CandidateDto candidate) {
		Candidate candidateEntity = candidateMapper.toEntity(candidate);
		candidateEntity.setId(id);
		return candidateMapper.toDto(candidateRepository.save(candidateEntity));
	}
	@Override
	public void deleteCandidate(Long id) {
		candidateRepository.deleteById(id);
	}


}
