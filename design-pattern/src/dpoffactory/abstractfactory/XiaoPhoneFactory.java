package dpoffactory.abstractfactory;

import dpoffactory.simplefactory.Phone;
import dpoffactory.simplefactory.XiaomiPhone;

/**
 * @author lbs
 */
public class XiaoPhoneFactory implements Factory {
    @Override
    public Phone producePhone() {
        return new XiaomiPhone();
    }

    @Override
    public Charger produceCharger() {
        return new XiaomiCharger();
    }
}
