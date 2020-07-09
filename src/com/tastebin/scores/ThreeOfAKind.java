package com.tastebin.scores;

import com.tastebin.Die;
import com.tastebin.utils.OccurrencesOfAKind;

import java.util.List;
import java.util.stream.Collectors;

public class ThreeOfAKind implements Score {

    @Override
    public int sum(List<Die> dice) {

        List<Integer> values = dice.stream()
                .mapToInt(Die::value)
                .boxed()
                .collect(Collectors.toList());

        return new OccurrencesOfAKind(values, 3).value() * 3;
    }


}
