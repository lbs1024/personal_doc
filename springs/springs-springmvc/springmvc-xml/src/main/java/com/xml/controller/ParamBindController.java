package com.xml.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;

/**
 * @author lbs
 * @description 制定视图控制器
 */
@Controller
public class ParamBindController {

    protected void initBinder(WebDataBinder binder) {
        binder.addCustomFormatter(new DataFormatter("yyyy-MM-dd HH:mm:ss"));
    }
}
