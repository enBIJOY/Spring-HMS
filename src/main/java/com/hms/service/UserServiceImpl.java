package com.hms.service;

import com.hms.model.User;
import com.hms.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepo userRepo;

    @Override
    public User saveUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return List.of();
    }

    @Override
    public User fetchUserById(int userId) {
        return userRepo.findById(userId).get();
    }

    @Override
    public void deleteUserById(int userId) {
        userRepo.deleteById(userId);
    }
}
