package com.springtrash.firstweekexample.service;

import com.springtrash.firstweekexample.model.MemberDto;

import java.util.List;

public interface MemberService {

    int join(MemberDto memberDto);
    MemberDto login(String loginId, String password);
    int updateMember(String password, String nickname, String statusMessage, String loginId);
    MemberDto getMember(String loginId);
}
