package rocks.zipcode.quiz4.collections;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {

    Map<String,Integer> wordMap = new HashMap<>();

    public WordCounter(String... strings) {
    }

    public Map<String, Integer> getWordCountMap() {
        return wordMap;
    }
}
