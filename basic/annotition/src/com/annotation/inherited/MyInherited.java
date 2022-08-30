package com.annotation.inherited;

import java.lang.annotation.*;

/**
 * @author lbs
 * @description 自定义Inherited注解
 */
@Target({ElementType.TYPE})
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface MyInherited {
}
