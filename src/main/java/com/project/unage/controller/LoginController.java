package com.project.unage.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
public class LoginController {



    @GetMapping("/member/login")
    public String loginForm() {
        return "member/login";
    }

    @GetMapping("/member/logout")
    public String logout() {
        return "/";
    }

    @GetMapping("/member/findId")
        public String findIdForm() {
        return "/member/findId";
    }

    @GetMapping("/member/findPassword")
    public String findPasswordForm() {
        return "/member/findPassword";
    }


    @PostMapping("/member/login")
    public String login() {
        return "redirect:/";
    }

    @GetMapping("/denied")
    public String goLogin() {
        return "member/login";
    }

    @GetMapping("/admin")
    public String admin() {
        return "member/admin";
    }
}
