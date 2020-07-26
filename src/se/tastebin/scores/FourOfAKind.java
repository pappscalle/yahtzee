package se.tastebin.scores;

import se.tastebin.Die;
import se.tastebin.utils.OccurrencesOfAKind;

import java.util.List;
import java.util.stream.Collectors;

public class FourOfAKind implements Score {

    @Override
    public int sum(List<Die> dice) {

        List<Integer> values = dice.stream()
                .mapToInt(Die::value)
                .boxed()
                .collect(Collectors.toList());

        return new OccurrencesOfAKind(values, 4).value() * 4;

    }


}
