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
        Service.addMember(member);
        return "redirect:/";
    }

    @ResponseBody
    @GetMapping("/idCheck")
    public int idCheck(@RequestParam("userId") String userId){
        log.info("아이디 중복확인");
        log.info("전달받은 ID : " + userId);
        int cnt = Service.idCheck(userId);
        log.info("확인 결과 : " + cnt);
        return cnt;
    }
//
//    @ResponseBody
//    @PostMapping("/idCheck")
//    public int phoneCheck(String phone){
//        return Service.phoneCheck(phone);
//    }
}
