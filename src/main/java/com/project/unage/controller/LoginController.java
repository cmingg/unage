package com.project.unage.controller;

import com.project.unage.model.Member;
import com.project.unage.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@Slf4j
@Controller
@RequestMapping("/member")
public class LoginController {

    @Autowired
    private MemberService memberService;

    @GetMapping("/login")
    public String loginForm() {
        return "member/login";
    }

    @GetMapping("/logout")
    public String logout() {
        return "/";
    }

    @GetMapping("/findId")
        public String findIdForm() {
        return "/member/findId";
    }

    @ResponseBody
    @PostMapping("/findId")
    public String findId(Member member, Model model) {
        log.info("받은 userName = {}", member.getUserName());
        log.info("받은 email = {}", member.getEmail());
        String id = memberService.findId(member);
        log.info("id = {}", id);
        model.addAttribute("userId", id);
        return memberService.findId(member);
    }


    @GetMapping("/findPassword")
    public String findPasswordForm() {
        return "/member/findPassword";
    }

}
