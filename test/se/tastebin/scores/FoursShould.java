package se.tastebin.scores;

import java.util.Arrays;
import java.util.List;
import org.testng.annotations.Test;

import static org.testng.Assert.*;
import se.tastebin.Die;
import se.tastebin.TraditionalDie;

public class FoursShould {

    @Test
    public void returnTheSumOfAllTheFours() {

        Score score = new Fours();

        List<Die> dice = Arrays.asList(
                new TraditionalDie(4),
                new TraditionalDie(4),
                new TraditionalDie(4)
        );

        assertEquals(score.sum(dice), 12);

    }
}