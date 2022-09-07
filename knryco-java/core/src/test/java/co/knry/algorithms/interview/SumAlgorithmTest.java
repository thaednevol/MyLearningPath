package co.knry.algorithms.interview;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SumAlgorithmTest {

    @Test
    void sumAlgorithm() {
        var array = new int[]{3, 5, -4, 8, 11, 1, -1, 6};
        var targetSum = 2;

        System.out.println(Arrays.toString(SumAlgorithm.sumAlgorithmv2(array, targetSum)));


    }
}