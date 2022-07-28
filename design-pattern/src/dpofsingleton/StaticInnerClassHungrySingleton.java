package dpofsingleton;

/**
 * @author lbs
 * @description 静态内部类实现饿汉式
 * 饿汉式单例的优点在于其不存在线程安全问题，对象的唯一性由虚拟机在类初始化创建时保证；其缺点在于如果对象的创建比较消耗资源，并且单例对象不一定
 * 会被使用时就会造成资源的浪费。
 */
public class StaticInnerClassHungrySingleton {
    private static class InnerClass {
        private static StaticInnerClassHungrySingleton instance = new StaticInnerClassHungrySingleton();
    }

    private StaticInnerClassHungrySingleton() {}

    public static StaticInnerClassHungrySingleton getInstance() {
        return InnerClass.instance;
    }
}
