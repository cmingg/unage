package com.project.unage.service;

import com.project.unage.model.Member;
import com.project.unage.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class MemberServiceImpl implements MemberService{

    private final MemberRepository memberRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public void addMember(Member member) {
        member.setPwd(passwordEncoder.encode(member.getPwd()));
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

    @Override
    public String findPw(Member member) {
        return memberRepository.findPw(member);
    }

    @Override
    public void updatePw(Member receiver) {
        receiver.setPwd(passwordEncoder.encode(receiver.getPwd()));
        memberRepository.updatePw(receiver);
    }


}
