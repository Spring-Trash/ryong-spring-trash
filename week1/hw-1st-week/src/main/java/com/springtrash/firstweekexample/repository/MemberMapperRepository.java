package com.springtrash.firstweekexample.repository;

import com.springtrash.firstweekexample.model.MemberDto;
import org.apache.ibatis.annotations.*;

import java.lang.reflect.Member;

@Mapper
public interface MemberMapperRepository {
    @Select("SELECT * FROM member WHERE loginId=#{loginId}")
    MemberDto findMemberById(@Param("loginId") String loginId);

    @Select("SELECT * FROM member WHERE loginId=#{loginId} and password=#{password}")
    MemberDto findMemberByIdAndPwd(@Param("loginId") String loginId, @Param("password") String password);

    @Insert("INSERT INTO member (loginId, password, email, name, nickname, status_message)" +
            " VALUES(#{loginId}, #{password}, #{email}, #{name}, #{nickname}, #{statusMessage})")
    int createMember(MemberDto memberDto);

    @UpdateProvider(type = MemberProvider.class, method = "updateMember")
    int updateMember(@Param("password") String password, @Param("nickname") String nickname,
                     @Param("statusMessage") String statusMessage, @Param("loginId") String loginId);
}
