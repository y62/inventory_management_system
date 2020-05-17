package ims.app.controllers;

import ims.app.dao.UserRepo;
import ims.app.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserRepo userRepo;

    private String userList = "user/user-list";
    private String addUser = "user/add-user";
    private String redirectUser = "redirect:/user/user-list";

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("usr", userRepo.findAll());
        return userList;
    }

    @GetMapping("/add")
    public String add(Model model) {
        User user = new User();
        model.addAttribute("usr", user);
        return addUser;
    }

    @PostMapping("/save")
    public String save(User user) {
        userRepo.save(user);
        return redirectUser;
    }



}
