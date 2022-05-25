package com.project.unage.service;

import com.project.unage.model.Member;

public interface MemberService {

    public void addMember(Member member);

    public boolean idCheck(String id);

    public boolean emailCheck(String email);

    public String findId(Member member);

    public boolean login(Member member);

    public String findPw(Member member);

    public void updatePw(Member receiver);
}

