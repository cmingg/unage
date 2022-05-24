package com.project.unage.controller;

import com.project.unage.model.Member;
import com.project.unage.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequiredArgsConstructor
@Controller
@RequestMapping("/member")
public class LoginController {

    private final MemberService memberService;

    @GetMapping("/login")
    public String loginForm() {
        return "member/login";
    }

    @PostMapping("/login")
    public String login(Member member) {
        log.info("id = {}", member.getUserId());
        log.info("pwd = {}", member.getPwd());
        boolean result = memberService.login(member);
        log.info("result = {}", result);
        if (!result) {
            return "redirect:/member/login";
        } else {
            return "redirect:/";
        }
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
        log.info("받은 userName = {}", member.getUserName());
        log.info("받은 email = {}", member.getEmail());
        return memberService.findId(member);
    }

    @ResponseBody
    @PostMapping("/findPw")
    public String findPw(Member member) {
        log.info("받아온 email = {}", member.getEmail());
        return memberService.findPw(member);
    }

}
