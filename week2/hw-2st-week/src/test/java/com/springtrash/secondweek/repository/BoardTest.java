package com.springtrash.secondweek.repository;

import com.springtrash.secondweek.model.BoardDto;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class BoardTest {

    @Autowired
    private BoardMapper bm;

    @Test
    @DisplayName("전체 게시글 select 테스트")
    void selectAll(){
        List<BoardDto> list = bm.findBoardAll();
        System.out.println("list = " + list);
    }

}
