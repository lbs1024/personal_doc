package mapandflatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author lbs
 * @description 现有一个句子列表，需要将句子中每个单词都提取出来得到一个所有单词列表
 */
public class TestOfFlatMap {
    public static void stringToIntFlatMap() {
        List<String> sentences = Arrays.asList("hello world","Jia Gou Wu Dao");
        // 使用流操作
        List<String> results = sentences.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
                .collect(Collectors.toList());
        System.out.println(results);
    }

    public static void main(String[] args) {
        stringToIntFlatMap();
    }
}
