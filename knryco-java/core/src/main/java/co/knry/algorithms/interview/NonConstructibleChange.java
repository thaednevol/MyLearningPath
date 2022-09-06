package co.knry.algorithms.interview;

import java.util.Arrays;

public class NonConstructibleChange {

    public static int nonConstructibleChange(int[] coins) {
        Arrays.sort(coins);

        var sum = 0;

        for (int i = 0; i<coins.length; i++) {
            if (coins[i] > sum +1) {
                return sum + 1;
            }

            sum+=coins[i];
        }

        return -1;
    }

}
