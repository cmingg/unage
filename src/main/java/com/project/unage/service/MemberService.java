package com.project.unage.service;

import com.project.unage.model.Member;

public interface MemberService {
    //인터페이스에 존재하는 메서드는 "public abstract" 공개, 추상메서드 <- 오버라이딩해서 사용한다

    void addMember(Member member);

    boolean idCheck(String id);

    boolean emailCheck(String email);

    String findId(Member member);

    boolean login(Member member);

    String findPw(Member member);

    void updatePw(Member receiver);
}

