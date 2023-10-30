package com.springtrash.secondweek.service;

import com.springtrash.secondweek.model.MemberDto;

public interface MemberService {

    int join(MemberDto memberDto);
    MemberDto login(String loginId, String password);
    int updateMember(String password, String nickname, String statusMessage, String loginId);
    MemberDto getMember(String loginId);
}
