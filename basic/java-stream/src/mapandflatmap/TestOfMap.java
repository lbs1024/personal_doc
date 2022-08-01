package mapandflatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author lbs
 * @description 有一个字符串ID列表，现在需要将其转为User对象列表
 */
public class TestOfMap {
    public static void stringToIntMap() {
        List<String> ids = Arrays.asList("205", "105", "308", "469", "627", "193", "111");
        // 使用流操作
        List<User> results = ids.stream()
                .map(id -> {
                    User user = new User();
                    user.setId(id);
                    return user;
                })
                .collect(Collectors.toList());
        System.out.println(results);
    }

    public static void main(String[] args) {
        stringToIntMap();
    }
}
