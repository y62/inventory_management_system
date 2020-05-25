package ims.app.controllers;

import ims.app.dao.UserRepo;
import ims.app.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserRepo userRepo;

    private String userList = "user/user-list";
    private String addUser = "user/new-user";
    private String redirectUser = "redirect:/user-list";

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("userList", userRepo.findAll());
        return userList;
    }

    @GetMapping("/add")
    public String add(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "user/add-user";
    }

    @PostMapping("/save")
    public String save(User user) {
        userRepo.save(user);
        return "redirect:/user/list";
    }

   @GetMapping("/update")
    public String showUserUpdateForm(@RequestParam("id") Long userId, Model model) {
        model.addAttribute("user",  userRepo.findById(userId));
        return "user/add-user";
   }

   @GetMapping("/delete")
    public String deleteUser(@RequestParam("id") User user) {
      userRepo.delete(user);
      return "redirect:/user/list";
   }


}
