package com.springtrash.secondweek.repository;

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
}
