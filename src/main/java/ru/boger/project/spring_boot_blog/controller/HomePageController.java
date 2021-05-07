package ru.boger.project.spring_boot_blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ru.boger.project.spring_boot_blog.dao.PostDAOImpl;
import ru.boger.project.spring_boot_blog.entity.Person;
import ru.boger.project.spring_boot_blog.entity.Post;
import ru.boger.project.spring_boot_blog.service.UserService;

import java.util.List;

@Controller
public class HomePageController {
    @Autowired
    private PostDAOImpl postDAO;

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String showAllPosts(Model model) {
        //List<Post> allPosts = postDAO.getAllPosts();
        model.addAttribute("person", new Person());
       // model.addAttribute("allPosts", allPosts);
        return "index";
    }

    @PostMapping()
    public String sendMessage(@ModelAttribute("person") Person person) {
        String message = String.format("Вами заинтересовался новый заказчик:\n\nИмя: %s\nПочта: %s\nНомер телефона: %s", person.getName(), person.getEmail(), person.getNumberPhone());
        userService.sendMessage(message);
        return "index";
    }

}
