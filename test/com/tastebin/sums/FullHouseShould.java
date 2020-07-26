package com.tastebin.sums;

import se.tastebin.scores.FullHouse;
import se.tastebin.Die;
import se.tastebin.TraditionalDie;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;
import se.tastebin.scores.Score;


public class FullHouseShould {

    @Test
    public void returnTheSumOfFullHouse() {

        Score fullHouse = new FullHouse();

        List<Die> dice = Arrays.asList(
                new TraditionalDie(4),
                new TraditionalDie(4),
                new TraditionalDie(4),
                new TraditionalDie(3),
                new TraditionalDie(3)
        );

        assertEquals(fullHouse.sum(dice), 18);
    }

    @Test
    public void returnZeroWhenNoFullHouse() {

        Score fullHouse = new FullHouse();

        List<Die> dice = Arrays.asList(
                new TraditionalDie(2),
                new TraditionalDie(4),
                new TraditionalDie(4),
                new TraditionalDie(3),
                new TraditionalDie(3)
        );

        assertEquals(fullHouse.sum(dice), 0);
    }
}