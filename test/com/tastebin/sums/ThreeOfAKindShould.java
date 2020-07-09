package com.tastebin.sums;

import com.tastebin.scores.ThreeOfAKind;
import com.tastebin.Die;
import com.tastebin.TraditionalDie;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;
import com.tastebin.scores.Score;


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