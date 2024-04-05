package com.company.ljins.service;

import com.company.ljins.domain.BoardDto;

import java.util.List;

public interface BoardService {
    public List<BoardDto> BoardList(int user_no);
    public BoardDto detail_view(BoardDto dto);
    public BoardDto update_view(BoardDto dto);
    public int insertBoard(BoardDto dto);
    public int updateBoard(BoardDto dto);
    public int deleteBoard(BoardDto dto);
}
