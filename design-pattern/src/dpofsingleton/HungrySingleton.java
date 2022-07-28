package dpofsingleton;

/**
 * @author lbs
 * @description 饿汉式单例
 * 饿汉式单例是最简单一种单例模式，它在类初始化时就完成相关单例对象的创建，可以通过静态代码块或静态内部类的方式来进行实现：
 */
public class HungrySingleton {
    private static final HungrySingleton instance;

    static {
        instance = new HungrySingleton();
    }

    /**
     * 确保构造器私有
     */
    private HungrySingleton() {}

    /**
     * 获取单例对象
     * @return 单例对象
     */
    public static HungrySingleton getInstance() {
        return instance;
    }
}
