package com.project.unage.repository;

import com.project.unage.model.Member;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Mapper
@Repository
public interface MemberRepository {

    public void addMember(Member member);

    public boolean idCheck(String id);

    public boolean emailCheck(String email);

    public String findId(Member member);

    public boolean login(Member member);

}


