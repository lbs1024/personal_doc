package com.service;

import com.aop.annotation.LogExecutionTime;
import org.junit.Test;

public class ServiceTest {

    @Test
    @LogExecutionTime
    public void serve() throws InterruptedException {
        Thread.sleep(2000);
    }
}
