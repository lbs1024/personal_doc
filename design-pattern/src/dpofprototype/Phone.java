package dpofprototype;

/**
 * @author lbs
 * @description 原型模式
 * 用原型实例指定创建对象的种类，并通过拷贝这些原型创建新的对象。
 */
public class Phone implements Cloneable {
    private String type;

    Phone(String type) {
        System.out.println("构造器被调用");
        this.type = type;
    }

    public void call() {
        System.out.println(type + " 拨打电话");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("克隆方法被调用");
        return super.clone();
    }
}
