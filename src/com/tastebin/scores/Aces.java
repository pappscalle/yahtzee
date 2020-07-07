package com.tastebin.scores;

import com.tastebin.Die;

import java.util.List;

public class Aces implements Score {

    @Override
    public int score(List<Die> dice) {
        return dice.stream().filter(d -> d.value() == 1).mapToInt(d -> d.value()).sum();
    }

}
