package com.step.assignments;

//Implemented this class to explore whether static methods can be overridden or not

public class CricketPlayer extends Player {
    private String role;

    public CricketPlayer(String name, String role) {
        super(name);
        this.role = role;
    }

    public String getRole() {
        return role;
    }


    public static void print() {
        System.out.println("This is static method of CricketPlayer");
    }

    public static void main(String[] args) {
        CricketPlayer cp = new CricketPlayer("Aftab", "Batsman");
        System.out.println(cp.getName());
        CricketPlayer.print();
    }
}
