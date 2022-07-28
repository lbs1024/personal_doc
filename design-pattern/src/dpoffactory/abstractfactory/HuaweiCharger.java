package dpoffactory.abstractfactory;

import dpoffactory.simplefactory.Phone;

/**
 * @author lbs
 * @description 充电器
 */
public class HuaweiCharger extends Charger {
    @Override
    public void charge(Phone phone) {
        System.out.println("华为充电器给: " + phone + "充电");
    }
}
