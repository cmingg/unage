package com.project.unage.repository;

import com.project.unage.model.Member;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository {
    // 인터페이스내에 존재하는 메소드는 임의적으로 'public abstract'나 'public'으로 선언된다
    void addMember(Member member);

    boolean idCheck(String id);

    boolean emailCheck(String email);

    String findId(Member member);

    boolean login(Member member);

    String findPw(Member member);

    void updatePw(Member receiver);
}


