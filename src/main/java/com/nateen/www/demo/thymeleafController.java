package com.nateen.www.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
public class thymeleafController {

    @GetMapping(value = "home")
    public String thymeleafView(Model model){

        model.addAttribute("data","hello nateen");

        return "/home/home";
    }

    @GetMapping(value = "thymeleafView")
    public String thymeleafView1(Model model){
        Map<String, String> mapData = new HashMap<>();
        mapData.put("name","nateen");
        mapData.put("age","20");
        mapData.put("address","판교");

        model.addAttribute("data",mapData);

        return "/home/thymeleafView";
    }



}
