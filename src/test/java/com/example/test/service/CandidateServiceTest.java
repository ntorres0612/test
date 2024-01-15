package com.example.test.service;


import com.example.test.dto.CandidateDto;
import com.example.test.entity.Candidate;
import com.example.test.mapper.CandidateMapper;
import com.example.test.repository.CandidateRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class CandidateServiceTest {

    /*
    @Autowired
    private CandidateService candidateService;

    @Autowired
    private CandidateMapper candidateMapper;

    @MockBean
    private CandidateRepository candidateRepository;

    private Candidate candidate;
    @BeforeEach
    void setUp() {
        this.candidate = Candidate.builder()
                .name("Nelson")
                .email("nelson@gmail.com")
                .genre("M")
                .salary(1000L)
                .build();


        Mockito.when(candidateRepository.findById(1L)).thenReturn(Optional.of(candidate));

        Mockito.when(candidateRepository.findAll()).thenReturn(List.of(candidate));

        Mockito.when(candidateRepository.save( candidate )).thenReturn( candidate );

    }

    @Test
    public void getAllCandidates() {
        List<CandidateDto> candidates = candidateService.getAllCandidates();
        assertEquals(1, candidates.size());
    }

    @Test
    public void getCandidateById() {
        Long id = 1L;
        String expectedName = "Nelson";

        CandidateDto candidateDto = candidateService.getCandidateById(id);
        assertEquals(expectedName, candidateDto.getName());
    }

    @Test
    public void createCandidate() {
        String expectedName = "Nelson";

        CandidateDto candidateDto = candidateService.createCandidate(candidateMapper.toDto(this.candidate));
        assertEquals(expectedName, candidateDto.getName());
    }

    @Test
    public void updateCandidate() {
        String expectedName = "Nelson";
        Long id = 1L;
        this.candidate.setId(id);

        CandidateDto candidateDto = candidateService.updateCandidate(id, candidateMapper.toDto(this.candidate));
        assertEquals(expectedName, candidateDto.getName());
    }



     */
}