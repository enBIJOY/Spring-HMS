package com.hms.service;

import com.hms.model.User;

import java.util.List;

public interface LabTestService {

    List<User> getAllUsers();

    User saveUser(User user);
}
