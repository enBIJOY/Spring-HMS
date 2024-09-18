package com.hms.controller;

import com.hms.model.User;
import com.hms.service.LabTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping
public class UserController {
    @Autowired
    private LabTestService userService;

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping ("/users")
    public User createUser(@RequestBody User user) {
        return userService.saveUser(user);
    }
}
