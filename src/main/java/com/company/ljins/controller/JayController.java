package com.company.ljins.controller;

import com.company.ljins.domain.UserDto;
import com.company.ljins.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.UnknownHostException;


@Controller
public class JayController {

    @Autowired
    UserService service;
    @GetMapping("/main")
    public void Main(){
    }
    @GetMapping("/login")
    public void login_view(){
    }
    @PostMapping("/login")
    public String login(UserDto dto, HttpServletRequest request, HttpServletResponse response, HttpSession session ) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter print = response.getWriter();

        UserDto userinfo=service.loginUser(dto);
        if(userinfo!=null){
            session.setAttribute("login", userinfo);
            return "redirect:/main";
       }
        else{
            print.println("<script>alert('아이디 또는 비밀번호가 맞지않습니다')</script>");
            print.flush();
        }
        return "login";
    }
    @GetMapping("/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "/main";
    }
    @GetMapping("/signAgree")
    public void signAgree(){

    }
    @GetMapping("/signUp")
    public void signUp_view(){

    }
    @PostMapping("/signUp")
    public String signUp(UserDto dto) {
        service.insertUser(dto);
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
