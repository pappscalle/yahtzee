package com.tastebin.scores;

import com.tastebin.Die;

import java.util.List;

public class Sixes implements Score {

    @Override
    public int score(List<Die> dice) {
        return dice.stream().filter(d -> d.value() == 6).mapToInt(d -> d.value()).sum();
    }

}
