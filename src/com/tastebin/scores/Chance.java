package com.tastebin.scores;

import com.tastebin.Die;

import java.util.List;

public class Chance implements Score {

    @Override
    public int sum(List<Die> dice) {
        return dice.stream().mapToInt(Die::value).sum();
    }

}
