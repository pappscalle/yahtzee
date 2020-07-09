package com.tastebin.sums;

import com.tastebin.scores.FullHouse;
import com.tastebin.Die;
import com.tastebin.TraditionalDie;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;
import com.tastebin.scores.Score;


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