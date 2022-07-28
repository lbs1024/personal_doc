package dpofbuilder;

/**
 * @author lbs
 * @description 将一个复杂对象的构造与它的表示分离，使同样的构建过程可以创建不同的表示。它将一个复杂对象的创建过程分解为多个简单的步骤
 * ，然后一步一步的组装完成。
 */
public class Phone {
    private String processor;

    private String camera;

    private String screen;

    public Phone() {}

    public Phone(String processor, String camera, String screen) {
        this.processor = processor;
        this.camera = camera;
        this.screen = screen;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }
}
