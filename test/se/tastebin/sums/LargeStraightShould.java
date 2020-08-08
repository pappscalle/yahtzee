package se.tastebin.sums;

import se.tastebin.scores.LargeStraight;
import se.tastebin.Die;
import se.tastebin.TraditionalDie;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;
import se.tastebin.scores.Score;


public class LargeStraightShould {

    @Test
    public void return20WhenThereIsALargeStraight() {

        Score largeStraight = new LargeStraight();

        List<Die> dice = Arrays.asList(
                new TraditionalDie(3),
                new TraditionalDie(5),
                new TraditionalDie(2),
                new TraditionalDie(6),
                new TraditionalDie(4)
        );

        assertEquals(largeStraight.sum(dice), 20);
    }

    @Test
    public void returnZeroWhenThereIsNoLargeStraight() {

        Score largeStraight = new LargeStraight();

        List<Die> dice = Arrays.asList(
                new TraditionalDie(1),
                new TraditionalDie(2),
                new TraditionalDie(3),
                new TraditionalDie(5),
                new TraditionalDie(4)
        );

        assertEquals(largeStraight.sum(dice), 0);
    }


}