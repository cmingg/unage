package com.project.unage.service;

import com.project.unage.model.Member;
import com.project.unage.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService{

    @Autowired
    MemberRepository memberRepository;

    @Override
    public void addMember(Member member) {
        memberRepository.addMember(member);
    }

    @Override
    public int idCheck(String id) {
        return memberRepository.idCheck(id);
    }

    @Override
    public int emailCheck(String email) {
        return memberRepository.emailCheck(email);
    }

    @Override
    public int phoneCheck(String phone) {
        return memberRepository.phoneCheck(phone);
    }

}
