package com.annotation.retention;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author lbs
 * @description 自定义Retention注解
 */
public @interface MyRetention {
    @Retention(RetentionPolicy.SOURCE)
    @interface Test1 {
    }

    @Retention(RetentionPolicy.CLASS)
    @interface Test2 {
    }

    @Retention(RetentionPolicy.RUNTIME)
    @interface Test3 {

    }
}
