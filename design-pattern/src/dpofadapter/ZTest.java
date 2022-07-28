package dpofadapter;

/**
 * @author lbs
 * @description 适配器测试
 */
public class ZTest {
    public static void main(String[] args) {
        Target target = new ChargerAdapter();
        target.output5V();
    }
}
