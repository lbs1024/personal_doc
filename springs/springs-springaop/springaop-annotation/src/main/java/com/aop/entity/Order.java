package com.aop.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author lbs
 * @description 订单实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private long id;

    private String productName;

    private Date orderTime;
}
