package com.aop.aspect;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author lbs
 * @description aop切面定义
 */
public class AdderAfterReturnAspect {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public void afterReturn(Object returnValue) throws Throwable {
        logger.info("value return was {}", returnValue);
    }
}
