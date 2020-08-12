package se.tastebin.scores;

import se.tastebin.Die;
import se.tastebin.TraditionalDie;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;


public class TwoPairsShould {

    @Test
    public void returnTheSumOfTheTwoPairs() {

        Score score = new TwoPairs();

        List<Die> dice = Arrays.asList(
                new TraditionalDie(5),
                new TraditionalDie(4),
                new TraditionalDie(4),
                new TraditionalDie(3),
                new TraditionalDie(3)
        );

        assertEquals(score.sum(dice), 14);
    }

    @Test
    public void returnZeroWhenNoTwoPairs() {

        Score score = new TwoPairs();

        List<Die> dice = Arrays.asList(
                new TraditionalDie(5),
                new TraditionalDie(4),
                new TraditionalDie(3),
                new TraditionalDie(2),
                new TraditionalDie(1)
        );

        assertEquals(score.sum(dice), 0);
    }
}