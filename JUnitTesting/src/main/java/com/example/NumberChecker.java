package com.example;

public class NumberChecker {

    public static int countEven(int[] numbers) {
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 6};

        System.out.println("So luong so chan: " + countEven(numbers));
    }
}