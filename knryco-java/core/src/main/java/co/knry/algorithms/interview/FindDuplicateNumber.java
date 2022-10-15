package co.knry.algorithms.interview;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateNumber {

    public static int findDuplicate(int [] array){
        /*
        Set<Integer> nums = new HashSet<>();
        for (int num: array) {
            if (nums.contains(num)) {
                return num;
            }
            else {
                nums.add(num);
            }
        }
        return -1;

         */
        for (int i=0; i<array.length; i++){
            int index = Math.abs(array[i]) - 1;
            if (array[index] < 0){
                return Math.abs(array[i]);
            }
            array[index] = -array[index];
        }
        return -1;
    }

}
