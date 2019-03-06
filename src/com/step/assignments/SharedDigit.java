package com.step.assignments;

import java.util.Scanner;

public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 22));
    }

    public static boolean hasSharedDigit(int number1, int number2) {
        boolean result = false;
        if (number1 < 10 || number1 > 99 || number2 < 10 || number2 > 99) {
            return result;
        }

        String[] letters = String.valueOf(number1).split("");
        for (String letter : letters) {
            if (String.valueOf(number2).contains(letter)) {
                result = true;
            }
        }
        return result;
    }

    public static void inputs() {
        Scanner scanner = new Scanner(System.in);
        scanner.hasNextInt();
        System.out.println(scanner.nextInt());
        System.out.println(scanner.nextInt());
        System.out.println(scanner.nextInt());
        System.out.println(scanner.nextInt());
        System.out.println(scanner.nextInt());
        System.out.println(scanner.nextInt());
    }


}
