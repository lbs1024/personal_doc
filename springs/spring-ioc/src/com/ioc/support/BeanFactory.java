package com.ioc.support;

/**
 * @author lbs
 * @description 抽象工厂
 */
public interface BeanFactory {
    /**
     * 获取bean实例
     * @param name 类名
     * @return 实例对象
     */
    Object getBean(String name);

    /**
     * 获取bean实例
     * @param requiredType 强制bean类型
     * @return 实例对象
     * @param <T> 范型
     */
    <T> T getBean(Class<T> requiredType);

    /**
     * 判断ioc容器中是否包含某bean对象
     * @param name 类名
     * @return true：包含 false：不包含
     */
    boolean containsBean(String name);
}
