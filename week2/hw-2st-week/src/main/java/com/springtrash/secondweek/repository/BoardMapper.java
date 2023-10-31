package com.springtrash.secondweek.repository;

import com.springtrash.secondweek.model.BoardDto;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface BoardMapper {

    @Results({
            @Result(property = "boardId", column = "board_id"),
            @Result(property = "member", column = "user_id",
                    one = @One(select = "com.springtrash.secondweek.repository.MemberMapper.findMemberById")),
            @Result(property = "title", column = "title"),
            @Result(property = "content", column = "content"),
            @Result(property = "createdAt", column = "created_at"),
            @Result(property = "updatedAt", column = "updated_at"),
    })
    @SelectProvider(type = BoardProvider.class, method = "findBoardAll")
    List<BoardDto> findBoardAll();
}
