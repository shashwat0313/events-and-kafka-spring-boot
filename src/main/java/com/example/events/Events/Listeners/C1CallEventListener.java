package com.example.events.Events.Listeners;


import com.example.events.Events.Publishers.C1CallEventPublisher;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class C1CallEventListener implements ApplicationListener<C1CallEventPublisher> {

    @Override
    public void onApplicationEvent(C1CallEventPublisher event) {
        log.info("C1 Event listener.");
    }

    @Override
    public boolean supportsAsyncExecution() {
        return false;
    }
}
