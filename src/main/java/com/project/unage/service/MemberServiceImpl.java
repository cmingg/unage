package com.project.unage.service;

import com.project.unage.model.Member;
import com.project.unage.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService{

    @Autowired
    private MemberRepository memberRepository;

    @Override
    public void addMember(Member member) {
        memberRepository.addMember(member);
    }

    @Override
    public boolean idCheck(String id) {
        return memberRepository.idCheck(id);
    }

    @Override
    public boolean emailCheck(String email) {
        return memberRepository.emailCheck(email);
    }

    @Override
    public String findId(Member member) {
        return memberRepository.findId(member);
    }

    @Override
    public boolean login(Member member) {
        return memberRepository.login(member);
    }

}
