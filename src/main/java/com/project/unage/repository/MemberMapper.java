package com.project.unage.repository;

import com.project.unage.model.Member;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface MemberMapper {

    Member findById(String userId);
    List<Member> findAll();
    void save(Member member);

//    public void addMember(MemberDto dto);

//    public MemberDto getMember(String id);
//
//    public boolean idCheck(String id);
//
//    public boolean emailCheck(String email);
//
//    public boolean login(MemberDto dto);
//
//    public String findId(MemberDto dto);
//
//    public String findPw(MemberDto dto);
//
//    public void updatePw(MemberDto dto);

}


