package com.mainacad.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller("/authorization")
public class AuthController {

    @PostMapping()
    public String getAuthUser(Model model,
                              @RequestParam(value="login", required=false) String login,
                              @RequestParam(value="pass", required=false) String password) {

        model.addAttribute("name", "Alex");
        model.addAttribute("surname", "Ignatenko");

        return "resp";
    }
}
