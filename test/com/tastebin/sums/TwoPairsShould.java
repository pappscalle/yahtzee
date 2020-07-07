package com.tastebin.sums;

import com.tastebin.scores.TwoPairs;
import com.tastebin.Die;
import com.tastebin.TraditionalDie;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;
import com.tastebin.scores.Score;


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

        assertEquals(pairs.score(dice), 14);
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

        assertEquals(pairs.score(dice), 0);
    }
}