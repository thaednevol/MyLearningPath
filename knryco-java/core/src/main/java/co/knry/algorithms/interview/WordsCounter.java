package co.knry.algorithms.interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordsCounter {

    public static Map wordsCounter(String text) {
        Map<String, Integer> words = new HashMap<>();

        String[] textSplitted = text.toLowerCase().split(" ");

        Arrays.stream(textSplitted).forEach(w -> {
          if (words.containsKey(w)){
              words.put(w, words.get(w).intValue()+1);
          }
          else {
              words.put(w, 1);
          }
        });
        return words;
    }
}
