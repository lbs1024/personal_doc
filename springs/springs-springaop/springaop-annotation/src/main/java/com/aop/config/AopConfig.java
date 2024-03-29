package com.aop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author lbs
 * @description 配置切面
 */
@Configuration
@ComponentScan("com.aop.*")
@EnableAspectJAutoProxy
public class AopConfig {
}
