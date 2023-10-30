package com.springtrash.secondweek.repository;

import com.springtrash.secondweek.model.MemberDto;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.stream.IntStream;

@SpringBootTest
class MemberRepositoryTest {

    @Autowired
    private MemberMapperRepository mmr;

    @Test
    @DisplayName("더미 유저 생성 테스트")
    void joinTest(){
        IntStream.rangeClosed(16,20).forEach(i -> {
            mmr.createMember(new MemberDto("test" + i, "1234", "test" + i + "@naver.com",
                    "test" + i, "tt", "안녕 테스트 " + i));
        });
    }

    @Test
    @Transactional
    @DisplayName("멤버 생성 리턴값 테스트")
    void joinValueTest(){
        int val = mmr.createMember(new MemberDto("test", "1234", "test" + 11 + "@naver.com",
                "test", "tt", "안녕 테스트 "));
        System.out.println(val);
    }

    @Test
    @DisplayName("더미 유저 아이디로 조회")
    void findByIdTest(){
        MemberDto member = mmr.findMemberById("test1");
        Assertions.assertThat(member.getLoginId()).isEqualTo("test1");
    }

    @Test
    @DisplayName("더미 유저 아이디 비밀번호 조회")
    void findByIdAndPwdTest(){
        MemberDto member = mmr.findMemberByIdAndPwd("test1", "1234");
        Assertions.assertThat(member.getLoginId()).isEqualTo("test1");
    }
}
