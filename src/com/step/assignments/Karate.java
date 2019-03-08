package com.step.assignments;

public class Karate extends MartialArts{

    Karate() {
        super(80, 20);
    }

    @Override
    public void kick() {
        System.out.println("Karate's Power is 700");
    }

    public void punch() {
        System.out.println("Karate's punch power is 500");
    }

    public static void main(String[] args) {
        MartialArts karate = new Karate();
        MartialArts taekwondo = new Taekwondo();
        karate.kick();
        System.out.println(taekwondo instanceof Karate);
        ((Karate) karate).punch();
        taekwondo.kick();
    }
}
