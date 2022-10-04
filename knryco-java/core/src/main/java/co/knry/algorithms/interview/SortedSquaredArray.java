package co.knry.algorithms.interview;

import java.util.Arrays;

public class SortedSquaredArray {

    public static int[] sortedSquaredArray(int[] array) {
        int[] result = new int[array.length];

        int smallerValueIdx = 0;
        int largerValueIdx = array.length -1;

        for (int idx = array.length-1; idx>=0; idx--){
            int smallerValue = array[smallerValueIdx];
            int largerValue = array[largerValueIdx];

            if (Math.abs(smallerValue)>Math.abs(largerValue)) {
                result[idx] = smallerValue * smallerValue;
                smallerValueIdx++;
            }
            else {
                result[idx] = largerValue * largerValue;
                largerValueIdx--;
            }
        }

        return result;
    }



}
