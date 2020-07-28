package com.tastebin.sums;

import se.tastebin.scores.OnePair;
import se.tastebin.Die;
import se.tastebin.TraditionalDie;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;
import se.tastebin.scores.Score;


public class OnePairShould {

    @Test
    public void returnTheSumOfThePair() {

        Score pair = new OnePair();

        List<Die> dice = Arrays.asList(
                new TraditionalDie(5),
                new TraditionalDie(4),
                new TraditionalDie(1),
                new TraditionalDie(4),
                new TraditionalDie(4)
        );

        assertEquals(pair.sum(dice), 8);
    }

    @Test
    public void returnZeroWhenNoPairs() {

        Score pair = new OnePair();

        List<Die> dice = Arrays.asList(
                new TraditionalDie(1),
                new TraditionalDie(2),
                new TraditionalDie(3),
                new TraditionalDie(4),
                new TraditionalDie(5)
        );

        assertEquals(pair.sum(dice), 0);



    }

}