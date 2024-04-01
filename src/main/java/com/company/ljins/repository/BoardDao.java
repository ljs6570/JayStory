package com.company.ljins.repository;

import com.company.ljins.domain.BoardDto;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoardDao {
    public List<BoardDto> BoardList();
    public BoardDto selectBoard();
    public int insertBoard(BoardDto dto);
    public int update_hit(BoardDto dto);
    public int updateBoard(BoardDto dto);
    public int deleteBoard(BoardDto dto);
}
