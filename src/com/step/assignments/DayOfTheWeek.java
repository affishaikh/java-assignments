package com.step.assignments;

public class DayOfTheWeek {

    public static void main(String[] args) {
        byte day = 0;
	    printDayOfTheWeek(day);
    }

    public static void printDayOfTheWeek(byte day) {
        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            default:
                System.out.println("Saturday");
        }
    }
}
