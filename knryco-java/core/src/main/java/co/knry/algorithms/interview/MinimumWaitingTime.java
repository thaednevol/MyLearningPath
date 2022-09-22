package co.knry.algorithms.interview;

import java.util.ArrayList;
import java.util.Arrays;

public class MinimumWaitingTime {

    public static int minimumWaitingTime(int[] queries) {
        // Write your code here.
        Arrays.sort(queries);

        int minimumTime = 0;

        for (int i=0; i< queries.length; i++){
            minimumTime+=queries[i]*(queries.length-(i+1));
        }

        return minimumTime;
    }


}
