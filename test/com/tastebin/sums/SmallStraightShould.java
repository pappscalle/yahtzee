package com.tastebin.sums;

import se.tastebin.scores.SmallStraight;
import se.tastebin.Die;
import se.tastebin.TraditionalDie;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;
import se.tastebin.scores.Score;


public class SmallStraightShould {

    @Test
    public void return15WhenThereIsASmallStraight() {

        Score smallStraight = new SmallStraight();

        List<Die> dice = Arrays.asList(
                new TraditionalDie(1),
                new TraditionalDie(3),
                new TraditionalDie(2),
                new TraditionalDie(5),
                new TraditionalDie(4)
        );

        assertEquals(smallStraight.sum(dice), 15);
    }

    @Test
    public void returnZeroWhenThereIsNoSmallStraight() {

        Score smallStraight = new SmallStraight();

        List<Die> dice = Arrays.asList(
                new TraditionalDie(1),
                new TraditionalDie(2),
                new TraditionalDie(2),
                new TraditionalDie(5),
                new TraditionalDie(4)
        );

        assertEquals(smallStraight.sum(dice), 0);
    }


}