package com.tastebin.scores;

import com.tastebin.Die;

import java.util.List;

public class Threes implements Score {

    @Override
    public int sum(List<Die> dice) {
        return dice.stream().filter(d -> d.value() == 3).mapToInt(d -> d.value()).sum();
    }

}
