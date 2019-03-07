package com.step.assignments;

public class Car extends Vehicle{
    private int gears;
    private int gear;

    public Car(int wheels, int speed, long price, String color, int gears) {
        super(wheels, speed, price, color);
        this.gears = gears;
        this.gear = 1;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    @Override
    public void increaseSpeed() {
        super.setSpeed(super.getSpeed() + 20);
    }

    @Override
    public void decreaseSpeed() {
        super.setSpeed(super.getSpeed() - 20);
    }
}
