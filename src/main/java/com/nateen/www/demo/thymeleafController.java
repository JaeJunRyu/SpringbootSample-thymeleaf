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

    @GetMapping(value = "thymeleafView2")
    public String thymeleafView2(Model model){
        Map<String, Object> mapData = new HashMap<>();
        mapData.put("name","nateen");
        mapData.put("age",20);
        mapData.put("address","판교");

        model.addAttribute("data",mapData);

        return "/home/thymeleafView2";
    }

    @GetMapping(value = "thymeleafView3")
    public String thymeleafView3(Model model){
        Map<String, Object> mapData = new HashMap<>();
        mapData.put("name","nateen");
        mapData.put("age",20);
        mapData.put("address","판교");

        model.addAttribute("data",mapData);

        return "/home/thymeleafView3";
    }


    @GetMapping(value = "thymeleafView4")
    public String thymeleafView4(Model model){
        Map<String, Object> mapData = new HashMap<>();
        mapData.put("name","nateen");
        mapData.put("age",20);
        mapData.put("address","판교");

        model.addAttribute("data",mapData);

        return "/home/thymeleafView4";
    }


    @GetMapping(value = "thymeleafView5")
    public String thymeleafView5(Model model){
        Map<String, Object> mapData = new HashMap<>();
        mapData.put("name","nateen");
        mapData.put("age",20);
        mapData.put("address","판교");

        model.addAttribute("data",mapData);

        return "/home/thymeleafView5";
    }

    @GetMapping(value = "thymeleafView6")
    public String thymeleafView6(Model model){
        Map<String, Object> mapData = new HashMap<>();
        mapData.put("name","nateen");
        mapData.put("age",20);
        mapData.put("address","판교");

        model.addAttribute("data",mapData);

        return "/home/thymeleafView6";
    }

}
