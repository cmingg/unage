package com.project.unage.controller;

import com.project.unage.model.Member;
import com.project.unage.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
    public String findId(Member member) {

        log.info("받은 uerName = {}", member.getUserName());
        log.info("받은 email = {}", member.getEmail());
        String userId = memberService.findId(member);
        if (userId == null) {
            log.info("존재하지 않는 회원입니다.");
        }
        return userId;
    }


    @GetMapping("/findPassword")
    public String findPasswordForm() {
        return "/member/findPassword";
    }

//
//    @PostMapping("/member/login")
//    public String login() {
//        return "redirect:/";
//    }

//    @GetMapping("/denied")
//    public String goLogin() {
//        return "member/login";
//    }
//
//    @GetMapping("/admin")
//    public String admin() {
//        return "member/admin";
//    }
}
