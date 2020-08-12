package se.tastebin.scores;

import java.util.Arrays;
import java.util.List;
import org.testng.annotations.Test;

import static org.testng.Assert.*;
import se.tastebin.Die;
import se.tastebin.TraditionalDie;

public class SixesShould {

    @Test
    public void returnTheSumOfAllTheSixes() {

        Score score = new Sixes();

        List<Die> dice = Arrays.asList(
                new TraditionalDie(6),
                new TraditionalDie(6),
                new TraditionalDie(5)
        );

        assertEquals(score.sum(dice), 12);

    }
}