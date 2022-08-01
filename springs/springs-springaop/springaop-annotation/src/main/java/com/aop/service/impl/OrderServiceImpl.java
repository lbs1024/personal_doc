package com.aop.service.impl;

import com.aop.entity.Order;
import com.aop.service.OrderService;

import java.util.Date;

/**
 * @author lbs
 * @description 切面接口实现
 */
public class OrderServiceImpl implements OrderService {

    @Override
    public Order queryOrder(Long id) {
        return new Order(id, "product", new Date());
    }

    @Override
    public Order createOrder(Long id, String productName) {
        return new Order(id, "new Product", new Date());
    }

    @Override
    public boolean deleteOrder(Long id) {
        return true;
    }
}
