package com.step.assignments;

import java.util.Scanner;

public class MinAndMax {

    public static void main(String[] args) {
        printMinAndMax();
    }

    public static void printMinAndMax() {
        Scanner scanner = new Scanner(System.in);
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        System.out.println("Enter numbers:");
        while(scanner.hasNextInt()) {
            long candidateNumber = scanner.nextInt();

            if(max < candidateNumber) {
                max = candidateNumber;
            }
            if(min > candidateNumber) {
                min = candidateNumber;
            }
        }
        System.out.println("Min = "+min +" Max = "+max);
    }
}
