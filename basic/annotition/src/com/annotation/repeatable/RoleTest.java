package com.annotation.repeatable;

/**
 * @author lbs
 * @description Repeatable注解测试
 */
public class RoleTest {
    @Role(roleName = "role1")
    @Role(roleName = "role2")
    public String doString() {
        return "";
    }
}
