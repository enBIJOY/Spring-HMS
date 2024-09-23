package com.hms.controller;


import com.hms.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RootController {

       @RequestMapping(value  = "/", method = RequestMethod.GET)
        public String helloWorld(){
            return "Welcome to your first Spring Boot Application";
        }
}
