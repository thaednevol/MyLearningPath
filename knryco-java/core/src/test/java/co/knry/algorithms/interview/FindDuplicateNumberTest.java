package co.knry.algorithms.interview;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindDuplicateNumberTest {

    @Test
    void findDuplicate() {
        var array = new int[]{3, 5, -4, 8, 11, -4, 1, -1, 6, 3};
        System.out.println(FindDuplicateNumber.findDuplicate(array));
    }
}