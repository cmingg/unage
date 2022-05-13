package com.project.unage.controller;

import com.project.unage.model.Member;
import com.project.unage.repository.MemberRepository;
import com.project.unage.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Controller
@RequestMapping("/member")
public class JoinController {

    @Autowired
    private MemberService Service;

    @GetMapping("/join")
    public String joinForm() {
        return "member/join";
    }

    @PostMapping("/join")
    public String addMember(Member member) {
        log.info("회원가입 성공!");
        Service.addMember(member);
        return "redirect:/member/login";
    }

    @ResponseBody
    @GetMapping("/idCheck")
    public boolean idCheck(@RequestParam("id") String userId){
        log.info("전달받은 ID : " + userId);
        return Service.idCheck(userId);
    }

    @ResponseBody
    @GetMapping("/emailCheck")
    public boolean emailCheck(@RequestParam("email") String email){
        log.info("전달받은 email : " + email);
        return Service.emailCheck(email);
    }
}
