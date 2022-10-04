package co.knry.algorithms.interview;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.Assert;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.in;
import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

class GameOfLifeTest {

    @Test
    void simulate() {
        int[][] input =
                {
                        {0,1,0},
                        {0,0,1},
                        {1,1,1},
                        {0,0,0}
                };
        int[][] expected =
                {
                        {0,0,0},
                        {1,0,1},
                        {0,1,1},
                        {0,1,0}
                };


        System.out.println(Arrays.deepToString(input));

        GameOfLife.simulate(input);

        System.out.println(Arrays.deepToString(input));;

        assertArrayEquals(input, expected);

    }
}