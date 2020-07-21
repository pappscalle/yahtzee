package com.tastebin;

public class Player {

    private final int id;
    private final String name;
    private final Dice dice;

    public Player(int id, String name, Dice dice) {
        this.id = id;
        this.name = name;
        this.dice = dice;
    }
    
    public Dice dice() {
        return dice;
    }
}

