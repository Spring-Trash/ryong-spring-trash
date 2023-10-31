package com.springtrash.secondweek.service;

import com.springtrash.secondweek.model.BoardDto;
import com.springtrash.secondweek.repository.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService{

    private final BoardMapper boardMapper;

    @Autowired
    public BoardServiceImpl(BoardMapper boardMapper) {
        this.boardMapper = boardMapper;
    }

    @Override
    public List<BoardDto> findBoardAll() {
        return boardMapper.findBoardAll();
    }

    @Override
    public int save(BoardDto boardDto) {
        return boardMapper.insertBoard(boardDto);
    }

    @Override
    public int update(BoardDto boardDto) {
        return boardMapper.updateBoard(boardDto);
    }

    @Override
    public int delete(int boardId) {
        return boardMapper.deleteBoard(boardId);
    }
}
