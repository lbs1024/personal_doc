package com.ioc.support;

/**
 * @author lbs
 * @description 抽象对象工厂
 */
public interface ObjectFactory<T> {
    /**
     * 获取对象
     * @return 实例对象
     */
    T getObject();
}
