package com.tastebin;

import com.tastebin.sums.Chance;
import com.tastebin.sums.Sum;

import java.util.Arrays;
import java.util.List;

public class Dice {

    private final List<Die> dice;
    private Sum sum;

    public Dice(Die ... dice) {
        this(Arrays.asList(dice));
    }

    public Dice(List<Die> dice) {
        this(dice, new Chance());
    }

    public Dice(List<Die> dice, Sum sum) {
        this.dice = dice;
        this.sum = sum;
    }

    public void roll() {
       dice.forEach(d -> d.roll());
    }

    public void hold(int index) {
        dice.get(index).hold();
    }

    public void release(int index) {
        dice.get(index).release();
    }

    public void releaseAll() {
        dice.forEach(die -> die.release());
    }

    public void setSum(Sum sum) {
        this.sum = sum;
    }

    public int sum() {
        return sum.sum(this.dice);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        int counter = 1;
        for (Die d: dice) {
            result
              .append(counter++)
              .append(":")
              .append(d)
              .append("   ");
        }
        return result.toString();
    }
}
