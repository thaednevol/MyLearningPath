package co.knry.algorithms.interview;

import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;

public class ValidateParentheses {

    public static boolean validateParentheses(String text) {
        Stack<String> characters = new Stack<>();
        AtomicBoolean valid = new AtomicBoolean(true);
        Arrays.stream(text.split("")).forEach(character -> {
                    if (isOpen(character)) {
                        characters.push(character);
                    } else {
                        String topChar = characters.pop();
                        if(!closes(topChar, character)) {
                            valid.set(false);
                        }
                    }
                }
        );
        return valid.get() && characters.empty();
    }

    private static boolean closes(String topChar, String character) {
        Map<String, String> dict = new HashMap<>();
        dict.put("(", ")");
        dict.put("{", "}");
        dict.put("[", "]");
        return dict.containsKey(topChar)?dict.get(topChar).contains(character):false;

    }

    private static boolean isOpen(String character) {
        List<String> opened = new ArrayList<>();
        opened.add("(");
        opened.add("{");
        opened.add("[");

        return opened.contains(character);
    }


}
