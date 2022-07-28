package com.xml.controller;

import com.xml.exception.NoAuthException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lbs
 * @description 控制器测试
 */
@Controller
@RequestMapping(value = "/mvc-xml")
public class HelloController {

    @RequestMapping(value = "/hello")
    public String hello() {
        return "hello";
    }

    @RequestMapping(value = "/auth")
    private void auth() {
        throw new NoAuthException("没有对应的访问权限!");
    }
}
