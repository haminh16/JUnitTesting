package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberCheckerTest {

    @Test
    void testAllEven() {
        int[] numbers = {2, 4, 6};

        assertEquals(3, NumberChecker.countEven(numbers));
    }

    @Test
    void testAllOdd() {
        int[] numbers = {1, 3, 5};

        assertEquals(0, NumberChecker.countEven(numbers));
    }

    @Test
    void testMixed() {
        int[] numbers = {1, 2, 3, 4};

        assertEquals(2, NumberChecker.countEven(numbers));
    }

    @Test
    void testEmpty() {
        int[] numbers = {};

        assertEquals(0, NumberChecker.countEven(numbers));
    }
}