package co.knry.algorithms.interview;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SortedSquaredArrayTest {

    @Test
    void sortedSquaredArray() {
        int[] array = new int []{-7, -3, 1, 9, 22, 30};

        System.out.println(Arrays.toString(SortedSquaredArray.sortedSquaredArray(array)));

    }
}