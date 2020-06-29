package ims.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private String signin = "home/login";
    private String home = "home/home";
    private String comingSoon = "home/coming-soon";
    private String settings = "settings/settings-page";


    @GetMapping("/home/login")
    public String signin(String error, Model model) {
        if (error != null) {
            model.addAttribute("ErrorParam", true);
        }
        return signin;
    }

    @GetMapping("/")
    public String getHome() {
        return home;
    }

    @GetMapping("/home/coming-soon")
    public String getComingSoon() {
        return comingSoon;
    }

    @GetMapping("/settings/settings-page")
    public String getSettings() {
        return settings;
    }

}
