package se.tastebin.scores;

import se.tastebin.Die;
import se.tastebin.TraditionalDie;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;


public class FullHouseShould {

    @Test
    public void returnTheSumOfFullHouse() {

        Score score = new FullHouse();

        List<Die> dice = Arrays.asList(
                new TraditionalDie(4),
                new TraditionalDie(4),
                new TraditionalDie(4),
                new TraditionalDie(3),
                new TraditionalDie(3)
        );

        assertEquals(score.sum(dice), 18);
    }

    @Test
    public void returnZeroWhenNoFullHouse() {

        Score score = new FullHouse();

        List<Die> dice = Arrays.asList(
                new TraditionalDie(2),
                new TraditionalDie(4),
                new TraditionalDie(4),
                new TraditionalDie(3),
                new TraditionalDie(3)
        );

        assertEquals(score.sum(dice), 0);
    }
}