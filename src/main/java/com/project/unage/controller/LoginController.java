package com.project.unage.controller;

import com.project.unage.model.Member;
import com.project.unage.service.MailService;
import com.project.unage.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@Slf4j
@RequiredArgsConstructor
@Controller
@RequestMapping("/member")
public class LoginController {

    private final MemberService memberService;
    private final MailService mailService;

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
        log.info("id = {}", member.getUserId());
        log.info("email = {}", member.getEmail());

        String id = memberService.findPw(member);
        log.info("아이디값 존재여부 = {}", id);

        if (id == null) {
            return "null";
        }

        Member receiver = new Member();
        receiver.setUserId(id);
        receiver.setEmail(member.getEmail());
        receiver.setUserName(member.getUserName());

        //임시 비밀번호 생성
        String tempPw = UUID.randomUUID().toString().replace("-","");
        tempPw = tempPw.substring(0,10);

        //임시 비밀번호로 변경
        receiver.setPwd(tempPw);

        //메일 전송
        mailService.mailSend(receiver);

        //암호화된 비밀번호로 업데이트
        memberService.updatePw(receiver);

        log.info("받아온 email = {}", member.getEmail());
        return "success";
    }

}
