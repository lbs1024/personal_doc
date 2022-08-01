package peekandforeach;

import java.util.Arrays;
import java.util.List;

/**
 * @author lbs
 * @description 测试peek和foreach方法
 */
public class Test {
    public static void testPeekAndForeach() {
        List<String> sentences = Arrays.asList("hello world","Jia Gou Wu Dao");
        // 1.仅peek操作，最终不会执行
        System.out.println("---before peek---");
        sentences.stream()
                        .peek(System.out::println);
        System.out.println("---after peek---");

        // 2.仅foreach操作，最终会执行
        System.out.println("---before foreach---");
        sentences.stream()
                        .forEach(System.out::println);
        System.out.println("---after foreach---");

        // 3.peek操作后增加终止操作，peek会执行
        System.out.println("---before peek and count---");
        sentences.stream()
                        .peek(System.out::println).count();
        System.out.println("---after peek and count---");
    }

    public static void main(String[] args) {
        testPeekAndForeach();
    }
}
