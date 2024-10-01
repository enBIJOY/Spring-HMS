package com.hms.controller;


import org.springframework.web.bind.annotation.*;

@RestController
public class RouteController {

       //@RequestMapping(value  = "/", method = RequestMethod.GET)
        public String helloWorld(){
            return "Welcome to your first Spring Boot Application";
        }
}
