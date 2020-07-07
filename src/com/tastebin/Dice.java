package com.tastebin;

import com.tastebin.scores.Chance;

import java.util.Arrays;
import java.util.List;
import com.tastebin.scores.Score;

public class Dice {

    private final List<Die> dice;

    public Dice(Die ... dice) {
        this(Arrays.asList(dice));
    }

    public Dice(List<Die> dice) {
        this.dice = dice;
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

    public int sum(Score sum) {
        return sum.score(this.dice);
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
