package com.example.test.mapper;

import com.example.test.dto.CandidateDto;
import com.example.test.entity.Candidate;

import java.util.List;


public interface CandidateMapper {

    CandidateDto toDto(Candidate candidate);

    Candidate toEntity(CandidateDto candidateDto);

    List<CandidateDto> mapToCandidatesDto(List<Candidate> candidates);

}
