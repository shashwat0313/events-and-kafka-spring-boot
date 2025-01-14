package com.example.events.Services;

import com.example.events.Entity.User;
import com.example.events.Repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {

    @Autowired
    UserRepository userRepository;

    public void saveNewUser(String username){
        log.info("userservice called - create");
        User user = new User(username);

        userRepository.save(user);
    }

}
