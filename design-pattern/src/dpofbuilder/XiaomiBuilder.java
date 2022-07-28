package dpofbuilder;

/**
 * @author lbs
 * @description 创建者实现类
 */
public class XiaomiBuilder extends Builder {
    @Override
    public void addProcessor() {
        System.out.println("高通骁龙处理器");
    }

    @Override
    public void addCamera() {
        System.out.println("索尼摄像头");
    }

    @Override
    public void addScreen() {
        System.out.println("OLED");
    }
}
