package com.step.assignments;

import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int average = 0;
        int divisor = 1;
        while (scanner.hasNextInt()) {
            sum = sum + scanner.nextInt();
            average = sum / divisor;
            divisor++;
        }
        scanner.nextLine();
        System.out.println("SUM = " + sum + " AVERAGE = " + average);
    }
}
