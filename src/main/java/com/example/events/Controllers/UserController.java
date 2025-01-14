package com.example.events.Controllers;

import com.example.events.Entity.User;
import com.example.events.Events.Publishers.UserCreatedEvent;
import com.example.events.Services.UserService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    private final ApplicationEventPublisher eventPublisher;

    public ResponseEntity<?> getUser(){
        return null;
    }

    @GetMapping("/users/create/{username}")
    public ResponseEntity<?> createUser(@PathVariable String username){
        log.info("username received: " + username);

        try{
            eventPublisher.publishEvent( new UserCreatedEvent( new User(username) ) );

            return new ResponseEntity<>("event to create user sent", HttpStatus.OK);
        }
        catch (Exception exception){
            log.error("exception: " + exception);
            return new ResponseEntity<>("failed to save user.", HttpStatus.INTERNAL_SERVER_ERROR);
        }

//        try{
//            userService.saveNewUser(username);
//            log.info("saving done");
//            return new ResponseEntity<>("Success.", HttpStatus.OK);
//        }
//        catch (Exception exception){
//            log.error("exception: " + exception);
//            return new ResponseEntity<>("failed to save user.", HttpStatus.INTERNAL_SERVER_ERROR);
//        }
    }

    public ResponseEntity<?> modifyUser(){
        return null;
    }

    public ResponseEntity<?> deleteUser(){
        return null;
    }

}
