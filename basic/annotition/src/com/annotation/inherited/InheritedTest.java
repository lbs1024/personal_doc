package com.annotation.inherited;

/**
 * @author lbs
 * @description Inherited注解测试
 */
@MyInherited
public class InheritedTest {
    public static void main(String[] args) {
        System.out.println(InheritedTest.class.getAnnotation(MyInherited.class));
        System.out.println(Test1.class.getAnnotation(MyInherited.class));
        System.out.println(Test2.class.getAnnotation(MyInherited.class));
    }

    class Test1 extends InheritedTest {
    }

    class Test2 extends InheritedTest {
    }
}
