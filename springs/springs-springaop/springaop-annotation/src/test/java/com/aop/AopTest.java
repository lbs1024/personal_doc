package com.aop;

import com.aop.config.AopConfig;
import com.aop.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = AopConfig.class)
public class AopTest {

    private OrderService orderService;

    @Test
    public void saveAndQuery() {
        orderService.createOrder(1234567890L, "手机");
        orderService.queryOrder(352345345234L);
    }

    @Test
    public void delete() {
        orderService.deleteOrder(132342342L);
    }
}
