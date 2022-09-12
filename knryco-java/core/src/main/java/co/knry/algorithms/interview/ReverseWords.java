package co.knry.algorithms.interview;

import java.util.Arrays;

public class ReverseWords {

    public static void reverseWords(String input) {
        Arrays.stream(input.split(" ")).forEach(
                word -> {
                    var charWord = word.toCharArray();
                    for (int i=charWord.length-1; i>=0; i--){
                        System.out.print(charWord[i]);
                    }
                    System.out.print(" ");
                }
        );


    }

}
