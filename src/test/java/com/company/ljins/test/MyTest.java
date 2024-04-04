package com.company.ljins.test;

import com.company.ljins.domain.UserDto;
import com.company.ljins.repository.TestDao;
import com.company.ljins.repository.UserDao;
import com.company.ljins.service.UserService;
import org.apache.catalina.User;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest

public class MyTest {

    @Autowired
    UserService service;
    @Autowired
    UserDao dao;
    @Test @Disabled
    public void Test01(){
      // int i=dao.countList();
     //   System.out.println("@@@@"+i);
    }
    @Test //@Disabled
    public void Test02(){
        UserDto dto=new UserDto();
        dto.setUser_id("test3@email.com");
        dto.setUser_pw("1234");
        UserDto ser=service.loginUser(dto);

        System.out.println("list@@@@@ :"+service.ListAll());
        System.out.print("user@@@@@ :"+ser);

    }

    @Test @Disabled
    public void Test03(){
        UserDto dto= new UserDto();
        System.out.print("list@@@@@ :"+service.ListAll());
    }
}
