package com.company.ljins.test;

import com.company.ljins.repository.TestDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest

public class Test000 {

    @Autowired
    TestDao dao;
    @Test
    public void Test01(){
        int i=dao.countList();
        System.out.println("@@@@"+i);
    }
}
