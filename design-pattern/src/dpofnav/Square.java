package dpofnav;

/**
 * @author lbs
 * @description 图形实现
 */
public class Square extends Shape {
    @Override
    public void getDesc() {
        System.out.println(getColor().getDesc() + "正方形");
    }
}
