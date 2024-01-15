package com.example.test.controller;

import com.example.test.dto.CandidateDto;
import com.example.test.service.CandidateService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(CandidateController.class)
class CandidateControllerTest {

    /*
    @Autowired
    MockMvc mockMvc;

    @MockBean
    private CandidateService candidateService;

    private CandidateDto candidateDto;
    @BeforeEach
    void setUp() {
        this.candidateDto = CandidateDto.builder().name("Nelson")
                .email("nelson@gmail.com")
                .genre("M")
                .salary(1000L)
                .build();

    }

    @Test
    public void saveCandidate() throws Exception {
        CandidateDto postCandidateDto = CandidateDto.builder()
                .name("Nelson")
                .email("nelson@gmail.com")
                .genre("M")
                .salary(1000L)
                .build();
        Mockito.when(candidateService.createCandidate(postCandidateDto)).thenReturn(this.candidateDto);


        String body = "{\n" +
                "    \"email\":\"nelson@gmailcom\",\n" +
                "    \"password\": \"123456\",\n" +
                "}";

        MvcResult result = mockMvc.perform(
                MockMvcRequestBuilders
                        .post("/auth/login")
                        .content(body))
                .andExpect(status().isOk()).andReturn();
        String response = result.getResponse().getContentAsString();
        System.out.println(response);

        mockMvc.perform(post("/saveLocal")
                        .contentType(MediaType.APPLICATION_JSON)
                        .header("Bearer", "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJuZWxzb25AZ21haWxjb20iLCJpYXQiOjE3MDUzMTM2NzUsImV4cCI6MTcwNTMxNzI3NX0.FBs5Ecnx5qezFtGc-JYzTWDlcjIlXBBmxk4cLgv4OZM")
                        .content("{\n" +
                                "    \"name\":\"Nelson\",\n" +
                                "    \"email\":\"nelson@gmail.com\",\n" +
                                "    \"genre\": \"M\",\n" +
                                "    \"salary\":\"1000\"\n" +
                                "}"))
                .andExpect(status().isOk());


    }

     */
}