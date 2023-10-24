package com.springtrash.firstweekexample.repository;

import org.apache.ibatis.jdbc.SQL;

public class MemberProvider {

    public String updateMember(final String password, final String nickname, final String statusMessage){
        return new SQL(){
            {
                UPDATE("member");
                if(password != null){
                    SET("password = #{password}");
                }
                if(nickname != null){
                    SET("nickname = #{nickname}");
                }
                if(statusMessage != null){
                    SET("status_message = #{statusMessage}");
                }
                WHERE("loginId = #{loginId}");
            }
        }.toString();
    }
}
