package com.tastebin.sums;

import se.tastebin.scores.Chance;
import se.tastebin.Die;
import se.tastebin.TraditionalDie;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;
import se.tastebin.scores.Score;


public class ChanceShould {

    @Test
    public void returnTheSumOfAllDice() {

        Score chance = new Chance();

        List<Die> dice = Arrays.asList(
                new TraditionalDie(3),
                new TraditionalDie(5),
                new TraditionalDie(4)
        );

        assertEquals(chance.sum(dice), 12);
    }

}