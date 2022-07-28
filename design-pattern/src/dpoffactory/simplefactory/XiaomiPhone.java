package dpoffactory.simplefactory;

/**
 * @author lbs
 * @description 具体产品
 */
public class XiaomiPhone extends Phone {

    @Override
    public void call(String phoneNum) {
        System.out.println("小米手机拨打电话： " + phoneNum);
    }
}
