package com.project.unage.controller;

import com.project.unage.model.Member;
import com.project.unage.service.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
public class JoinController {

    private MemberService memberService;

    @GetMapping("/join")
    public String joinForm() {
        return "member/join";
    }

    @PostMapping("/join")
    public String join(Member member) {
        memberService.addMember(member);

        return "redirect:/";
    }
}
