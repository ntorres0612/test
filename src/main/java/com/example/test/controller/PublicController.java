package com.example.test.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/test")
public class PublicController {

    @GetMapping
    public ResponseEntity<?> index() {
        return ResponseEntity.ok("SUCCESS");
    }
}
