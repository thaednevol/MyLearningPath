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

}
