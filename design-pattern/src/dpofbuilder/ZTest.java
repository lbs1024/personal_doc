package dpofbuilder;

/**
 * @author lbs
 * @description 建造者测试
 */
public class ZTest {
    public static void main(String[] args) {
        Phone huawei = new Manager(new HuaweiBuilder()).buy();
        System.out.println(huawei);
        Phone xiaomi = new Manager(new XiaomiBuilder()).buy();
        System.out.println(xiaomi);
    }
}
