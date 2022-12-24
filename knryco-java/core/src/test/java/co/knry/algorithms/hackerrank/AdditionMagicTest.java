package co.knry.algorithms.hackerrank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdditionMagicTest {

    @Test
    void add() {
        AdditionMagic additionMagic = new AdditionMagic();
        assertEquals("1hello", additionMagic.add(1, "hello"));
    }

    @Test
    void testAdd() {
        AdditionMagic additionMagic = new AdditionMagic();
        assertEquals("7.0", additionMagic.add(3.0, 4.0));
    }

    @Test
    void testAdd1() {
        AdditionMagic additionMagic = new AdditionMagic();
        assertEquals("hello,world", additionMagic.add("hello,", "world"));
    }
}