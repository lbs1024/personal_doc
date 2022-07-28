package dpofnav;

/**
 * @author lbs
 * @description 桥接测试
 */
public class ZTest {
    public static void main(String[] args) {
        new Square().setColor(new Red()).getDesc();
        new Square().setColor(new Blue()).getDesc();
        new Round().setColor(new Blue()).getDesc();
        new Round().setColor(new Yellow()).getDesc();
    }
}
