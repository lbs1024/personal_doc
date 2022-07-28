package dpoffactory.abstractfactory;

import dpoffactory.simplefactory.Phone;

/**
 * @author lbs
 * @description 工厂接口
 */
public interface Factory {
    Phone producePhone();
    Charger produceCharger();
}
