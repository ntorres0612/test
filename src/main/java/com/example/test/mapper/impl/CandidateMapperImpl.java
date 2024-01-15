package com.example.test.mapper.impl;

import com.example.test.dto.CandidateDto;
import com.example.test.entity.Candidate;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

import com.example.test.mapper.CandidateMapper;
import org.springframework.stereotype.Component;

@Generated(
        value = "org.mapstruct.ap.MappingProcessor",
        date = "2024-01-15T03:37:39-0500",
        comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.6 (Eclipse Adoptium)"
)
@Component
public class CandidateMapperImpl implements CandidateMapper {

    @Override
    public CandidateDto toDto(Candidate candidate) {
        if ( candidate == null ) {
            return null;
        }

        CandidateDto candidateDto = new CandidateDto();

        candidateDto.setName( candidate.getName() );
        candidateDto.setEmail( candidate.getEmail() );
        candidateDto.setGenre( candidate.getGenre() );
        candidateDto.setSalary( candidate.getSalary() );

        return candidateDto;
    }

    @Override
    public Candidate toEntity(CandidateDto candidateDto) {
        if ( candidateDto == null ) {
            return null;
        }

        Candidate candidate = new Candidate();

        candidate.setName( candidateDto.getName() );
        candidate.setEmail( candidateDto.getEmail() );
        candidate.setGenre( candidateDto.getGenre() );
        candidate.setSalary( candidateDto.getSalary() );

        return candidate;
    }

    @Override
    public List<CandidateDto> mapToCandidatesDto(List<Candidate> candidates) {
        if ( candidates == null ) {
            return null;
        }

        List<CandidateDto> list = new ArrayList<CandidateDto>( candidates.size() );
        for ( Candidate candidate : candidates ) {
            list.add( toDto( candidate ) );
        }

        return list;
    }
}
