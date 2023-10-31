package com.springtrash.secondweek.service;

import com.springtrash.secondweek.model.MemberDto;
import com.springtrash.secondweek.repository.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MemberServiceImpl implements MemberService{

    MemberMapper memberMapper;

    @Autowired
    public MemberServiceImpl(MemberMapper memberMapper) {
        this.memberMapper = memberMapper;
    }

    @Override
    @Transactional
    public int join(MemberDto memberDto) {
        return memberMapper.createMember(memberDto);
    }

    @Override
    public MemberDto login(String loginId, String password) {
        return memberMapper.findMemberByIdAndPwd(loginId, password);
    }

    @Override
    @Transactional
    public int updateMember(String password, String nickname, String statusMessage, String loginId) {
        return memberMapper.updateMember(password, nickname, statusMessage, loginId);
    }

    @Override
    public MemberDto getMember(String loginId) {
        return memberMapper.findMemberById(loginId);
    }

}
