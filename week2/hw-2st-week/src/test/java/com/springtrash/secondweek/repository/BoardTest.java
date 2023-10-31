package com.springtrash.secondweek.repository;

import com.springtrash.secondweek.model.BoardDto;
import com.springtrash.secondweek.service.BoardService;
import com.springtrash.secondweek.service.MemberService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class BoardTest {

    @Autowired
    private BoardService boardService;

    @Autowired
    private MemberService memberService;

    @Test
    @DisplayName("전체 게시글 select 테스트")
    void selectAll(){
        List<BoardDto> list = boardService.findBoardAll();
        System.out.println("list = " + list);
    }

    @Test
    @DisplayName("게시글 저장 테스트")
    void save(){
        BoardDto board = BoardDto.builder().member(memberService.getMember("ssafy"))
                                            .title("공지사항 전달 테스트2")
                                            .content("아아 전달사항")
                                            .isNotice(true)
                                            .build();

        int result = boardService.save(board);
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    @DisplayName("게시글 수정 테스트")
    void update(){
        BoardDto board = BoardDto.builder().boardId(2)
                .content("수정수정수정 공지사항 아님")
                .isNotice(false)
                .build();

        int result = boardService.update(board);
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    @DisplayName("게시글 삭제 테스트")
    void delete(){
        int result = boardService.delete(2);
        Assertions.assertThat(result).isEqualTo(1);
    }
}
