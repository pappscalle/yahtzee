package com.tastebin.sums;

import com.tastebin.Die;

import java.util.List;

public class Fours implements Sum {

    @Override
    public int sum(List<Die> dice) {
        return dice.stream().filter(d -> d.value() == 4).mapToInt(d -> d.value()).sum();
    }

}
