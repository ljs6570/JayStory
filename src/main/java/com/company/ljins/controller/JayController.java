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

    @GetMapping("/user_delete")
    public void user_delete(){

    }
    @PostMapping("/user_delete")
    public String delete_user(){
        return "main";
    }
    @GetMapping("/write")
    public void write_view(){

    }
    @PostMapping("/write")
    public String write(){
        return "main";
    }
    @GetMapping("/viewDetail")
    public void viewDetail(){

    }
    @GetMapping("/viewUpdate")
    public void update_view(){

    }
    @PostMapping("/viewUpdate")
    public String update(){
        return "main";
    }
    @GetMapping("/viewDelete")
    public void viewDelete(){

    }
    @PostMapping("/viewDelete")
    public String delete_board(){
        return "main";
    }


}
