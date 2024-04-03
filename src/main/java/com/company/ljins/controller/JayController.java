package com.company.ljins.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class JayController {

    @GetMapping("/main")
    public void Main(){
    }
    @GetMapping("/login")
    public void login_view(){
    }
    @PostMapping("/login")
    public String login(){
        return "/main";
    }

    @GetMapping("/signAgree")
    public void signAgree(){

    }
    @GetMapping("/signUp")
    public void signUp_view(){

    }
    @PostMapping("/signUp")
    public String signUp(){
        return "main";
    }
}
