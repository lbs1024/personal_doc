package com.annotation.repeatable;

import java.lang.annotation.Repeatable;

/**
 * @author lbs
 * @description Repeatable注解使用
 */
public @interface Roles {
    Role[] value();
}

/**
 * @author lbs
 */
@Repeatable(Roles.class)
@interface Role {
    String roleName();
}
