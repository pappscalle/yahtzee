package com.tastebin.sums;

import se.tastebin.scores.FourOfAKind;
import se.tastebin.Die;
import se.tastebin.TraditionalDie;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;
import se.tastebin.scores.Score;


public class FourOfAKindShould {

    @Test
    public void returnTheSumOfFourEqualDice() {

        Score fourOfAKind = new FourOfAKind();

        List<Die> dice = Arrays.asList(
                new TraditionalDie(5),
                new TraditionalDie(4),
                new TraditionalDie(4),
                new TraditionalDie(4),
                new TraditionalDie(4)
        );

        assertEquals(fourOfAKind.sum(dice), 16);
    }

    @Test
    public void returnZeroWhenThereAreNoEqualDice() {

        Score fourOfAKind = new FourOfAKind();

        List<Die> dice = Arrays.asList(
                new TraditionalDie(5),
                new TraditionalDie(4),
                new TraditionalDie(3),
                new TraditionalDie(2),
                new TraditionalDie(1)
        );

        assertEquals(fourOfAKind.sum(dice), 0);
    }

}