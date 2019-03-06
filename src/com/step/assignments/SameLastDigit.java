package com.step.assignments;

public class SameLastDigit {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(101,10,111));
    }

    public static boolean isValid(int number) {
        return number >= 10 && number <= 1000;
    }

    public static boolean hasSameLastDigit(int number1, int number2, int number3) {
        if (!(isValid(number1) && isValid(number2) && isValid(number3))) {
            return false;
        }

        String numberAsString1 = String.valueOf(number1);
        String lastDigit1 = numberAsString1.substring(numberAsString1.length() - 1);
        String numberAsString2 = String.valueOf(number2);
        String lastDigit2 = numberAsString2.substring(numberAsString2.length() - 1);
        String numberAsString3 = String.valueOf(number3);
        String lastDigit3 = numberAsString3.substring(numberAsString3.length() - 1);

        if (lastDigit1.equals(lastDigit2) || lastDigit1.equals(lastDigit3) || lastDigit2.equals(lastDigit3)) {
            return true;
        }

        return false;
    }
}
