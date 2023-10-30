package com.springtrash.secondweek.service;

import com.springtrash.secondweek.model.MemberDto;
import com.springtrash.secondweek.repository.MemberMapperRepository;
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
    public MemberDto login(String loginId, String password) {
        return memberMapperRepository.findMemberByIdAndPwd(loginId, password);
    }

    @Override
    @Transactional
    public int updateMember(String password, String nickname, String statusMessage, String loginId) {
        return memberMapperRepository.updateMember(password, nickname, statusMessage, loginId);
    }

    @Override
    public MemberDto getMember(String loginId) {
        return memberMapperRepository.findMemberById(loginId);
    }

}
