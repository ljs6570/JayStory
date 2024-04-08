package com.company.ljins.test;

import com.company.ljins.domain.BoardDto;
import com.company.ljins.domain.UserDto;
import com.company.ljins.repository.UserDao;
import com.company.ljins.service.BoardService;
import com.company.ljins.service.UserService;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest

public class MyTest {

    @Autowired
    UserService service;

    @Autowired
    BoardService bservice;
    @Test @Disabled
    public void Test01(){
      // int i=dao.countList();
     //   System.out.println("@@@@"+i);
    }
    @Test @Disabled
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

        System.out.print("list@@@@@ :"+service.ListAll());
    }

    @Test @Disabled
    public void Board01(){
        BoardDto dto = new BoardDto();
        dto.setUser_no(1);
        dto.setBoard_title("firstTest");
        dto.setBoard_content("testContent");
        bservice.insertBoard(dto);
        System.out.println(bservice.BoardList(1));

    }
    @Test
    public void Board02(){
        System.out.println(bservice.BoardList(1));
    }
}
