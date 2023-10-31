package com.springtrash.secondweek.repository;

import com.springtrash.secondweek.model.BoardDto;
import org.apache.ibatis.jdbc.SQL;

public class BoardProvider {

    public String findBoardAll(){
        return new SQL(){
            {
                SELECT("*");
                FROM("board");
            }
        }.toString();
    }

    public String insertBoard(){
        return new SQL(){
            {
                INSERT_INTO("board");
                INTO_COLUMNS("user_id", "title", "content", "is_notice");
                INTO_VALUES("#{member.loginId}", "#{title}", "#{content}", "#{isNotice}");
            }
        }.toString();
    }

    public String updateBoard(final BoardDto boardDto){
        return new SQL(){
            {
                UPDATE("board");
                if(boardDto.getTitle() != null){
                    SET("title = #{title}");
                }
                if(boardDto.getContent() != null){
                    SET("content = #{content}");
                }
                if(boardDto.getIsNotice() != null){
                    SET("is_notice = #{isNotice}");
                }
                WHERE("board_id = #{boardId}");
            }
        }.toString();
    }

    public String deleteBoard(){
        return new SQL(){
            {
                DELETE_FROM("board");
                WHERE("board_id = #{boardId}");
            }
        }.toString();
    }
}
