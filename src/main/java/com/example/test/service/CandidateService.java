package com.example.test.service;


import com.example.test.dto.CandidateDto;

import java.util.List;

public interface CandidateService {
	List<CandidateDto> getAllCandidates();
	CandidateDto getCandidateById(Long id);
	CandidateDto createCandidate(CandidateDto candidate);
	 void deleteCandidate(Long idCandidate);
	CandidateDto updateCandidate(Long id, CandidateDto candidate);
}
