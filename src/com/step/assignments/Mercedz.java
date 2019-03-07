package com.step.assignments;

public class Mercedz extends Car {

    private boolean hasABS;

    public Mercedz(int wheels, int speed, long price, String color, int gears, boolean hasABS) {
        super(wheels, speed, price, color, gears);
        this.hasABS = hasABS;
    }

    public boolean isHasABS() {
        return hasABS;
    }

    public void setHasABS(boolean hasABS) {
        this.hasABS = hasABS;
    }
}
