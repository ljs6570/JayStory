package com.company.ljins.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JayController {

    @GetMapping("/main")
    public void Main(){
    }
    @GetMapping("/login")
    public void Write(){
    }
}
