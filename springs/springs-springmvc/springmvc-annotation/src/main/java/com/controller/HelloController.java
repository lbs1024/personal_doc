package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lbs
 * @description 测试配置是否成功
 */
public class HelloController {

    @RequestMapping("hello")
    private String hello() {
        return "hello";
    }
}
