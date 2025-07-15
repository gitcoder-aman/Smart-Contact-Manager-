package com.tech.scm20.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class PageController {
    
    @RequestMapping("/home")
    public String home(Model model) {
        System.out.println("Accessing home page");

        //setting attributes to be used in the view
        model.addAttribute("name", "Substring");
        model.addAttribute("YoutubeChannel", "Learn with Durgesh");
        model.addAttribute("GithubRepository", "https://github.com/gitcoder-aman");
        return "home"; // This should return the name of the view for the home page
    }

    @RequestMapping("/about")
    public String aboutPage(Model model) {
        model.addAttribute("isLogin", true);
        System.out.println("About page accessed");
        return "about"; // This should return the name of the view for the about page
    }

     @RequestMapping("/services")
    public String servicesPage() {
        System.out.println("Services page accessed");
        return "services"; // This should return the name of the view for the services page
    }
}
