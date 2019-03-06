package com.step.assignments;

import java.util.Scanner;

public class ReadingUserInputChallenge {

    public static void main(String[] args) {
        System.out.println(findSum());
    }

    public static long findSum() {
        Scanner sc = new Scanner(System.in);
        int numbersRead = 1;
        long sum = 0;
        while(numbersRead <= 10) {
            System.out.println("Enter number #" + numbersRead);
            boolean hasNextInt = sc.hasNextInt();
            if(hasNextInt) {
                sum = sum + (long)sc.nextInt();
                numbersRead++;
            } else {
                System.out.println("Invalid number");
            }
            sc.nextLine();
        }
        sc.close();
        return sum;
    }
}
