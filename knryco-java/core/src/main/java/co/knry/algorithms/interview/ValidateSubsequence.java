package co.knry.algorithms.interview;

import java.util.ArrayList;
import java.util.List;

public class ValidateSubsequence {

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int arrIndex = 0;
        int seqIndex = 0;

        while (arrIndex < array.size() && seqIndex < sequence.size()) {
            if (array.get(arrIndex).equals(sequence.get(seqIndex))) {
                seqIndex ++ ;

                System.out.println(arrIndex+ " " + seqIndex);
            }
            arrIndex++;
        }
        return seqIndex == sequence.size();
    }

}
