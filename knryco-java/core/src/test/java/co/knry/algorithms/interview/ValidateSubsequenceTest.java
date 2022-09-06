package co.knry.algorithms.interview;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class ValidateSubsequenceTest {

    @Test
    void isValidSubsequence() {
        Integer[] array =  new Integer []{5, 1, 22, 25, 6, -1, 8, 10};
        Integer[] sequence = new Integer[] {5, 1, 22, 25, 6, -1, 8, 10, 12};

        List<Integer> arrayList = Arrays.asList(array);
        List<Integer> sequenceList = Arrays.asList(sequence);


        System.out.println(ValidateSubsequence.isValidSubsequence(arrayList, sequenceList));
    }
}