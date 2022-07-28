package dpofadapter;

/**
 * @author lbs
 * @description 适配器需要继承资源类，实现目标类接口
 */
public class ChargerAdapter extends PowerSupply implements Target {
    @Override
    public int output5V() {
        int output = output220V();
        System.out.println("充电器适配转换");
        output = output / 44;
        System.out.println("输出电压: " + output);
        return output;
    }
}
