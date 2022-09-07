package co.knry.algorithms.interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SumAlgorithm {

    public static int[] sumAlgorithm(int[] array, int target){
        Arrays.sort(array);

        for (int i=0; i<array.length; i++) {
            for (int j = i + 1; j < array.length - 1; j++) {
                for (int k = j + 1; k < array.length - 2; k++) {
                    if ((array[i] + array[j] + array[k]) == target) {
                        return new int[]{array[i], array[j], array[k]};
                    }
                }
            }
        }

        return new int[]{};

    }


    public static int[] sumAlgorithmv2(int[] array, int target){
        Arrays.sort(array);

        for (int i=0; i<array.length; i++) {
            int idxLow = i+1;
            int idxHigh = array.length-1;
            int sum = 0;
            while (idxLow<idxHigh){
                sum = array[i] + array[idxLow] + array [idxHigh];
                if (sum == target){
                    return new int[]{array[i], array[idxLow], array[idxHigh]};
                }
                else if (sum < target) {
                    idxLow++;
                }
                else {
                    idxHigh--;
                }
            }
        }

        return new int[]{};

    }


}
