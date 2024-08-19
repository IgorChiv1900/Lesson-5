import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class UniqueWordsCounter {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(List.of(
                "apple", "banana", "orange", "apple", "kiwi",
                "banana", "grape", "kiwi", "melon", "banana",
                "apple", "orange", "kiwi", "grape", "melon", "banana"
        ));

        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println("Уникальные слова и их количество:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}