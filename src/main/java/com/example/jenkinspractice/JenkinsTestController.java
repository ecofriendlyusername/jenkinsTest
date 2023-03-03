package com.example.jenkinspractice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
// d
@RestController
public class JenkinsTestController {
    @GetMapping("/helloworld")
    public ResponseEntity<?> helloWorld() {
        System.out.println("hello world ! ");
        return new ResponseEntity<String>("Hello World", HttpStatus.OK);
    }
}
