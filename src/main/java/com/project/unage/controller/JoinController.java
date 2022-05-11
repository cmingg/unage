package com.project.unage.controller;

import com.project.unage.model.Member;
import com.project.unage.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
    public int idCheck(String userId){
        return Service.idCheck(userId);
    }
//
//    @ResponseBody
//    @GetMapping Mapping("/idCheck")
//    public int emailCheck(String email){
//        return Service.emailCheck(email);
//    }
////
//    @ResponseBody
//    @PostMapping("/idCheck")
//    public int phoneCheck(String phone){
//        return Service.phoneCheck(phone);
//    }
}
