package com.step.assignments;

public class FirstAndLastDigitSum {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(102));
    }

    public static int sumFirstAndLastDigit(int candidateNumber) {
        
        if(candidateNumber < 10 && candidateNumber >= 0) {
            return candidateNumber;
        }
        if(candidateNumber < 0) {
            return -1;
        }
        Integer number = candidateNumber;
        String numberAsString = number.toString();
        int firstNumber = Integer.parseInt(numberAsString.substring(0,1));
        int lastNumber = Integer.parseInt(numberAsString.substring(numberAsString.length()-1));
        return firstNumber + lastNumber;
    }
}
