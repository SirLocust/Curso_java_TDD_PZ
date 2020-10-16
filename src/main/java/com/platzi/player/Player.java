package com.platzi.player;

public class Player {

    private Dice dice;
    private int minNumberToWin;

    public Player(Dice dice, int num) {
        this.dice = dice;
        this.minNumberToWin = num;
    }

    public boolean play() {
        int diceNumber = this.dice.roll();
        return diceNumber > this.minNumberToWin;
    }

}
