package com.step.assignments;

public class Taekwondo extends MartialArts{
    public Taekwondo() {
        super(20, 80);
    }

    @Override
    public void kick() {
        System.out.println("Taekwondo's power is 1000");
    }
}
