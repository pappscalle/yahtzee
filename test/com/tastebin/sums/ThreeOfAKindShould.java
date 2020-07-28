package com.tastebin.sums;

import se.tastebin.scores.ThreeOfAKind;
import se.tastebin.Die;
import se.tastebin.TraditionalDie;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;
import se.tastebin.scores.Score;


public class ThreeOfAKindShould {

    @Test
    public void returnTheSumOfTheTriple() {

        Score threeOfAKind = new ThreeOfAKind();

        List<Die> dice = Arrays.asList(
                new TraditionalDie(5),
                new TraditionalDie(4),
                new TraditionalDie(4),
                new TraditionalDie(5),
                new TraditionalDie(4)
        );

        assertEquals(threeOfAKind.sum(dice), 12);
    }

    @Test
    public void returnZeroWhenThereAreNoEqualDice() {

        Score threeOfAKind = new ThreeOfAKind();

        List<Die> dice = Arrays.asList(
                new TraditionalDie(5),
                new TraditionalDie(4),
                new TraditionalDie(3),
                new TraditionalDie(5),
                new TraditionalDie(4)
        );

        assertEquals(threeOfAKind.sum(dice), 0);
    }


}