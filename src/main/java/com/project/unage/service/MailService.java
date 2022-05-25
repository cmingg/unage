package com.project.unage.service;

import com.project.unage.model.Member;
import lombok.AllArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MailService {

    private JavaMailSender mailSender;
    private static final String FROM_ADDRESS = "chooo12343@gamil.com";

    public void mailSend(Member member) {
        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo(member.getEmail());
        msg.setFrom(FROM_ADDRESS);
        msg.setSubject("[UNAGE] 임시 비밀번호 발급 안내");
        msg.setText("임시 비밀번호는 " + member.getPwd() + "입니다. 비밀번호를 변경하여 사용하세요." );
        mailSender.send(msg);
    }





}
