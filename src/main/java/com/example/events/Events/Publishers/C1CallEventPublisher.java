package com.example.events.Events.Publishers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class C1CallEventPublisher extends ApplicationEvent {

    public C1CallEventPublisher(Object source){
        super(source);

        log.info("C1CallEvent constructor called with no args.");
    }

}
