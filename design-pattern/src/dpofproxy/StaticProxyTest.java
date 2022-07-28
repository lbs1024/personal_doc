package dpofproxy;

/**
 * @author lbs
 * @description 静态代理测试
 */
public class StaticProxyTest {
    public static void main(String[] args) {
        ProxyService proxyService = new ProxyService(new ComputeService());
        proxyService.compute();
    }
}
