package com.tastebin.sums;

import com.tastebin.Die;
import com.tastebin.utils.OccurrencesOfAKind;

import java.util.List;
import java.util.stream.Collectors;

public class FourOfAKind implements Sum {

    @Override
    public int sum(List<Die> dice) {

        List<Integer> values = dice.stream()
                .mapToInt(Die::value)
                .boxed()
                .collect(Collectors.toList());

        return new OccurrencesOfAKind(values, 4).value() * 4;

    }


}
