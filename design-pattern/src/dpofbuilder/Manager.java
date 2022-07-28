package dpofbuilder;

/**
 * @author lbs
 * @description 管理者类
 */
public class Manager {
    private Builder builder;

    public Manager(Builder builder) {
        this.builder = builder;
    }

    public Phone buy() {
        builder.addProcessor();
        builder.addCamera();
        builder.addScreen();
        return builder.produce();
    }
}
