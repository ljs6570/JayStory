package com.company.ljins.repository;

import com.company.ljins.domain.UserDto;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    //전체리스트
    public List<UserDto> UserList();
    //회원리스트 1개
    public UserDto selectUser(UserDto dto);
    //회원가입
    public int insertUser(UserDto dto);
    //회원탈퇴
    public int deleteUser(UserDto dto);
    //로그인
    public UserDto loginUser(UserDto dto);
    //아이디찾기
    public UserDto findId(UserDto dto);
    //비밀번호찾기
    public UserDto findPassword(UserDto dto);
}
