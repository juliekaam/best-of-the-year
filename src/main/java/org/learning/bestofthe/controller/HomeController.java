package org.learning.bestofthe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
    @GetMapping
    public String home(Model model){

        String myName = "Julie Kaam";
        model.addAttribute("subtitle", myName);
        // ritorna una stringa che è il nome del template che si trova in resources/templates
        return "home";
    }

}
