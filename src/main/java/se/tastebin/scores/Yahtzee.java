package se.tastebin.scores;

import se.tastebin.Die;

import java.util.List;

public class Yahtzee implements Score {

    @Override
    public int sum(List<Die> dice) {
        return isYahtzee(dice) ? 50 : 0;
    }

    private boolean isYahtzee(List<Die> dice) {
        return  !dice.isEmpty() &&
                dice.stream()
                    .allMatch(d -> dice.get(0).value() == d.value());
    }


}
