package dpofproxy;

/**
 * @author lbs
 * @description 在代理对象中注入目标
 */
public class ProxyService implements IService {
    private IService target;

    public ProxyService(IService target) {
        this.target = target;
    }

    @Override
    public void compute() {
        System.out.println("权限校验");
        target.compute();
        System.out.println("资源回收");
    }
}
