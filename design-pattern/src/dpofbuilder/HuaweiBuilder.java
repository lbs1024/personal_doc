package dpofbuilder;

/**
 * @author lbs
 * @description 建造者实现累
 */
public class HuaweiBuilder extends Builder {
    @Override
    public void addProcessor() {
        phone.setProcessor("海思麒麟处理器");
    }

    @Override
    public void addCamera() {
        phone.setCamera("莱卡摄像头");
    }

    @Override
    public void addScreen() {
        phone.setScreen("OLED");
    }
}
