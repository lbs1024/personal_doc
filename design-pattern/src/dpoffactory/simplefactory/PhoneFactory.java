package dpoffactory.simplefactory;

/**
 * @author lbs
 * @description 手机工厂
 */
public class PhoneFactory {
    public Phone getPhone(String type) {
        if ("xiaomi".equalsIgnoreCase(type)) {
            return new XiaomiPhone();
        } else if ("huawei".equalsIgnoreCase(type)) {
            return new HuaweiPhone();
        }
        return null;
    }
}
