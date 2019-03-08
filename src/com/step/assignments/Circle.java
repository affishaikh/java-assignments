package com.step.assignments;

public class Circle {
    public double radius;

    public Circle(double radius) {
        if (radius < 0) {
            radius = 0;
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        return;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(2.0);
        System.out.println(c1.getRadius());
    }
}
