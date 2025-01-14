package com.example.events.Events.Publishers;

import com.example.events.Entity.User;
import com.example.events.Services.UserService;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;

@Slf4j
@Getter
public class UserCreatedEvent extends ApplicationEvent {

    private final User user;

    public UserCreatedEvent(Object source) {
        super(source);

        log.info("usercreatedevent constructor called");

        this.user = (User) source;
    }
}
