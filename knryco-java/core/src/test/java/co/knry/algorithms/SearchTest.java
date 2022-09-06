package co.knry.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchTest {

    @Test
    void findLargest() {
        var search = new Search();

        double arr[] = {10.1, 324, 45, 90, -9808};

        System.out.println(search.findLargest(arr));
    }

    @Test
    void findLargestFunctional() {
        var search = new Search();

        double arr[] = {10.1, 324, 45, 90, -9808};

        System.out.println(search.findLargestFunctional(arr));
    }

    @Test
    void findWithRecursiveBinarySearch(){
        double[] nums = { 2, 5, 6, 8, 9, 10 };
        int target = 5;

        int left = 0;
        int right = nums.length - 1;

        var search = new Search();

        int index = search.findWithRecursiveBinarySearch(nums, target, left, right);

        if (index != -1) {
            System.out.println("Element found at index " + index);
        }
        else {
            System.out.println("Element not found in the array");
        }
    }

    @Test
    void findWithIterativeBinarySearch(){
        double[] nums = { 2, 5, 6, 8, 9, 10 };
        int target = 5;

        var search = new Search();

        int index = search.findWithIterativeBinarySearch(nums, target);

        if (index != -1) {
            System.out.println("Element found at index " + index);
        }
        else {
            System.out.println("Element not found in the array");
        }
    }
}