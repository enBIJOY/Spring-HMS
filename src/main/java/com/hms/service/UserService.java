package com.hms.service;

import com.hms.model.User;

import java.util.List;

public interface UserService {
    public User saveUser(User user);

    List<User> getAllUsers();


    public User fetchUserById(int userId);

    public void deleteUserById(int userId);
}
