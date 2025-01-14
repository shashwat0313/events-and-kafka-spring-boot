package com.example.events.Events.Listeners;

import com.example.events.Entity.User;
import com.example.events.Events.Publishers.UserCreatedEvent;
import com.example.events.Services.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class UserCreatedEventListener {

    @Autowired
    private final UserService userService;

//  the below should trigger when the usercreatedevent is fired
    @EventListener
    public void onUserCreatedEvent(UserCreatedEvent e){
        log.info("usercreatedevent LISTENER called");

        User user = e.getUser();

        userService.saveNewUser(user.getUsername());
    }

}
