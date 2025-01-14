package com.example.events.Controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class C2 {

    @GetMapping("/c2")
    public ResponseEntity<?> c2test(){
        return new ResponseEntity<>("c2-response-c2", HttpStatus.OK);
    }

}
