package com.step.assignments;

public class MethodOverloading {

    public static void main(String[] args) {
//        System.out.println(getDurationString(62));
//        System.out.println(getDurationString(-5,6));
//        System.out.println(getDurationString(9,-3));
//        System.out.println(getDurationString(9,64));
//        System.out.println(getDurationString(9,9));
//        System.out.println(getDurationString(61,0));
//        System.out.println(getDurationString(61));
//        System.out.println(getDurationString(3945));
//        System.out.println(calculateArea(3.5));
//        System.out.println(calculateArea(3,4));
        printYearsAndDays(303930393L);
    }

    public static String getDurationString(int minutes, int seconds) {
        if(minutes < 0 || (seconds < 0 || seconds >59)) {
            return "Invalid value";
        }
        int hours = minutes/60;
        int remainingMinutes = minutes%60;

        return hours + "h " + remainingMinutes + "m " + seconds+"s";
    }

    public static String getDurationString(int seconds) {
        if(seconds < 0 ) {
            return "Invalid value";
        }
        int minutes = seconds/60;
        int remainingSeconds = seconds%60;

        String durationString = getDurationString(minutes, remainingSeconds);

        return durationString;
    }

    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double calculateArea(double length, double breadth) {
        return length * breadth;
    }

    public static void printYearsAndDays(long minutes) {
        if(minutes < 0) {
            System.out.println("Invalid value");
        }
        long conversingFactor = 24 * 60;
        int days = (int) (minutes/conversingFactor);
        int years = (days/365);
        int remainingDays = days%365;
        System.out.println(minutes + " min = " + years + " y "+ remainingDays +" d");
    }
}
