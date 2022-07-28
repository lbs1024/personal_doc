package dpofsingleton;

/**
 * @author lbs
 * @description 双重检查所机制实现懒汉式单粒
 */
public class DoubleCheckLazySingletonSafe {
    private static volatile DoubleCheckLazySingletonSafe instance = null;

    private DoubleCheckLazySingletonSafe() {}

    public static DoubleCheckLazySingletonSafe getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckLazySingletonSafe.class) {
                if (instance == null) {
                    instance = new DoubleCheckLazySingletonSafe();
                }
            }
        }
        return instance;
    }
}
