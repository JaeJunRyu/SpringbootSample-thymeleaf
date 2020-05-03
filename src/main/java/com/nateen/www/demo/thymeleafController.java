package com.nateen.www.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class thymeleafController {

    @GetMapping(value = "home")
    public String thymeleafView(){
        return "/home/home";
    }


}
