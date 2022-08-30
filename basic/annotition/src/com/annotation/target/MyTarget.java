package com.annotation.target;

/**
 * @author lbs
 * @description 自定义Target注解
 */
public @interface MyTarget {
    class Test {
        @MyTarget
        String name;
    }
}
