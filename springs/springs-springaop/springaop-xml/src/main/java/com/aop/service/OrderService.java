package com.aop.service;

import entity.Order;

/**
 * @author lbs
 * @description 待切入的接口
 */
public interface OrderService {
    Order queryOrder(Long id);

    Order createOrder(Long id, String productName);
}
