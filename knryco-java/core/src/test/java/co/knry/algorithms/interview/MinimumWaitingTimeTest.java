package co.knry.algorithms.interview;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumWaitingTimeTest {

    @Test
    void minimumWaitingTime() {
        int[] queries = new int[] {3, 2, 1, 2, 6};
        int expected = 17;
        var actual = MinimumWaitingTime.minimumWaitingTime(queries);
        assertTrue(actual == expected);

    }
}