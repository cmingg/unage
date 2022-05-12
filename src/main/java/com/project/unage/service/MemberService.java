package com.project.unage.service;

import com.project.unage.model.Member;

public interface MemberService {

    public void addMember(Member member);

    public int idCheck(String id);

    public int emailCheck(String email);

    public int phoneCheck(String phone);

}

