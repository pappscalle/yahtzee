package se.tastebin.scores;

import java.util.Arrays;
import java.util.List;
import org.testng.annotations.Test;

import static org.testng.Assert.*;
import se.tastebin.Die;
import se.tastebin.TraditionalDie;

public class FivesShould {

    @Test
    public void returnTheSumOfAllTheFives() {

        Score score = new Fives();

        List<Die> dice = Arrays.asList(
                new TraditionalDie(5),
                new TraditionalDie(1),
                new TraditionalDie(5)
        );

        assertEquals(score.sum(dice), 10);

    }
}