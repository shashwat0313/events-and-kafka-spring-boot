package com.example.events.Controllers;

import com.example.events.Events.Publishers.C1CallEventPublisher;
import com.example.events.Services.C1PublisherService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class C1 {

    @Autowired
    private C1CallEventPublisher c1CallEventPublisher;

    @Autowired
    private C1PublisherService c1PublisherService;

    @GetMapping("/c1")
    public ResponseEntity<?> c1(){

        c1PublisherService.publishEvent();

        return new ResponseEntity<>("c1-response-c1", HttpStatus.OK);
    }

}
