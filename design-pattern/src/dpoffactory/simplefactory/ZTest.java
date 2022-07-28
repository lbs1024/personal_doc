package dpoffactory.simplefactory;

/**
 * @author lbs
 * @description 工厂测试
 */
public class ZTest {
    public static void main(String[] args) {
        PhoneFactory factory = new PhoneFactory();
        factory.getPhone("xiaomi").call("123");
        factory.getPhone("huawei").call("456");
    }
}
