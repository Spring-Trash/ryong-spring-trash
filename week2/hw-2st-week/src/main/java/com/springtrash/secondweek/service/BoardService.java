package com.springtrash.secondweek.service;

import com.springtrash.secondweek.model.BoardDto;

import java.util.List;

public interface BoardService {
    List<BoardDto> findBoardAll();
    int save(BoardDto boardDto);
    int update(BoardDto boardDto);
    int delete(int boardId);
}
