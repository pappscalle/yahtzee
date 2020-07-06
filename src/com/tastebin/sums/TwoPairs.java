package com.tastebin.sums;

import com.tastebin.Die;
import com.tastebin.utils.OccurrencesOfAKind;

import java.util.List;
import java.util.stream.Collectors;

public class TwoPairs implements Sum {

    @Override
    public int sum(List<Die> dice) {

        List<Integer> values = dice.stream()
                        .mapToInt(Die::value)
                        .boxed()
                        .collect(Collectors.toList());

        int first = new OccurrencesOfAKind(values, 2).value();

        List<Integer> filtered = dice.stream()
                .mapToInt(Die::value)
                .filter(p -> p != first)
                .boxed()
                .collect(Collectors.toList());

        int second = new OccurrencesOfAKind(filtered, 2).value();

        return ((first > 0) && (second > 0)) ? (first * 2 + second * 2) : 0;
    }


}
