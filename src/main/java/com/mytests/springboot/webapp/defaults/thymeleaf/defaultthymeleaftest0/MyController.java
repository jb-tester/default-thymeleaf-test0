package com.mytests.springboot.webapp.defaults.thymeleaf.defaultthymeleaftest0;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 8/14/2017.
 * Project: default-thymeleaf-test0
 * *******************************
 */
@Controller
public class MyController {

    @RequestMapping("/")
    public String Method(ModelMap model) {
        model.addAttribute("home_attr1", "test0");
        model.addAttribute("home_attr2", "this is default thymeleaf configuration test");
        model.addAttribute("next", "next_step");
        return "home";
    }

    @RequestMapping("/next_step")
    public String Method2(ModelMap model) {
        model.addAttribute("title","next step");
        model.addAttribute("attr","you are here");
        return "step2";
    }
}
