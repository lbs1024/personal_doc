package dpofadapter;

/**
 * @author lbs
 * @description 适配器模式
 */
public class PowerSupply {
    private final int output = 220;

    public int output220V() {
        System.out.println("电源电压: " + output);
        return output;
    }
}
