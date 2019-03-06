package com.step.assignments;

public class LeapYear {

    public static void main(String[] args) {
	// write your code here
    }

    public static boolean isLeapYear(int year) {
        if(year < 1 || year > 9999) {
            return false;
        }
        if(year%4 == 0 && year%100 != 0) {
            return true;
        }
        return false;
    }
}
