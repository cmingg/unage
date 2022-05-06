package com.project.unage.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class LoginController {

    @GetMapping("/member/login")
    public String login() {
        return "member/login";
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
