package com.example.githubactions.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public ResponseEntity<?> sayHello() {
        return new ResponseEntity<>("Hello World!", HttpStatus.OK);
    }

}
