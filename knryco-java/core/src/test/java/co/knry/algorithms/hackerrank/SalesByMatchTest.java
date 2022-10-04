package co.knry.algorithms.hackerrank;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SalesByMatchTest {

    @Test
    void sockMerchant() {

        List ar = List.of(10, 20, 20, 10, 10, 30, 50, 10, 20);

        int result = SalesByMatch.sockMerchant(ar.size(), ar);

        System.out.println(result);

    }
}