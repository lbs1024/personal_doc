package dpoffactory.simplefactory;

/**
 * @author lbs
 * @description 具体的产品
 */
public class HuaweiPhone extends Phone {
    @Override
    public void call(String phoneNum) {
        System.out.println("华为收集拨打电话: " + phoneNum);
    }
}
