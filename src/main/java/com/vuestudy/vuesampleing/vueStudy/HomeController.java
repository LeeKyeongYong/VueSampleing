package com.vuestudy.vuesampleing.vueStudy;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/vueMain")
    public String showVueMain(){
        return "vueStudy/main";
    }
}
