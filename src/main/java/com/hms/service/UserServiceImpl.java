package com.hms.service;

import com.hms.model.User;
import com.hms.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

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

    @Override
    public User updateUser(int userId, User user) {
        User userDB = userRepo.findById(userId).get();

//        if (Objects.nonNull(user.getUsername()) &&
//                !"".equalsIgnoreCase(user.getUsername())) {
//            userDB.setUsername(user.getUsername());
//        }

        if (Objects.nonNull(user.getPassword()) &&
                !"".equalsIgnoreCase(user.getPassword())) {
            userDB.setPassword(user.getPassword());
        }
//        if (Objects.nonNull(user.getFullName()) &&
//                !"".equalsIgnoreCase(user.getFullName())) {
//            userDB.setFullName(user.getFullName());
//        }
        if (Objects.nonNull(user.getPhone()) &&
                !"".equalsIgnoreCase(user.getPhone())) {
            userDB.setPhone(user.getPhone());
        }
        if (Objects.nonNull(user.getAge()) &&
                user.getAge() > 0) {
            userDB.setAge(user.getAge());
        }
        if (Objects.nonNull(user.getAddress()) &&
                !"".equalsIgnoreCase(user.getAddress())) {
            userDB.setAddress(user.getAddress());
        }
//        if (Objects.nonNull(user.getUserType()) &&
//                !"".equalsIgnoreCase(user.getUserType())) {
//            userDB.setUserType(user.getUserType());
//        }
        return userRepo.save(userDB);
    }
}
