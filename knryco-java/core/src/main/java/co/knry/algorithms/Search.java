package co.knry.algorithms;

import java.util.Arrays;

public class Search {

    public double findLargest(double[] arr){

        var max = arr[0];

        for (int i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];

        return max;
    }

    public double findLargestFunctional(double[] arr){
        return Arrays.stream(arr).max().getAsDouble();
    }

    public int findWithIterativeBinarySearch(double[] arr, int target){
        int left = 0;
        int right = arr.length -1;

        while (left <= right){
            int mid = left + (right - left) / 2;

            if (target == arr[mid]) {
                return mid;
            }
            else if (target < arr[mid]) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }

        return -1;
    }

    public int findWithRecursiveBinarySearch(double[] arr, int target, int left, int right){
        if (left > right) {
            return -1;
        }

        int mid = left + (right - left) / 2;

        if (target == arr[mid]) {
            return mid;
        }
        else if (target < arr[mid]) {
            return findWithRecursiveBinarySearch(arr, left, mid - 1, target);
        }
        else {
            return findWithRecursiveBinarySearch(arr, mid + 1, right, target);
        }
    }

}
