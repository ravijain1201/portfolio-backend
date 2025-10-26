package com.portfolio.portfolio.rest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:5173") // 👈 Add this line
@RestController
@RequestMapping("/api")
public class FirstController {

    @GetMapping("/hello")
    ResponseEntity<String> getMessage() {
        return ResponseEntity.ok("Hello this is ravi jain");
    }
}