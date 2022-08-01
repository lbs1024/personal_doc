package com.aop.service.impl;

import com.aop.service.OrderService;
import entity.Order;

import java.util.Date;

/**
 * @author lbs
 * @description 切入接口实现类
 */
public class OrderServiceImpl implements OrderService {
    @Override
    public Order queryOrder(Long id) {
        return new Order(id, "product", new Date());
    }

    @Override
    public Order createOrder(Long id, String productName) {
        // 模拟抛出异常
//        int j = 1 / 0;
        return new Order(id, "new Product", new Date());
    }
}
