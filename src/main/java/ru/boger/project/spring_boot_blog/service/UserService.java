package ru.boger.project.spring_boot_blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private MailSender mailSender;

    public void sendMessage(String message) {
        mailSender.send("polinakrylova1666@gmail.com", message);
    }
}
