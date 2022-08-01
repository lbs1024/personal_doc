package com.xml.controller;

import com.xml.Programmer;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

/**
 * @author lbs
 * @description 制定视图控制器
 */
@Controller
public class ParamBindController {
    @InitBinder
    public void param(WebDataBinder binder) {
        binder.addCustomFormatter(new DateFormatter("yyyy-MM-dd HH:mm:ss"));
    }

    @RequestMapping("param")
    public String param(String name, int age, double salary, @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date birthday, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("age", age);
        model.addAttribute("salary", salary);
        model.addAttribute("birthday", birthday);
        return "param";
    }

    @RequestMapping("param2")
    public String param2(String name, int age, double salary, Date birthday, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("age", age);
        model.addAttribute("salary", salary);
        model.addAttribute("birthday", birthday);
        return "param";
    }

    @PostMapping("param3")
    public String param3(Programmer programmer, String extendParam, Model model) {
        System.out.println("extendParam" + extendParam);
        model.addAttribute("p", programmer);
        return "param";
    }
}
