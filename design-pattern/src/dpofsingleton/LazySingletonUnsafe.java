package dpofsingleton;

/**
 * @author lbs
 * @description 多线程下不安全的懒汉式单粒模式
 */
public class LazySingletonUnsafe {
    private static LazySingletonUnsafe instance = null;

    private LazySingletonUnsafe() {}

    public static LazySingletonUnsafe getInstance() {
        if (instance == null) {
            instance = new LazySingletonUnsafe();
        }
        return instance;
    }
}
