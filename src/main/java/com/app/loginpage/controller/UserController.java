package com.app.loginpage.controller;

import com.app.loginpage.model.User;
import com.app.loginpage.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {


    UserRepository userRepository;


    @PostMapping("/login")
    public ResponseEntity<User> loginUser(@RequestBody User userData) {
        try {
            Optional<User> user = userRepository.findById(userData.getId());

            if (user.get().getPassword().equals(userData.getPassword()))
                return ResponseEntity.ok(user.get());

            return (ResponseEntity<User>) ResponseEntity.internalServerError();

        }catch (Throwable ex) {
            throw  new RuntimeException(ex.getMessage());
        }
    }
}
