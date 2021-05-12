package ru.boger.project.spring_boot_blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.boger.project.spring_boot_blog.dao.PersonDAO;
import ru.boger.project.spring_boot_blog.entity.Person;

@Service
public class UserService {
    @Autowired
    private MailSender mailSender;
    @Autowired
    private PersonDAO personDAO;

    public void sendMessage(String message) {
        mailSender.send("polinakrylova1666@gmail.com", message);
    }

    @Transactional
    public void savePerson(Person person) {
        personDAO.savePerson(person);
    }
}
