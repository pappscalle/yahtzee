package com.tastebin.sums;

import com.tastebin.Die;

import java.util.List;

public class Chance implements Sum {

    @Override
    public int sum(List<Die> dice) {
        return dice.stream().mapToInt(Die::value).sum();
    }

}
