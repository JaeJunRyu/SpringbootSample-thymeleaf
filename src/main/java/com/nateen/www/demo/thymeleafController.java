package com.nateen.www.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class thymeleafController {

    @GetMapping(value = "home")
    public String thymeleafView(Model model){

        model.addAttribute("data","hello nateen");

        return "/home/home";
    }


}
