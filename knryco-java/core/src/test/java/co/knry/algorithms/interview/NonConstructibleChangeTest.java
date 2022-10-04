package co.knry.algorithms.interview;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class NonConstructibleChangeTest {

    @Test
    void nonConstructibleChange() {
        int[] array = new int []{5, 7, 1, 1, 2, 3, 22};

        System.out.println(NonConstructibleChange.nonConstructibleChange(array));

    }
}