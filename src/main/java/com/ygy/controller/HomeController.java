package com.ygy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ygy
 * @date 2017/12/05
 */
@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("msg","测试！！！！");
        return "home";
    }
}
