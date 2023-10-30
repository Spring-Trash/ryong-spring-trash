package com.springtrash.secondweek.repository;

import org.apache.ibatis.jdbc.SQL;

public class MemberProvider {

    public String selectMemberById(){
        return new SQL(){
            {
                SELECT("*");
                FROM("member");
                WHERE("loginId = #{loginId}");
            }
        }.toString();
    }

    public String selectMemberByIdAndPwd(){
        return new SQL(){
            {
                SELECT("*");
                FROM("member");
                WHERE("loginId = #{loginId}");
                WHERE("password = #{password}");
            }
        }.toString();
    }

    public String insertMember(){
        return new SQL(){
            {
                INSERT_INTO("member");
                INTO_COLUMNS("loginId", "password", "email", "name", "nickname", "position", "status_message");
                INTO_VALUES("#{loginId}", "#{password}", "#{email}", "#{name}", "employee", "#{nickname}", "#{statusMessage}");
            }
        }.toString();
    }

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
