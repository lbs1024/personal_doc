package com.annotation.documented;

/**
 * @author lbs
 * @description documented测试类
 */
public class DocumentedTest {

    @MyDocumented
    public String test() {
        return "这是 Documented 注解测试类";
    }
}
