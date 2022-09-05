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
}