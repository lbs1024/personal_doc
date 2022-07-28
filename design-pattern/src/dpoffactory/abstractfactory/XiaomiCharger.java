package dpoffactory.abstractfactory;

import dpoffactory.simplefactory.Phone;

/**
 * @author lbs
 * @description 充电器实现类
 */
public class XiaomiCharger extends Charger {
    @Override
    public void charge(Phone phone) {
        System.out.println("小米充电器: " + phone + "充电");
    }
}
