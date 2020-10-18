package se.tastebin.scores;

import se.tastebin.Die;
import se.tastebin.TraditionalDie;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;


public class LargeStraightShould {

    @Test
    public void returnTwentyWhenThereIsALargeStraight() {

        Score score = new LargeStraight();

        List<Die> dice = Arrays.asList(
                new TraditionalDie(3),
                new TraditionalDie(5),
                new TraditionalDie(2),
                new TraditionalDie(6),
                new TraditionalDie(4)
        );

        assertEquals(score.sum(dice), 20);
    }

    @Test
    public void returnZeroWhenThereIsNoLargeStraight() {

        Score score = new LargeStraight();

        List<Die> dice = Arrays.asList(
                new TraditionalDie(1),
                new TraditionalDie(2),
                new TraditionalDie(3),
                new TraditionalDie(5),
                new TraditionalDie(4)
        );

        assertEquals(score.sum(dice), 0);
    }


}