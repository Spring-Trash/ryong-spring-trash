package com.springtrash.secondweek.repository;

import com.springtrash.secondweek.model.MemberDto;
import org.apache.ibatis.annotations.*;

@Mapper
public interface MemberMapper {
    @SelectProvider(type = MemberProvider.class, method = "selectMemberById")
    MemberDto findMemberById(@Param("loginId") String loginId);

    @SelectProvider(type = MemberProvider.class, method = "selectMemberByIdAndPwd")
    MemberDto findMemberByIdAndPwd(@Param("loginId") String loginId, @Param("password") String password);

    @InsertProvider(type = MemberProvider.class, method = "insertMember")
    int createMember(MemberDto memberDto);

    @UpdateProvider(type = MemberProvider.class, method = "updateMember")
    int updateMember(@Param("password") String password, @Param("nickname") String nickname,
                     @Param("statusMessage") String statusMessage, @Param("loginId") String loginId);
}
