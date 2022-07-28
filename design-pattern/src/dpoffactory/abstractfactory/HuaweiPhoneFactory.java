package dpoffactory.abstractfactory;

import dpoffactory.simplefactory.HuaweiPhone;
import dpoffactory.simplefactory.Phone;

/**
 * @author lbs
 * @description 工厂实现类
 */
public class HuaweiPhoneFactory implements Factory {

    @Override
    public Phone producePhone() {
        return new HuaweiPhone();
    }

    @Override
    public Charger produceCharger() {
        return new HuaweiCharger();
    }
}
