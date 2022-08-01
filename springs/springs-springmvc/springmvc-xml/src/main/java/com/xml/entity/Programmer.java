package com.xml.entity;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * @author lbs
 * @description 实体校验
 */
public class Programmer {
    @NotNull
    private String name;
    @Min(value = 0, message = "年龄不能为负数！")
    private int age;
    @Min(value = 0, message = "薪酬不能为负数")
    private float salary;

    private String birthday;
}
