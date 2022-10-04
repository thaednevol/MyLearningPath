package co.knry.algorithms.interview;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoNumberSumTest {

    @Test
    void twoNumberSum() {

        var array = new int[]{3, 5, -4, 8, 11, 1, -1, 6};
        var targetSum = 10;

        TwoNumberSum.twoNumberSum(array, targetSum);

    }
}