import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author lbs
 * @description java8的stream运算直观认知
 *
 * 定义需求：从给定句子中返回单词长度大于5的单词列表，按长度倒序输出，最多返回3个
 */
public class QuickStart {
    /**
     * java7及之前的处理方法
     * @param sentence 句子
     * @return 单词集合
     */
    public List<String> func1(String sentence) {
        // 1.切割句子，获取单词
        String[] words = sentence.split(" ");
        List<String> wordList = new ArrayList<>();
        // 2.过滤出长度超过5的单词
        for (String word : words) {
            if (word.length() > 5) {
                wordList.add(word);
            }
        }
        // 3.对长度超过5的单词按长度倒序排序
        wordList.sort((a, b) -> b.length() - a.length());
        // 4.保留前三者
        if (wordList.size() > 3) {
            wordList = wordList.subList(0, 3);
        }
        return wordList;
    }

    /**
     * java8使用stream优雅的方式
     * @param sentence 句子
     * @return 单词集合
     */
    public List<String> func2(String sentence) {
        return Arrays.stream(sentence.split(" "))
                .filter(w -> w.length() > 5)
                .sorted((a, b) -> b.length() - a.length())
                .limit(3)
                .collect(Collectors.toList());
    }
}
