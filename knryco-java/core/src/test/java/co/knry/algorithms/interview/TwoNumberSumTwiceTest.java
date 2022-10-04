package co.knry.algorithms.interview;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TwoNumberSumTwiceTest {

    @Test
    void twoNumberSum() {
        var array = new int[]{3, 5, -4, 8, 11, 1, -1, 6, 2, 1, 7};
        var targetSum = 6;

        List result = TwoNumberSumTwice.twoNumberSum(array, targetSum);
        for (int i=0; i<result.size(); i++){
            System.out.println(Arrays.toString((int[]) result.get(i)));
        }


    }
}