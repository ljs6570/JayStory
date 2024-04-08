package com.company.ljins.controller;

import com.company.ljins.repository.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @Autowired
    TestDao dao;


    @GetMapping("/test")
    public String test(Model model) {
        return "test";
    }

    @GetMapping("tt")
    public void tt() {

    }
}
