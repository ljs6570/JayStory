package com.company.ljins.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JayController {

    @GetMapping("/main")
    public String Main(){
        return "main";
    }
    @GetMapping("/write")
    public String Write(){
        return "write";
    }
}
