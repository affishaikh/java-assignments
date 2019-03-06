package com.step.assignments;

import java.util.Scanner;

public class ReadingUserInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Your name is "+ name + " and you are " + age + " years old");
    }
}
