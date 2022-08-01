package com.aop;

import com.aop.service.OrderService;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author lbs
 * @description 切面测试
 */
@RunWith(SpringRunner.class)
@ContextConfiguration("classpath:aop.xml")
public class AopTest {
    private OrderService orderService;
}
