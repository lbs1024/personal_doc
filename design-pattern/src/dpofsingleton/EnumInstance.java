package dpofsingleton;

/**
 * @author lbs
 * @description 枚举式单例
 */

public enum EnumInstance {
    INSTANCE;

    private String field;

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public static EnumInstance getInstance() {
        return INSTANCE;
    }
}
