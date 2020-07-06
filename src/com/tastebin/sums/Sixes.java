package com.tastebin.sums;

import com.tastebin.Die;

import java.util.List;

public class Sixes implements Sum {

    @Override
    public int sum(List<Die> dice) {
        return dice.stream().filter(d -> d.value() == 6).mapToInt(d -> d.value()).sum();
    }

}
