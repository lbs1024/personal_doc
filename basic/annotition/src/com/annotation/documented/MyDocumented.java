package com.annotation.documented;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * @author lbs
 * @description 自定义documented注解
 */
@Documented
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface MyDocumented {
    public String value() default "这是@Documented注解";
}
