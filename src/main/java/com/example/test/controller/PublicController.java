package com.example.test.controller;


import com.example.test.dto.CandidateDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("")
public class PublicController {

    @GetMapping
    public ResponseEntity<?> index() {
        return ResponseEntity.ok("SUCCESS");
    }
}
