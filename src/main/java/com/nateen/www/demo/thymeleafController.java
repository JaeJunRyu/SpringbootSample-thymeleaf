package com.nateen.www.demo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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


    @GetMapping(value = "thymeleafView7")
    public String thymeleafView7(Model model) {
        Person person1 = new Person("전지현",30,"강남");
        Person person2 = new Person("김태희",31,"강북");
        Person person3 = new Person("진세연",20,"서초");

        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);

        model.addAttribute("dataList",personList);

        return "/home/thymeleafView7";
    }


    @Getter
    @Setter
    class Person {
        private String name;
        private Integer age;
        private String address;

        public Person(String name, Integer age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }



    @GetMapping(value = "thymeleafView8")
    public String thymeleafView8(Model model) {
        Person person1 = new Person("전지현",30,"강남");
        Person person2 = new Person("김태희",31,"강북");
        Person person3 = new Person("진세연",20,"서초");

        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);

        model.addAttribute("data1",person1);
        model.addAttribute("data2",person2);
        model.addAttribute("data3",person3);

        model.addAttribute("dataList",personList);

        return "/home/thymeleafView8";
    }





}
