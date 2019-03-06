package com.step.assignments;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindromeNumber(121));
    }

    public static boolean isPalindromeNumber(long candidateNumber) {
        long reverseNumber = 0;
        long dividend = candidateNumber;
        while(dividend > 0) {
            int remainder = (int) dividend%10;
            reverseNumber = reverseNumber * 10 + (long) remainder;
            dividend = dividend/10;
        }
        return reverseNumber == candidateNumber;
    }
}
