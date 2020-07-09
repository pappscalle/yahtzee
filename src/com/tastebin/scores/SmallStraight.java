package com.tastebin.scores;

import com.tastebin.Die;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SmallStraight implements Score {

    @Override
    public int sum(List<Die> dice) {

        List<Die> sorted =
                dice.stream()
                        .sorted(Comparator.comparingInt(Die::value))
                        .collect(Collectors.toList());

        for (int i=0; i< sorted.size(); i++) {
            if (sorted.get(i).value() != i+1) {
                return 0;
            }
        }

        return  sorted.stream().mapToInt(Die::value).sum();
    }

}
