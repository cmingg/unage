package com.project.unage.repository;

import com.project.unage.model.Member;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface MemberRepository {

    public Member findById(String userId);

    public void addMember(Member member);

    public boolean idCheck(String id);

    public boolean emailCheck(String email);

//    public MemberDto getMember(String id);
//
//    public boolean login(Member dto);
//
//    public String findId(Member dto);
//
//    public String findPw(Member dto);
//
//    public void updatePw(Member dto);

}


