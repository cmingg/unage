package com.project.unage.service;

import com.project.unage.model.Mail;
import lombok.AllArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MailService {

    private JavaMailSender mailSender;
    private static final String FROM_ADDRESS = "uange@gamil.com";

    public void mailSend(Mail mail) {
        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo(mail.getAddress());
        msg.setFrom(MailService.FROM_ADDRESS);
        msg.setSubject(mail.getTitle());
        msg.setText(mail.getMessage());

        mailSender.send(msg);
    }
}
