package com.config;

import com.exception.NoAuthException;
import com.exception.NoAuthExceptionResolver;
import com.interceptor.MyFirstInterceptor;
import com.interceptor.MySecondInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.util.List;

/**
 * @author lbs
 * @description 类似于配置SpringApplication.xml
 */
public class ServletConfig {

    /**
     * 配置视图解析器
     * @return 1
     */
    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
        internalResourceViewResolver.setPrefix("/WEB-INF/jsp");
        internalResourceViewResolver.setSuffix(".jsp");
        internalResourceViewResolver.setExposeContextBeansAsAttributes(true);
        return internalResourceViewResolver;
    }

    /**
     * 配置静态资源处理器
     * @param configurer 1
     */
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new MyFirstInterceptor()).addPathPatterns("/mvc/**").excludePathPatterns("mvc/login");
        registry.addInterceptor(new MySecondInterceptor()).addPathPatterns("/mvc/**");
    }

    public void configureHandlerExceptionResolvers(List<HandlerExceptionResolver> resolvers) {
        resolvers.add(new NoAuthExceptionResolver());
    }
}
