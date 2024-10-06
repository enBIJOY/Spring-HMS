package com.hms.controller;


import org.springframework.web.bind.annotation.*;

@RestController
public class RouteController {

    @GetMapping(value="/")
    public String rootMap(){
        return "https://documenter.getpostman.com/view/38819167/2sAXxMgZJf";
    }

    @RequestMapping(value="/test", method= RequestMethod.GET)
    public String testURL(){
        return "Hello testURL!";
    }
}
