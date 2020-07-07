package com.tastebin.scores;

import com.tastebin.Die;

import java.util.List;

public class Fives implements Score {

    @Override
    public int score(List<Die> dice) {
        return dice.stream().filter(d -> d.value() == 5).mapToInt(d -> d.value()).sum();
    }

}
