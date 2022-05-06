package com.project.unage;

import com.project.unage.model.Member;
import com.project.unage.service.MemberService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class mapperTest {

    @Autowired
    private MemberService memberService;

    @Test
    public void findById() {
        Member member = memberService.getProductById(1);
        System.out.println("member = " + member);
    }

    @Test
    public void findAll() {
        List<Member> products = memberService.getAllProducts();
        System.out.println("products = " + products);
    }

    @Transactional
    @Test
    public void save() {
        memberService.addProduct(new Member(5,"샴푸", "7900"));
    }
}
