package org.lessons.java.boty.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/")
public class HomeController {
    
    @GetMapping("/")
    public String index(Model model, @RequestParam(name = "name") String name){
        
        model.addAttribute("name", name.substring(0,1).toUpperCase() + name.substring(1));
        
        return "index";
    }

}
