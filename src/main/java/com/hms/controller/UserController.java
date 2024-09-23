package com.hms.controller;

import com.hms.model.User;
import com.hms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping ("/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping ("/users")
    public User createUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

        @GetMapping("/users/{id}")
        public User fetchUserById(@PathVariable("id") int userId){
            return userService.fetchUserById(userId);
    }

    @DeleteMapping("/users/{id}")
    public String deleteUserById(@PathVariable("id") int UserId){
        userService.deleteUserById(UserId);
        return "User Deleted Successfully!!";
    }
    @PutMapping("/users/{id}")
    public User updateUser(@PathVariable ("id") int UserId, @RequestBody User user){
        return userService.updateUser(UserId, user);
    }
}
