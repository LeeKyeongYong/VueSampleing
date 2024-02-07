package com.vuestudy.vuesampleing.vueStudy;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    private int count1 = 0;
    private int count2 = 0;

    @GetMapping("/vueMain")
    public String showVueMain(Model model){


        model.addAttribute("count1",count1);
        model.addAttribute("count2",count2);

        //return "vueStudy/main";
        return "vueStudy/vueMain";
    }
    @GetMapping("/vueMain2")
    public String showVueMain2(Model model){
        return "vueStudy/vueMain2";
    }
    @GetMapping("/count1")
    @ResponseBody
    public RsData<Integer> getCount1(Model model){
        return new RsData<>("S-1","current count1",count1);
    }

    @GetMapping("/count2")
    @ResponseBody
    public RsData<Integer> getCount2(Model model){
        return new RsData("S-1","current count2",count2);
    }

    @GetMapping("/increaseCount1")
    @ResponseBody
    public RsData<Integer> incraseCount1(Model model){
        return new RsData<>("S-1","count1 increased",++count1);
    }

    @GetMapping("/increaseCount2")
    @ResponseBody
    public RsData<Integer> increaseCount2(Model model){
        return new RsData<>("S-1","count2 increased",++count2);
    }

    @GetMapping("/vueMain3")
    public String showVueMain3(Model model){
        return "vueStudy/vueMain3";
    }

    @GetMapping("/vueMain4")
    public String showVueMain4(Model model){
        return "vueStudy/vueMain4";
    }
    @GetMapping("/vueMain5")
    public String showVueMain5(Model model){
        return "vueStudy/vueMain5";
    }

    @GetMapping("/vueMain6")
    public String showVueMain6(Model model){
        return "vueStudy/vueMain6";
    }

    @GetMapping("/vueMain7")
    public String showVueMain7(Model model){
        return "vueStudy/vueMain7";
    }
}
