package com.company.ljins.service;

import com.company.ljins.domain.BoardDto;
import com.company.ljins.repository.BoardDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service @Primary
public class BoardServiceImpl implements BoardService{

    @Autowired
    BoardDao dao;
    @Override
    public List<BoardDto> BoardList(int user_no) {
        return dao.BoardList(user_no);
    }

    @Override
    public BoardDto detail_view(BoardDto dto) {
        dao.update_hit(dto);
        return dao.selectBoard(dto);
    }

    @Override
    public BoardDto update_view(BoardDto dto) {
        return dao.selectBoard(dto);
    }

    @Override
    public int insertBoard(BoardDto dto) {
        return dao.insertBoard(dto);
    }

    @Override
    public int updateBoard(BoardDto dto) {
        return dao.updateBoard(dto);
    }

    @Override
    public int deleteBoard(BoardDto dto) {
        return dao.deleteBoard(dto);
    }
}
