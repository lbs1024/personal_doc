package dpofproxy;

import java.lang.reflect.Proxy;

/**
 * @author lbs
 * @description jdk代理
 */
public class JdkProxy {
    public static void main(String[] args) {
        ComputeService target = new ComputeService();
        IService proxyInstance = (IService) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                // 代理类要实现的接口列表
                target.getClass().getInterfaces(),
                (proxy, method, args1) -> {
                    System.out.println("权限校验");
                    Object invoke = method.invoke(target, args1);
                    System.out.println("资源回收");
                    return invoke;
                }
        );
        proxyInstance.compute();
    }
}
