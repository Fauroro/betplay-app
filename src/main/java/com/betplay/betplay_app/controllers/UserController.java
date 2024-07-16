package com.betplay.betplay_app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.betplay.betplay_app.models.User;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/api")

public class UserController {

    @GetMapping("/details")
    public String details(Model model) {
        User user = new User("Fauroro", "Rdz");
        model.addAttribute("title","Argentina Roba");
        model.addAttribute("user",user);
        return "details";
    }
    

}
