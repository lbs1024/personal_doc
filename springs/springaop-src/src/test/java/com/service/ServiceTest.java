package com.service;

import com.aop.annotation.LogExecutionTime;
import org.aspectj.lang.annotation.Pointcut;
import org.junit.Test;

public class ServiceTest {

    @Test
    @LogExecutionTime
    @Pointcut
    public void serve() throws InterruptedException {
        Thread.sleep(2000);
    }
}
