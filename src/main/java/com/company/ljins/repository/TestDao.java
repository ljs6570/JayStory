package com.company.ljins.repository;

import com.company.ljins.domain.TestDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestDao {

    public List<TestDto> selectList();
    public int countList();
    public int insertUser(TestDto dto);
    public TestDto selectOne(TestDto dto);
}
