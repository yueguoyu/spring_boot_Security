package com.ygy.controller;

import com.ygy.dao.UserDao;
import com.ygy.model.Sysuser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ygy
 * @date 2017/12/05
 */
@Controller
public class HomeController {
    @Autowired
    UserDao dao;
    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("msg","测试！！！！");
        return "home";
    }
//    @RequestMapping("/login")
//    public String select(@ModelAttribute(value = "Test")Sysuser sysuser,Model model){
//        Sysuser sysuser1=this.dao.findByUserName(sysuser.getUsername());
//        model.addAttribute("t1",sysuser1);
//        return "success";
//    }
}
