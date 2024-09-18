package com.hms.service;


import com.hms.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LabTestServiceImpl implements LabTestService {
    @Override
    public List<User> getAllUsers() {
        return List.of();
    }

    @Override
    public User saveUser(User user) {
        return null;
    }
}
