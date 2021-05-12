package ru.boger.project.spring_boot_blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ru.boger.project.spring_boot_blog.entity.Person;
import ru.boger.project.spring_boot_blog.service.UserService;

@Controller
public class HomePageController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String showAllPosts(Model model) {
        model.addAttribute("person", new Person());
        return "index";
    }

    @GetMapping("mobile.html")
    public String showMobile(Model model) {
        model.addAttribute("person", new Person());
        return "mobile";
    }

    @PostMapping()
    public String sendMessage(@ModelAttribute("person") Person person) {
        String message = String.format("Вами заинтересовался новый заказчик:\n\nИмя: %s\nПочта: %s\nНомер телефона: %s", person.getName(), person.getEmail(), person.getNumberPhone());
        userService.sendMessage(message);
        userService.savePerson(person);
        return "redirect:/";
    }

}
