package com.step.assignments;

public class Vehicle {
    // Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
    // Finally, create another class, a specific type of Car that inherits from the Car class.
    // You should be able to hand steering, changing gears, and moving (speed in other words).
    // You will want to decide where to put the appropriate state and behaviours (fields and methods).
    // As mentioned above, changing gears, increasing/decreasing speed should be included.
    // For you specific type of vehicle you will want to add something specific for that type of car.

    private int wheels;
    private int speed;
    private long price;
    private String color;

    public Vehicle(int wheels, int speed, long price, String color) {
        this.wheels = wheels;
        this.speed = speed;
        this.price = price;
        this.color = color;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public void increaseSpeed() {
        this.speed = this.speed + 10;
    }

    public void decreaseSpeed() {
        this.speed = this.speed - 10;
    }
}
