package co.knry.algorithms.hackerrank;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BonAppetitTest {

    @Test
    void bonAppetit() {
        BonAppetit.bonAppetit(List.of(3, 10, 2, 9), 1, 12);

        BonAppetit.bonAppetit(List.of(3, 10, 2, 9), 1, 7);


    }
}