package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberCheckerTest {

    // Statement coverage - Issue #1
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

    // Path coverage - Issue #2
    @Test
    void testPathLoopZeroTimes() {
        int[] numbers = {};
        assertEquals(0, NumberChecker.countEven(numbers));
    }

    @Test
    void testPathIfFalse() {
        int[] numbers = {1};
        assertEquals(0, NumberChecker.countEven(numbers));
    }

    @Test
    void testPathIfTrue() {
        int[] numbers = {2};
        assertEquals(1, NumberChecker.countEven(numbers));
    }

    @Test
    void testPathBothBranches() {
        int[] numbers = {1, 2, 3, 4};
        assertEquals(2, NumberChecker.countEven(numbers));
    }
}