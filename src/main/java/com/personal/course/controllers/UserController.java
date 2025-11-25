package com.personal.course.controllers;

import com.personal.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "John", "john@gmail.com", "xxxx-zzzz", "john123");
        return ResponseEntity.ok().body(u);
    }
}
