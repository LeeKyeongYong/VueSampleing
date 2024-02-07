package com.vuestudy.vuesampleing.vueStudy;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private int count1 = 0;
    private int count2 = 0;

    @GetMapping("/vueMain")
    public String showVueMain(Model model){
        count1++;
        count2++;

        model.addAttribute("count1",count1);
        model.addAttribute("count2",count2);

        return "vueStudy/main";
    }
}
