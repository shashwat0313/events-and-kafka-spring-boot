package com.example.events.Events.Publishers;

import com.example.events.Services.C1PublisherService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class C1CallEventPublisher extends ApplicationEvent {

//  we can set some data members here, and have a constructor which sets them... Constructor(Object src, ...args){}

    public C1CallEventPublisher(C1PublisherService source){
        super(source);

        log.info("C1CallEvent constructor called with no args.");
    }

}
