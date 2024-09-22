package com.poorvansh.E_Comm.controller;

//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet(){
        return "Welcome to my page";
    }

    @RequestMapping("/about")
    public String about(){
        return "I am here now!!!";
    }
}
