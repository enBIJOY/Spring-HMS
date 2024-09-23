//package com.hms.service;
//
//
//import com.hms.model.PathologicalTest;
//import com.hms.model.RadiologicalTest;
//import com.hms.model.User;
//import com.hms.repository.UserRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class LabTestServiceImpl implements LabTestService {
//    @Autowired
//    private UserRepo userRepo ;
//
//    //@Autowired
//    //private PathologicalTestRepo pathologicalTestRepo;
//
//    //@Autowired
//    //private RadiologicalTestRepo radiologicalTestRepo;
//
//    @Override
//    public List<User> getAllUsers() {
//        return userRepo.findAll();
//    }
//
//    @Override
//    public PathologicalTest saveUser(PathologicalTest pathologicalTest) {
//        return null;
//    }
//
//
//    @Override
//    public User saveUser(User user) {
//        return userRepo.save(user);
//    }
//
//    @Override
//    public PathologicalTest savePathologicalTest(PathologicalTest pathologicalTest) {
//        return null;
//    }
//
//    @Override
//    public RadiologicalTest saveRadiologicalTest(RadiologicalTest radiologicalTest) {
//        return null;
//    }
//
//    @Override
//    public List<RadiologicalTest> getAllUser() {
//        return List.of();
//    }
//
//    @Override
//    public RadiologicalTest saveUser(RadiologicalTest radiologicalTest) {
//        return null;
//    }
//
//    @Override
//    public List<PathologicalTest> getAllPTests() {
//        return List.of();
//    }
//
//    @Override
//    public PathologicalTest savePTest(PathologicalTest pathologicalTest) {
//        return null;
//    }
//
//    @Override
//    public List<RadiologicalTest> getAllRTests() {
//        return List.of();
//    }
//
//    @Override
//    public RadiologicalTest saveRTest(RadiologicalTest radiologicalTest) {
//        return null;
//    }
//
//
////    @Override
////    public PathologicalTest savePathologicalTest(PathologicalTest pathologicalTest) {
////        return PathologicalTestRepo.(pathologicalTest);
////    }
//
//}
