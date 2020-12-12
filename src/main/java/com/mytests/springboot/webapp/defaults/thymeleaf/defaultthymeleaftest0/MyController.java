package com.mytests.springboot.webapp.defaults.thymeleaf.defaultthymeleaftest0;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
        model.addAttribute("next","index");
        return "step2";
    }

    @ModelAttribute("global_attr")
    public String ma(Model model){
        
        model.addAttribute("global_extra","does it work?");
        return "my_global_attr";
    }

    @ModelAttribute("listGlobalAttr1")
    public List<? extends MyDataType> listGlobalAttr1(){
        List<MyDataTypeImpl> mylist = new ArrayList<>();
        mylist.add(new MyDataTypeImpl("aaa"));
        mylist.add(new MyDataTypeImpl("bbb"));
        mylist.add(new MyDataTypeImpl("ccc"));
        return mylist;
    }

    @RequestMapping("/index")
    public String index(ModelMap model) {
        model.addAttribute("index_attr1", "hi");
        return "index";
    }
}
