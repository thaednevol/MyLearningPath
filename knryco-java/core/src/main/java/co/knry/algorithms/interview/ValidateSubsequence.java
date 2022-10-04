package co.knry.algorithms.interview;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class ValidateSubsequence {

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int seqIndex = 0;

        AtomicInteger finalSeqIndex = new AtomicInteger(seqIndex);
        array.stream().takeWhile(q -> finalSeqIndex.get()<sequence.size())
                .forEach(arrElement ->
        {
            if (arrElement.equals(sequence.get(finalSeqIndex.get()))){
                finalSeqIndex.getAndIncrement();
            }
        });


        return finalSeqIndex.get() == sequence.size();
    }

}
