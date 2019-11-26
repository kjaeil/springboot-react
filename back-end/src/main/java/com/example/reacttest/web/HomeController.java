package com.example.reacttest.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class HomeController {

    @GetMapping(value = "/index")
    public ResponseEntity<?> index() {
        return new ResponseEntity("Hello World!!!", HttpStatus.OK);
    }
}
