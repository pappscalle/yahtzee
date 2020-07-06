package com.tastebin.sums;

import com.tastebin.Die;
import com.tastebin.TraditionalDie;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;


public class OnePairShould {

    @Test
    public void returnTheSumOfThePair() {

        Sum pair = new OnePair();

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

        Sum pair = new OnePair();

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