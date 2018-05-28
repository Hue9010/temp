package com.example.mybatispractice.controller;

import com.example.mybatispractice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public String user(Model model){
        System.out.println(userService.test());
        model.addAttribute("users",userService.test());
        return "/user";
    }

}
