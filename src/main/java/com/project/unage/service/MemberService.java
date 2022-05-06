package com.project.unage.service;

import com.project.unage.model.Member;
import com.project.unage.repository.MemberMapper;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class MemberService implements UserDetailsService {

    private MemberMapper memberMapper;

    @Transactional
    public Long addMember(Member member) {
        // 비밀번호 암호화
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        member.setPassword(passwordEncoder.encode(member.getPassword()));

        return memberMapper.save(member.toEntity()).getID();

    @Override
    public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {
            memberMapper.findById(userId)
    }
}

