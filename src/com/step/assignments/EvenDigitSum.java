package com.step.assignments;

public class EvenDigitSum {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(1022));
    }

    public static int getEvenDigitSum(int candidateNumber) {
        int sum = 0;
        if(candidateNumber < 0) {
            return -1;
        }
        String numberAsString = String.valueOf(candidateNumber);
        for (int traverser = 0; traverser<numberAsString.length(); traverser++) {
            int number = Integer.parseInt(numberAsString.substring(traverser, traverser+1));
            if(number%2 == 0) {
                sum = sum + number;
            }
        }
        return sum;
    }
}
