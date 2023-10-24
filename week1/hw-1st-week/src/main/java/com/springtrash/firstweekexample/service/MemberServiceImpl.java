package com.springtrash.firstweekexample.service;

import com.springtrash.firstweekexample.model.MemberDto;
import com.springtrash.firstweekexample.repository.MemberMapperRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MemberServiceImpl implements MemberService{

    MemberMapperRepository memberMapperRepository;

    @Autowired
    public MemberServiceImpl(MemberMapperRepository memberMapperRepository) {
        this.memberMapperRepository = memberMapperRepository;
    }

    @Override
    @Transactional
    public int join(MemberDto memberDto) {
        return memberMapperRepository.createMember(memberDto);
    }

    @Override
    public boolean login(String loginId, String password) {
        MemberDto member = memberMapperRepository.findMemberByIdAndPwd(loginId, password);
        return member != null;
    }

    @Override
    @Transactional
    public int updateMember(String password, String nickname, String statusMessage, String loginId) {
        return memberMapperRepository.updateMember(password, nickname, statusMessage, String loginId);
    }

    @Override
    public MemberDto getMember(String loginId) {
        return memberMapperRepository.findMemberById(loginId);
    }

}
