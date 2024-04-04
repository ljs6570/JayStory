package com.company.ljins.service;

import com.company.ljins.domain.UserDto;

import java.util.List;

public interface UserService {
    public List<UserDto> ListAll();
    public UserDto selectUser(UserDto dto);
    public UserDto loginUser(UserDto dto);
    public int insertUser(UserDto dto);
    public int deleteUser(UserDto dto);
    public UserDto findId(UserDto dto);
    public UserDto findPw(UserDto dto);
}
