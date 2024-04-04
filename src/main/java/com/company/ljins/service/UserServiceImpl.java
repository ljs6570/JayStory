package com.company.ljins.service;


import com.company.ljins.domain.UserDto;
import com.company.ljins.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

@Service @Primary
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao dao;

    public List<UserDto> ListAll(){
        return dao.UserList();
    }

    public UserDto selectUser(UserDto dto){
        return dao.selectUser(dto);
    }
    public UserDto loginUser(UserDto dto){
        return dao.loginUser(dto);
    }
    public int insertUser(UserDto dto){
        try {
            dto.setUser_ip(InetAddress.getLocalHost().getHostAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return dao.insertUser(dto);
    }
    public int deleteUser(UserDto dto){
        return dao.deleteUser(dto);
    }
    public UserDto findId(UserDto dto){
        return dao.findId(dto);
    }
    public UserDto findPw(UserDto dto){
        return dao.findPassword(dto);
    }

}
