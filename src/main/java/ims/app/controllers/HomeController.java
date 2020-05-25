package ims.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private String home = "home/home";
    private String settings = "settings/settings-page";

    @GetMapping("/")
    public String getHome() {
        return home;
    }

    @GetMapping("/settings/settings-page")
    public String getSettings() {
        return settings;
    }

}
