package dpofproxy;

/**
 * @author lbs
 * @description 代理目标对象
 */
public class ComputeService implements IService {
    @Override
    public void compute() {
        System.out.println("业务处理");
    }
}
