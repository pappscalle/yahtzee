package com.tastebin.sums;

import com.tastebin.Die;
import com.tastebin.TraditionalDie;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;


public class ChanceShould {

    @Test
    public void returnTheSumOfAllDice() {

        Sum chance = new Chance();

        List<Die> dice = Arrays.asList(
                new TraditionalDie(3),
                new TraditionalDie(5),
                new TraditionalDie(4)
        );

        assertEquals(chance.sum(dice), 12);
    }

}