package dpofsingleton;

import java.lang.reflect.Constructor;

/**
 * @author lbs
 * @description 反射破坏单例
 */
public class ReflectionDamage {
    public static void main(String[] args) throws Exception {
        Constructor<HungrySingleton> constructor = HungrySingleton.class.getDeclaredConstructor();
        // 获取私有构造器的访问权限
        constructor.setAccessible(true);
        HungrySingleton hungrySingleton = constructor.newInstance();
        HungrySingleton instance = HungrySingleton.getInstance();
        System.out.println(hungrySingleton == instance);
    }
}
