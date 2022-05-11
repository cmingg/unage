package com.project.unage.repository;

import com.project.unage.model.Member;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface MemberRepository {

    Member findById(String userId);
    public void addMember(Member member);
    public int idCheck(String id);
    public int emailCheck(String email);
    public int phoneCheck(String phone);

//    public MemberDto getMember(String id);
//
//    public boolean login(MemberDto dto);
//
//    public String findId(MemberDto dto);
//
//    public String findPw(MemberDto dto);
//
//    public void updatePw(MemberDto dto);

}


