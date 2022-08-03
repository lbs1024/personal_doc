package com.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lbs
 */
@RestController
public class HelloController {

    @GetMapping(value = "/")
    public String helloWorld() {
        return "这里是hdfs集群的slave2节点";
    }
}
