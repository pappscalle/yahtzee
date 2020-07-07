package com.tastebin.scores;

import com.tastebin.Die;

import java.util.List;

public class Yahtzee implements Score {

    @Override
    public int score(List<Die> dice) {
        return isYahtzee(dice) ? 50 : 0;
    }

    private boolean isYahtzee(List<Die> dice) {
        return  !dice.isEmpty() &&
                dice.stream()
                    .allMatch(d -> dice.get(0).value() == d.value());
    }


}
