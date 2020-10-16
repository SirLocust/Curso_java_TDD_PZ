package com.platzi.player;

import java.util.Random;

public class Dice {
    private int sides;

    public Dice(int side) {
        this.sides = side;
    }

    public int roll() {
        return new Random().nextInt(sides);
    }
}
