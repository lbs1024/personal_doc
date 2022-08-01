package com.aop.service;

import com.aop.entity.Order;

/**
 * @author lbs
 * @description 切入接口定义
 */
public interface OrderService {
    Order queryOrder(Long id);

    Order createOrder(Long id, String productName);

    boolean deleteOrder(Long id);
}
