package se.tastebin.sums;

import se.tastebin.scores.Yahtzee;
import se.tastebin.Die;
import se.tastebin.TraditionalDie;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;


public class YahtzeeShould {

    @Test
    public void return50WhenAllDiceHaveTheSameValues() {

        Yahtzee yahtzee = new Yahtzee();

        List<Die> dice = Arrays.asList(
                new TraditionalDie(5),
                new TraditionalDie(5),
                new TraditionalDie(5)
        );

        assertEquals(yahtzee.sum(dice), 50);
    }

    @Test
    public void returnZeroWhenAllNotAllDiceHaveTheSameValues() {

        Yahtzee yahtzee = new Yahtzee();

        List<Die> dice = Arrays.asList(
                new TraditionalDie(5),
                new TraditionalDie(5),
                new TraditionalDie(4)
        );

        assertEquals(yahtzee.sum(dice), 0);
    }

}