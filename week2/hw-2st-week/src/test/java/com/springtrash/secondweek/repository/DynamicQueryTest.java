package com.springtrash.secondweek.repository;

import com.springtrash.secondweek.model.MemberDto;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DynamicQueryTest {

    @Autowired
    private MemberMapper mmr;

    @Test
    @DisplayName("update 동적 쿼리 생성 테스트")
    void updateMemberTest(){
        int result = mmr.updateMember(null, null, "수정테스트최종33", "test1");

        MemberDto member = mmr.findMemberById("test1");
        System.out.println("member = " + member);
        Assertions.assertThat(member.getStatusMessage()).isEqualTo("수정테스트최종33");
    }

    @Test
    @DisplayName("select 동적 쿼리 생성 테스트")
    void insertMemberTest(){
        MemberDto memberDto = mmr.findMemberByIdAndPwd("test1", "1234");
        Assertions.assertThat("test1").isEqualTo(memberDto.getLoginId());
    }
}
