package com.example.events.Services;

import com.example.events.Events.Publishers.C1CallEventPublisher;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;


@Slf4j
@Service
public class C1PublisherService {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void publishEvent(){
        log.info("Publishing C1 event");

        applicationEventPublisher.publishEvent(
                new C1CallEventPublisher(this)
        );

        log.info("C1 Event cycle complete");
    }

}
