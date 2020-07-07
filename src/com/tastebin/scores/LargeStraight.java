package com.tastebin.scores;

import com.tastebin.Die;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LargeStraight implements Score {

    @Override
    public int score(List<Die> dice) {

        List<Die> sorted =
                dice.stream()
                        .sorted(Comparator.comparingInt(Die::value))
                        .collect(Collectors.toList());

        for (int i = 0; i < sorted.size(); i++) {
            if (sorted.get(i).value() != i+2) {
                return 0;
            }
        }

        return  sorted.stream().mapToInt(d -> d.value()).sum();
    }

}
