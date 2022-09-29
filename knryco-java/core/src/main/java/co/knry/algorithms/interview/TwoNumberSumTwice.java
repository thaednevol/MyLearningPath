package co.knry.algorithms.interview;

import java.util.*;

public class TwoNumberSumTwice {

    public static List twoNumberSum(int[] array, int targetSum) {
        Set<Integer> nums = new HashSet<>();
        int index = 0;
        List result = new ArrayList<int[]>();

        Arrays.stream(array).forEach(
                number -> {
                    int potentialMatch = targetSum - number;
                    if (nums.contains(potentialMatch)) {
                        nums.remove(potentialMatch);
                        if (result.size() < 2)
                            result.add(new int[]{potentialMatch, number});
                    }
                    else {
                        nums.add(number);
                    }
                }
        );

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        int results = numbers
                .stream()
                .reduce(0, (subtotal, element) -> subtotal + element);


/*
        for (int num: array) {
            int potentialMatch = targetSum -num;
            if (nums.contains(potentialMatch)) {
                nums.remove(potentialMatch);
                result[index] = new int[]{potentialMatch, num};
                index++;
                if (index == 2)
                    return result;
            }
            else {
                nums.add(num);
            }
        }
*/
        return result;
    }

}
