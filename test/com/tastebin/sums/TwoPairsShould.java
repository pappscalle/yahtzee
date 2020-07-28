package com.tastebin.sums;

import se.tastebin.scores.TwoPairs;
import se.tastebin.Die;
import se.tastebin.TraditionalDie;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;
import se.tastebin.scores.Score;


public class TwoPairsShould {

    @Test
    public void returnTheSumOfTheTwoPairs() {

        Score pairs = new TwoPairs();

        List<Die> dice = Arrays.asList(
                new TraditionalDie(5),
                new TraditionalDie(4),
                new TraditionalDie(4),
                new TraditionalDie(3),
                new TraditionalDie(3)
        );

        assertEquals(pairs.sum(dice), 14);
    }

    @Test
    public void returnZeroWhenNoTwoPairs() {

        Score pairs = new TwoPairs();

        List<Die> dice = Arrays.asList(
                new TraditionalDie(5),
                new TraditionalDie(4),
                new TraditionalDie(3),
                new TraditionalDie(2),
                new TraditionalDie(1)
        );

        assertEquals(pairs.sum(dice), 0);
    }
}