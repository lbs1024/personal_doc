package dpofprototype;

/**
 * @author lbs
 * @description 原型模式测试
 */
public class ZTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Phone phone = new Phone("3G手机");
        Phone clonePhone = (Phone) phone.clone();
        clonePhone.call();
    }
}
